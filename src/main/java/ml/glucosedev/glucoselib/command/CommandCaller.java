package ml.glucosedev.glucoselib.command;

public interface CommandCaller {
    /**
     * Send the caller a message
     *
     * @param msg The message to send
     */
    void send(String msg);
    /**
     * Send with some arguments
     *
     * @param msg The message to send
     * @param param Optional args
     */
    void send(String msg, Object... param);
    /**
     * If the command caller has the command permission
     *
     * @return Has permission --> boolean true/false
     */
    boolean hasPermission(String permission);
    /**
     * Is it a player
     *
     * @return if the caller is a player
     */
    boolean isPlayer();
}
