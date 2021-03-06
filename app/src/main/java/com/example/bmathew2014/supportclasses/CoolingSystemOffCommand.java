package com.example.bmathew2014.supportclasses;
public class CoolingSystemOffCommand implements Command {
    private CoolingSystem coolingSystem;

    public CoolingSystemOffCommand(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    @Override
    public void execute() {
        coolingSystem.off();
    }

}
