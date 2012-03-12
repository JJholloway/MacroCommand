package code;

import java.util.ArrayList;

public class MacroCommand implements Command {
	private ArrayList<Command> commands = new ArrayList<Command>();

	public void add(Command cmd) {
		this.commands.add(cmd); // optional 
	}

	@Override
	public void execute() {
		for(int i=0;i<commands.size();i++){
			commands.get(i).execute();
		}
	}
}
