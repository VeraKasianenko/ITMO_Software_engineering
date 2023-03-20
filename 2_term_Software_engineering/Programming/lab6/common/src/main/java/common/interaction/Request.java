package common.interaction;

import java.io.Serializable;

public class Request implements Serializable {
    private final String commandName;
    private final String commandStringArgument;
    private final Serializable commandObjectArgument;

    public Request(String commandName, String commandStringArgument, Serializable commandObjectArgument) {
        this.commandName = commandName;
        this.commandStringArgument = commandStringArgument;
        this.commandObjectArgument = commandObjectArgument;
    }

    public Request(String commandName, String commandStringArgument) {
        this(commandName, commandStringArgument, null);
    }

    public Request() {
        this("","");
    }

    public String getCommandName() {
        return commandName;
    }


    public String getCommandStringArgument() {
        return commandStringArgument;
    }

    public Object getCommandObjectArgument() {
        return commandObjectArgument;
    }

    public boolean isEmpty() {
        return commandName.isEmpty() && commandStringArgument.isEmpty() && commandObjectArgument == null;
    }

    @Override
    public String toString() {
        return "Request[" + commandName + ", " + commandStringArgument + ", " + commandObjectArgument + "]";
    }
}
