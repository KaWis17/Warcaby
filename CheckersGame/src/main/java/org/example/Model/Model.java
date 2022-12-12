package org.example.Model;

import org.example.Model.Rules.GameRules;
import org.example.Model.ToBeNamed.Board;
import org.example.View.View;

public abstract class Model {
    //variables from design pattern
    View[] Observers;

    //model specific variables
    GameRules rules;
    Board board;

    //methods from design pattern
    public void addObserver(View view){}
    public void removeObserver(View view){}
    public void myNotify(){}

    //model specific methods
    public Model(GameRules rules){
        this.rules=rules;
    }
    public abstract void modelOperation1();
}

