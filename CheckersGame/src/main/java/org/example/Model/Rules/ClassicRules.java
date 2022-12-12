package org.example.Model.Rules;

import org.example.Model.state;

public class ClassicRules implements GameRules{
@Override
public state calcInitFieldState(int i, int j) {
    return state.EMPTY;
}
}
