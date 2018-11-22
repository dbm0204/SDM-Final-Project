package com.example.bmathew2014.supportclasses;
public class HomeSecurityOpenDoorsCommand implements Command {
    HomeSecurity security;

    public HomeSecurityOpenDoorsCommand(HomeSecurity security) {
        this.security = security;
    }

    @Override
    public void execute() {
        security.OpenDoors();
    }
}
