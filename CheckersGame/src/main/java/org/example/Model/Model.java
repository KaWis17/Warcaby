package org.example.Model;

import org.example.View.View;

public abstract class Model {
    //variables from design pattern
    View[] Observers;

    //model specific variables


    //methods from design pattern
    public void addObserver(View view){}
    public void removeObserver(View view){}
    public void myNotify(){}

    //model specific methods
    public abstract void modelOperation1();
}
