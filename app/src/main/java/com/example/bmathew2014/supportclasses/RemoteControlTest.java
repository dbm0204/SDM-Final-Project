package com.example.bmathew2014.supportclasses;
public class RemoteControlTest {
    public static void main(String args[]){
        /*
        Instantsiating Light, homeSecuritySystem, projector and remoteControl
         */
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        HomeSecurity homeSecuritySystem = new HomeSecurity();
        FireAlarm fireAlarm = new FireAlarm();
        CoolingSystem coolingSystem= new CoolingSystem();
        GarageDoor garageDoor = new GarageDoor();
        MusicSystem musicSystem = new MusicSystem("Justin Biber");
        Television television = new Television();

        //Implementing function for Light on Command
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();

        //Implementing function for Light off Command
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(lightOffCommand);
        remoteControl.buttonWasPressed();


        //Implementing function for HomeSecuritySystem Dropdown  Command
        HomeSecurityOpenDoorsCommand homeSecurityOpenDoorsCommand = new HomeSecurityOpenDoorsCommand(homeSecuritySystem);
        remoteControl.setCommand(homeSecurityOpenDoorsCommand);
        remoteControl.buttonWasPressed();

        //Implementing function for HomeSecuritySystem raise command
        HomeSecurityLockDoorsCommand homeSecurityLockDoorsCommand = new HomeSecurityLockDoorsCommand(homeSecuritySystem);
        remoteControl.setCommand(homeSecurityLockDoorsCommand);
        remoteControl.buttonWasPressed();


        //Implementing function for Home Security Call command
        HomeSecurityCallPoliceCommand homeSecurityCallPoliceCommand = new HomeSecurityCallPoliceCommand(homeSecuritySystem);
        remoteControl.setCommand(homeSecurityCallPoliceCommand);
        remoteControl.buttonWasPressed();

        // Implementing functiona call for Energy consumption
        System.out.println("STATUS:Executing Energy Consumption Check");
        EnergyConsumption energyConsumption = new EnergyConsumption(coolingSystem,fireAlarm,garageDoor,
                                                                    homeSecuritySystem,light,musicSystem,television);
        remoteControl.setCommand(energyConsumption);
        remoteControl.buttonWasPressed();
    }
}
