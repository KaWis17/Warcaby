package org.example.Server.Model;

import org.example.Server.Model.Rules.GameRules;
import org.example.Server.Model.ToBeNamed.Board;

public class SpecificModel extends Model {

public SpecificModel(GameRules rules) {
    super(rules);
    board = new Board(rules);
}

public void modelOperation1(){}
}
