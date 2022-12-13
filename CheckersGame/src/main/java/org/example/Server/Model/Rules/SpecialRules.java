package org.example.Server.Model.Rules;

import org.example.Server.Model.state;

public class SpecialRules implements GameRules{
@Override
public state calcInitFieldState(int i, int j) {
    return state.EMPTY;
}
}
