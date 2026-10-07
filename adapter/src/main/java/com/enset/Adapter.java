package com.enset;

public class Adapter extends Tv implements Vga {

    @Override
    public void show() {
        sh();
    }
}
