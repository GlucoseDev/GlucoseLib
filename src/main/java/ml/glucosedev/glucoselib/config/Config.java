package ml.glucosedev.glucoselib.config;

public @interface Config {
    String path() default "plugin_config.properties";
    boolean copyDefault() default true;
}
