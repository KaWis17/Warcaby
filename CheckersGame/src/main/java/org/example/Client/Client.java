package org.example.Client;

import org.example.Client.Controller.Controller;
import org.example.Client.Controller.SpecificController;
import org.example.Client.View.GameMenu.MenuFrame;
import org.example.Client.View.View;

import java.io.*;
import java.net.Socket;

public class Client {
private static ObjectInputStream in;
private static ObjectOutputStream out;

public static void main(String[] args) {

    //Driver
    View view = new MenuFrame();
    Controller controller = new SpecificController();
    controller.setView(view);

    controller.userAction1();

    //controller.addObserver(compositeView);
    //compositeView.init();
}

/****************************************************
 * Sends Message of Move to Server to be Validated
 * @param
 ****************************************************/

public static void initConnection(int port){
    System.out.println("Host: localhost, Port: " + port);
    try {
        Socket s1 = new Socket("localhost", port);
        out = new ObjectOutputStream(s1.getOutputStream());
        in = new ObjectInputStream(s1.getInputStream());
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Could not connect. Check the hostname and port.");
        System.exit(0);
    }
}

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
