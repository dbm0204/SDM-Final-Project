package com.example.bmathew2014.supportclasses;
public class FireAlarmOnCommand implements Command{
    private FireAlarm fireAlarm;

    public FireAlarmOnCommand(FireAlarm fireAlarm) {
        this.fireAlarm = fireAlarm;
    }

    @Override
    public void execute() {
        fireAlarm.on();
    }
}
