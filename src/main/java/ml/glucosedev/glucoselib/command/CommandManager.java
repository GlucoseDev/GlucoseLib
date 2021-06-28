package ml.glucosedev.glucoselib.command;

import org.jetbrains.annotations.NotNull;

public interface CommandManager {
    /**
     * Register a command
     *
     * @param command Command to register
     */
    @NotNull
    void registerCommand(@NotNull Command command);

    /**
     * Unregister all commands in a plugin
     */
    void unregisterAllCommands();
}
