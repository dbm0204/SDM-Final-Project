package com.example.bmathew2014.supportclasses;
public class HomeSecurityCallPoliceCommand implements Command {
    private HomeSecurity homeSecurity;

    public HomeSecurityCallPoliceCommand(HomeSecurity homeSecurity) {
        this.homeSecurity = homeSecurity;
    }

    @Override
    public void execute() {
        homeSecurity.call();
    }
}
