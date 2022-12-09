package org.example;

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
