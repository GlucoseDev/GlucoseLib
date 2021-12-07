package ml.glucosedev.glucoselib.logging;

public interface Logger {
    /**
     * Log to console
     *
     * @param message Message to send
     */
    void info(String message);

    /**
     * Log warning to console
     *
     * @param message Message to send
     */
    void warn(String message);

    /**
     * Log error to console
     *
     * @param message Message to send
     */
    void error(String message);
}
