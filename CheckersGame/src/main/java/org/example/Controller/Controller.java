package org.example.Controller;

import org.example.Model.Model;
import org.example.View.View;

public abstract class Controller {

    private View view;
    private Model model;

    public void setModel(Model model){
        this.model = model;
    }

    public void setView(View view){
        this.view = view;
    }

    public abstract void userAction1();
}
