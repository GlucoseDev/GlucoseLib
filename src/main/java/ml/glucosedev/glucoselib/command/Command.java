package ml.glucosedev.glucoselib.command;

/**
 * Command interface
 *
 * <code>
 * \@Command(
 *  name = "My Command",
 *  aliases = { "mycommand", "mycmd" },
 *  permission = "mypermission.mycommand",
 *  description = "Silly example command",
 *  usage = "/mycommand",
 *  )
 *  public void myCommand({@link CommandCaller} caller) {
 *      caller.send("Hello!");
 *  }
 *  </code>
 */
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
    /**
     * Command usage
     *
     * @return Command usage
     */
    String usage();
}
