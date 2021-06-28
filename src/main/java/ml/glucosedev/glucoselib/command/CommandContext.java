package ml.glucosedev.glucoselib.command;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CommandContext {
    @NotNull
    CommandCaller getCaller();

    @NotNull
    String[] aliases();

    @Nullable
    String[] getArgs();
}
