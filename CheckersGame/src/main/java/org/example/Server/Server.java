package org.example.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
private static Integer count;

public static void main(String[] args) {
    Integer portNum = 0;
    count = 0;

    try (ServerSocket ss = new ServerSocket(portNum)) {
        System.out.println("Port number: "+ss.getLocalPort());
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

public static void printCount() {
    System.out.println("Number of successfully calculated math equations: " + (++count));
}
}
