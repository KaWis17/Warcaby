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
        model = new SpecificModel(new ClassicRules());
        controller.setModel(model);
        this.controller = controller;
        run();
    }

    @Override
    public void run() {
        try (ServerSocket ss = new ServerSocket(0)) {
            controller.setPort(ss.getLocalPort());
            System.out.println("Port number: " + ss.getLocalPort());
            while (true) {
                Socket client = ss.accept();

                RequestHandler rh = new RequestHandler(client);
                rh.start();
                System.out.println("A client has connected!");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
