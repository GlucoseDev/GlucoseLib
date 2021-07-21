package ml.glucosedev.glucoselib;

import ml.glucosedev.glucoselib.command.CommandManager;
import ml.glucosedev.glucoselib.event.EventManager;

public interface Glucose {
    /**
     * Get event manager
     *
     * @return EventManager
     */
    EventManager getEventManager();

    /**
     * Get server
     *
     * @return Server
     */
    Server getServer();

    /**
     * Get command manager
     *
     * @return CommandManager
     */
    CommandManager getCommandManager();

    /**
     * Get logger
     *
     * @return Logger
     */
    Logger getLogger();
}
