package com.example.bmathew2014.supportclasses;
public class TelevisionOffCommand implements Command {
    private Television television;

    public TelevisionOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();

    }
}
