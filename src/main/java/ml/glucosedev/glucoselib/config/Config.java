package ml.glucosedev.glucoselib.config;

// TODO
public @interface Config {
    String path() default "plugin_config.properties";
    boolean copyDefault() default true;
}
