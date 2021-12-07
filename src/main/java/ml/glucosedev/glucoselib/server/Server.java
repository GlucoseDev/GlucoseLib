package ml.glucosedev.glucoselib.server;

import ml.glucosedev.glucoselib.command.CommandManager;
import net.minecraft.server.MinecraftServer;
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
     * Get Minecraft Server
     *
     * @return MinecraftServer
     */
    @NotNull
    MinecraftServer getMinecraftServer();

}
