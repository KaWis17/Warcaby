package org.example.Server.Model;

import org.example.Client.View.GameWindow.GameFrame;
import org.example.Client.View.GameWindow.GamePanel;
import org.example.Client.View.GameWindow.Stats.StatsPanel;
import org.example.Client.View.View;
import org.example.Server.Model.Rules.GameRules;
import org.example.Server.Model.ToBeNamed.Board;
import org.example.Server.Model.ToBeNamed.Player;
import org.example.Server.Server;

import java.util.ArrayList;

public class SpecificModel extends Model {
    Player player1;
    Player player2;
    public int port;

    public SpecificModel(GameRules rules, View view) {
        super(rules);
        board = new Board(rules);
        observers=new ArrayList<>();
        addObserver(view);
    }

    @Override
    public void myNotify(){
        for(View view: observers){
            GameFrame view1 = ((GameFrame)view);
            view1.changePortInfo(port);
        }
    }

    @Override
    public void initialOperation(String playerOneName){
        player1 = new Player(playerOneName);
        player2 = new Player("");
        myNotify();
    }

}
