package org.example.Model.ToBeNamed;

import org.example.Model.Rules.GameRules;

public class Board{
    Field[][] fields =new Field[8][8];

    public Board(GameRules rules) {
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                fields[i][j]=new Field(calcColor(i, j), rules.calcInitFieldState(i,j));
            }
        }
    }

    private static boolean calcColor(int i, int j) {
        return (j + i) % 2 != 0;
    }

}
