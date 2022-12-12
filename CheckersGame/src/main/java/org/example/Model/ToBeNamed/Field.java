package org.example.Model.ToBeNamed;

import org.example.Model.state;

public class Field {
    boolean isWhite;
    org.example.Model.state state;

    public Field(boolean isWhite,state state) {
        this.isWhite = isWhite;
        this.state = state;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public state getState() {
        return state;
    }

    public void setState(state state) {
        this.state = state;
    }

}
