package com.springRevision;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void effectuerOp() {
        System.out.println("operation effectuer par default");
    }
}
