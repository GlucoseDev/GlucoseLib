package ml.glucosedev.glucoselib.event;

import ml.glucosedev.glucoselib.entity.player.Player;

/**
 * Player join event
 * @author SlimeDiamond
 */
public interface PlayerJoinEvent extends Event {
    /**
     * The player
     * @return player
     *
     * <pre>
     *     player.getPlayer();
     * </pre>
     */
    Player getPlayer();
}
