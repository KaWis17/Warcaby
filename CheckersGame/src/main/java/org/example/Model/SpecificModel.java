package org.example.Model;

import org.example.Model.Rules.GameRules;
import org.example.Model.ToBeNamed.Board;

public class SpecificModel extends Model {

public SpecificModel(GameRules rules) {
    super(rules);
    board = new Board(rules);
}

public void modelOperation1(){}
}
