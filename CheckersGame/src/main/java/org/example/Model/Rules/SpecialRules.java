package org.example.Model.Rules;

import org.example.Model.state;

public class SpecialRules implements GameRules{
@Override
public state calcInitFieldState(int i, int j) {
    return state.EMPTY;
}
}
