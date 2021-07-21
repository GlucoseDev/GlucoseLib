package ml.glucosedev.glucoselib;

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
