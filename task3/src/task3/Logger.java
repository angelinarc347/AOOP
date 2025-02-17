package task3;
import java.util.*;

public class Logger {
	private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void processCommands() {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            iterator.next().execute("Processing log command", LogLevel.INFO);  
        }

}
}
