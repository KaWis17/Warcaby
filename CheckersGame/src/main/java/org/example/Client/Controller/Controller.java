package org.example.Client.Controller;

import org.example.Server.Model.Model;
import org.example.Client.View.View;

public abstract class Controller {

    protected View view;
    private Model model;

    public void setModel(Model model){
        this.model = model;
    }

    public void setView(View view){
        this.view = view;
    }

    public abstract void userAction1();
}
