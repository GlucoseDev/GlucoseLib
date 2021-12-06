package ml.glucosedev.glucoselib.command;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class CommandManager {
    public static HashMap<String, CommandExecutor> cmds = new HashMap<>();
    /**
     * Register a command
     *
     * @param commandExecutor CommandExecutor to register
     * @param alias Alias for command
     */
    public static void registerCommand(@NotNull CommandExecutor commandExecutor, String alias) {
        cmds.put(alias, commandExecutor);
    }

    /**
     * Unregister all commands in a plugin (TODO)
     */
    static void unregisterAllCommands() {} // TODO
}
