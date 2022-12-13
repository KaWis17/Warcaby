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
                    TextField field = (TextField)view.download(1).download(3);
                    ((JFrame)view).dispose();
                    setView(gameFrame = new GameFrame());
                  new Server(this);

                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }

                    Client.initConnection(port);

                  model.initialOperation(field.getName());


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
