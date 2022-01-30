package com.alant7_.magika.factions.api.objects;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface Nation extends Government {

    void addFaction(@NotNull Faction faction);

    boolean hasFaction(@NotNull Faction faction);

    boolean hasFaction(@NotNull UUID uuid);

    void kickFaction(@NotNull Faction faction);

    void kickFaction(@NotNull UUID uuid);

    @NotNull Faction[] getFactions();

}
