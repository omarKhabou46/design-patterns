package com.enset;

public class Adapter implements Vga {

    private Hdmi hdmi;

    @Override
    public void show() {
        hdmi.sh();
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
