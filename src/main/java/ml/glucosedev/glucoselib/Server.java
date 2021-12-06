package ml.glucosedev.glucoselib;

import ml.glucosedev.glucoselib.command.CommandManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;

public interface Server {
    /**
     * Gets the Minecraft version
     *
     * @return Minecraft version
     */
    @NotNull
    String getMcVersion();

    /**
     * Get plugins directory
     *
     * @return Plugins directory
     */
    @NotNull
    Path pluginDir();

    /**
     * Get command manager
     *
     * @return Glucose Command Manager
     */
    @Nullable
    CommandManager commandManager();

    /**
     * Get Glucose Server version
     *
     * @return Glucose version
     */
    @NotNull
    String glucoseVersion();
}
