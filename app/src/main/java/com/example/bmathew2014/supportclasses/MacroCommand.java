package com.example.bmathew2014.supportclasses;
public class MacroCommand implements Command {
	Command[] commands;
 
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
 
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}
}

