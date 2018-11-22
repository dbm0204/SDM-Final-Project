package com.example.bmathew2014.supportclasses;
public class LightOnCommand implements  Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
