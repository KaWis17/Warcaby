package org.example.Server.Model;

import org.example.Server.Model.Rules.GameRules;
import org.example.Server.Model.ToBeNamed.Board;
import org.example.Client.View.View;

import java.util.ArrayList;

public abstract class Model {
    //variables from design pattern
    ArrayList<View> observers;

    //model specific variables
    GameRules rules;
    Board board;

    //methods from design pattern
    public void addObserver(View view) {
        observers.add(view);
    }
    public void removeObserver(View view) {
        observers.remove(view);
    }
    public void myNotify() {

    }

    //model specific methods
    public Model(GameRules rules){
        this.rules=rules;
    }
    public abstract void initialOperation(String playerOneName);

}

