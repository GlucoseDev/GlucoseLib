package ml.glucosedev.glucoselib.event;

public interface EventManager {
    /**
     * Register an event
     * @param listener The listener
     */
    void registerEvent(Object listener);
}
