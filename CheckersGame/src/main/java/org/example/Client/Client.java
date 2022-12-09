package org.example.Client;

import org.example.Controller.Controller;
import org.example.Controller.SpecificController;
import org.example.Model.Model;
import org.example.Model.SpecificModel;
import org.example.View.CompositeView;
import org.example.View.View;

import java.io.*;
import java.net.Socket;

public class Client {
private static ObjectInputStream in;
private static ObjectOutputStream out;

public static void main(String[] args) {
    String hostName = args[0];
    Integer port = Integer.parseInt(args[1]);
    System.out.println("Host: " + hostName + " Port: " + port);
    try {
        Socket s1 = new Socket(hostName, port);
        out = new ObjectOutputStream(s1.getOutputStream());
        in = new ObjectInputStream(s1.getInputStream());
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Could not connect. Check the hostname and port.");
        System.exit(0);
    }

    //Driver
    View compositeView = new CompositeView();
    Model model = new SpecificModel();
    Controller controller = new SpecificController();

    controller.setModel(model);
    controller.setView(compositeView);
    //controller.addObserver(compositeView);
    //compositeView.init();
}

/****************************************************
 * Sends Message of Move to Server to be Validated
 * @param m1
 ****************************************************/

public static void sendMsg(Object m1) {
    try {
        out.writeObject(m1);
        out.flush();
        out.reset();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

/**************************************************************
 * Receives message from Server For ClientAdapter to Process
 * @return
 **************************************************************/

public Object receiveMsg(){
    Object m1 = null;
    try {
        m1 = in.readObject();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    return m1;
}
}
