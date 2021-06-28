package ml.glucosedev.glucoselib.plugin;

public @interface Plugin {
    /**
     * The name of the plugin
     *
     * @return Plugin name
     */
    String name();
    /**
     * Author of the plugin
     *
     * @return Plugin author
     */
    String author();
    /**
     * Plugin description
     *
     * @return Plugin description
     */
    String description();
    /**
     * Plugin version
     *
     * @return Plugin version
     */
    String version();
    /**
     * Native version
     *
     * @return Plugin native version
     */
    String nativeVersion();
    /*
    @Plugin(
            name = "Example",
            author = "Example",
            description = "Example"
            version = "1.0.0-SNAPSHOT",
            nativeVersion = "1.16.5"
    )
    */
}
