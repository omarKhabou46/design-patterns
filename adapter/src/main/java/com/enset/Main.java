package com.enset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Computer computer = new Computer();
        DataShow dataShow = new DataShow();
        computer.setVga(dataShow);
        computer.afficher();
    }
}
