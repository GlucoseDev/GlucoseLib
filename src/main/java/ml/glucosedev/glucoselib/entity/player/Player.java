package ml.glucosedev.glucoselib.entity.player;

public interface Player {
    /**
     * Player's username
     * @return player username
     */
    String getName();

    /**
     * Player's UUID
     * @return player uuid
     */
    String getUUID();

    /**
     * Send a message to the player
     * @param message message to send
     */
    void send(String message);
}
