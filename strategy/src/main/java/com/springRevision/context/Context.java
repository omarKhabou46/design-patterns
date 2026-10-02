package com.springRevision.context;

import com.springRevision.DefaultStrategyImpl;
import com.springRevision.Strategy;

public class Context {
    private Strategy strategy = new DefaultStrategyImpl();

    public void effectuerOperation() {
        System.out.println("............... START ................");
        strategy.effectuerOp();
        System.out.println("............... END ................");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
