package ml.glucosedev.glucoselib.command;

public @interface Command {
    /**
     * Command name
     *
     * @return Command name
     */
    String name();

    /**
     * Command aliases
     *
     * @return Command aliases
     */
    String[] aliases();

    /**
     * Command permission
     *
     * @return Command permission
     */
    String permission();

    /**
     * Command description
     *
     * @return Command description
     */
    String description();
}