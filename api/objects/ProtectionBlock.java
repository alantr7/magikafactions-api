package com.alant7_.magika.factions.api.objects;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface ProtectionBlock {

    @NotNull String getIdentifier();

    @NotNull Faction getFaction();

    @NotNull Location getLocation();

    boolean isProtected(@NotNull Location location);

    boolean isBorder(@NotNull Location location);

    boolean isAreaCorner(@NotNull Location location);

    int getHorizontalRange();

    int getVerticalRange();

    @NotNull LandTenant addTenant(@NotNull UUID identifier);

    @NotNull LandTenant addTenant(@NotNull Player player);

    boolean hasTenant(@NotNull UUID identifier);

    boolean hasTenant(@NotNull Player player);

    boolean hasTenants();

    @NotNull LandTenant[] getTenants();

    void kickTenant(@NotNull UUID identifier);

    void kickTenant(@NotNull LandTenant tenant);

    @NotNull ProtectionBlock[] getNeighborBlocks();

}
