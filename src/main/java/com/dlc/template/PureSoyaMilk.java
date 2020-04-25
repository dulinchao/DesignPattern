package com.dlc.template;

public class PureSoyaMilk extends SoyaMilk {
    protected void add() {

    }

    @Override
    boolean customWantCondiments() {
        return false;
    }
}
