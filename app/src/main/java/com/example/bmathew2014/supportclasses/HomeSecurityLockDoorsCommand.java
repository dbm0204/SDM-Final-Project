package com.example.bmathew2014.supportclasses;
public class HomeSecurityLockDoorsCommand implements Command {
    private HomeSecurity homeSecurity;

    public HomeSecurityLockDoorsCommand(HomeSecurity homeSecurity) {
        this.homeSecurity = homeSecurity;
    }

    @Override
    public void execute() {
        homeSecurity.LockDoors();

    }
}
