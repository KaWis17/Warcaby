package org.example.Client.Controller;

import javax.swing.JFrame;
import org.example.Client.Client;
import org.example.Client.View.GameMenu.TextField;
import org.example.Client.View.GameWindow.GameFrame;
import org.example.Server.Server;

public class SpecificController extends Controller {

    GameFrame gameFrame;
    int port;
    @Override
    public void userAction1() {
      //Initializing game
        view.download(1).download(1).addAction(
                e -> {
                  System.out.println("1");
                    TextField field = (TextField)view.download(1).download(3);
                  System.out.println("2");

                  new Server(this).start();

                  System.out.println("3");
                  Client.initConnection(port);
                  System.out.println("4");

                  model.initialOperation(field.getName());
                  System.out.println("5");

                  ((JFrame)view).dispose();
                  System.out.println("6");
                  setView(gameFrame = new GameFrame());
                }
        );

        //Joining game
        view.download(1).download(2).addAction(
                e -> System.out.println("DOŁĄCZONO DO GRY")
        );
    }

    @Override
    public void setPort(int port){
      this.port = port;
    }
}
