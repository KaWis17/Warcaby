package org.example.Server.Model.Rules;

import org.example.Server.Model.state;

public class ClassicRules implements GameRules{
@Override
public state calcInitFieldState(int i, int j) {
    return state.EMPTY;
}
}
