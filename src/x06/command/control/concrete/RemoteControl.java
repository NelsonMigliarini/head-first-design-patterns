package x06.command.control.concrete;

import java.util.LinkedList;
import java.util.Queue;

import x06.command.controllables.Command;
import x06.command.controllables.functional.NoCommand;

/**
 * @author Nelson Migliarini
 */
public class RemoteControl {

	private Command[] commands;
	private Queue<Command> undoCommand = new LinkedList<>();

	public RemoteControl() {
		commands = new Command[5];
		Command noCommand = new NoCommand();
		for(int i = 0; i < commands.length; i++)
			commands[i] = noCommand;
	}

	public void setCommand(int slot, Command command) {
		commands[slot] = command;
	}

	public void buttonWasPushed(int slot) {
		commands[slot].execute();
		undoCommand.add(commands[slot]);
	}
	
	public void undoButtonWasPushed() {
		if(!undoCommand.isEmpty())
			undoCommand.poll().undo();
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("\n------ Remote Control ------\n");
		for(int i = 0; i < commands.length; i++)
			string.append(String.format("[slot %s] %s %n", i, commands[i].getClass().getName()));
		return string.toString();
	}
}
