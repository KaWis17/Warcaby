package org.example;

public abstract class Model {
    View[] Observers;

    public void addObserver(View view){}
    public void removeObserver(View view){}

    //public void notify(){
    public abstract void modelOperation1();
}
