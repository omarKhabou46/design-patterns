package com.springRevision;

import com.springRevision.context.Context;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Context context = new Context();
        context.effectuerOperation();

        System.out.println('\n');
        context.setStrategy(new StrategyImpl1());
        context.effectuerOperation();
    }
}
