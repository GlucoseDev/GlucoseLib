package ml.glucosedev.glucoselib.command;

/**
 * Command Common
 *
 * @author Findlay Richardson (SlimeDiamond)
 */
public class GlucoseCommand {
    public final Command meta;
    public final CommandContext context;

    public GlucoseCommand(Command meta, CommandContext context) {
        this.meta = meta;
        this.context = context;
    }
    boolean parseCommand(CommandCaller caller, String[] args) {
        //return caller.hasPermission(meta.permission());
        // TODO: Command permissions & permission handler
        return true; // GLUCOSE: TEMPORARY
    }
}
