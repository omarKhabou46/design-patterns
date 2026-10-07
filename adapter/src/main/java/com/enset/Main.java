package com.enset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Computer computer = new Computer();
        DataShow dataShow = new DataShow();
        computer.setVga(dataShow);
        computer.afficher();

        System.out.println("\n\n");

        Tv tv = new Tv();
        Adapter adapter = new Adapter();
        adapter.setHdmi(tv);
        computer.setVga(adapter);
        computer.afficher();
    }
}
