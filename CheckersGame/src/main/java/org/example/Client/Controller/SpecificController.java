package org.example.Client.Controller;

import org.example.Client.Client;
import org.example.Client.View.GameMenu.TextField;

public class SpecificController extends Controller {

    @Override
    public void userAction1() {
        view.download(1).download(1).addAction(
                e -> {
                    TextField field = (TextField)view.download(1).download(3);
                    Client.initConnection(field.getName());
                }
        );

        view.download(1).download(2).addAction(
                e -> System.out.println("DOŁĄCZONO DO GRY")
        );
    }
}
