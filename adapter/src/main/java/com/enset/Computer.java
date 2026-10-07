package com.enset;

public class Computer {
    private  Vga vga;

    public void afficher() {
        System.out.println(" -------------------  computer ------------------");
        vga.show();
        System.out.println(" -------------------  computer ------------------");

    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
