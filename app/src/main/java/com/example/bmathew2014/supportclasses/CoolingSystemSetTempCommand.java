package com.example.bmathew2014.supportclasses;

public class CoolingSystemSetTempCommand implements Command {
    private CoolingSystem coolingSystem;

    public CoolingSystemSetTempCommand(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }
    @Override
    public void execute() {
        //TODO: Implement setting temperature of the cooling System

    }
}
