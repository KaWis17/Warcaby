package org.example.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import org.example.Client.Controller.Controller;
import org.example.Client.Controller.SpecificController;
import org.example.Server.Model.Model;
import org.example.Server.Model.Rules.ClassicRules;
import org.example.Server.Model.SpecificModel;

public class Server extends Thread {

    Model model;
    Controller controller;

    public Server(Controller controller) {
        model = new SpecificModel(new ClassicRules(), controller.getView());
        controller.setModel(model);
        this.controller = controller;
        start();
    }

    @Override
    public void run() {
        try (ServerSocket ss = new ServerSocket(0)) {
            controller.setPort(ss.getLocalPort());
            System.out.println("Server:   Port number: " + ss.getLocalPort());
            ((SpecificModel)model).port = ss.getLocalPort();
            while (true) {
                Socket client = ss.accept();

                RequestHandler rh = new RequestHandler(client);
                rh.start();
                System.out.println("Server:   A client has connected!");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
