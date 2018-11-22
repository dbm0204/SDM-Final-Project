package com.example.bmathew2014.supportclasses;
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command) {
        this.slot = command;

    }
    public void buttonWasPressed(){
        slot.execute();

    }
}
