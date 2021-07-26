package ml.glucosedev.glucoselib.entity;

import ml.glucosedev.glucoselib.GameMode;

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

    /**
     * Change player gamemode
     *
     * @param gamemode Gamemode to change to
     */
    void changeGameMode(GameMode gamemode);
}
