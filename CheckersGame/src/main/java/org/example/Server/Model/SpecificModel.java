package org.example.Server.Model;

import org.example.Server.Model.Rules.GameRules;
import org.example.Server.Model.ToBeNamed.Board;
import org.example.Server.Model.ToBeNamed.Player;

public class SpecificModel extends Model {
    Player player1;
    Player player2;

    public SpecificModel(GameRules rules) {
        super(rules);
        board = new Board(rules);
    }

    @Override
    public void initialOperation(String playerOneName){
    player1 = new Player(playerOneName);
    player2 = new Player("");
    }

}
