package com.alant7_.magika.factions.api;

import com.alant7_.magika.factions.api.objects.Faction;
import com.alant7_.magika.factions.api.objects.Nation;
import com.alant7_.magika.factions.api.objects.ProtectionBlock;
import com.alant7_.magika.factions.api.objects.SettlementBlock;
import com.alant7_.magika.factions.main.Main;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface FactionsAPI {

    static @NotNull Faction createFaction(@NotNull String name, @NotNull Player leader) {
        return Main.getPlugin().getDataSource().createFaction(name, leader);
    }

    static @NotNull Nation createNation(@NotNull String name, @NotNull Player leader) {
        return Main.getPlugin().getDataSource().createNation(name, leader);
    }

    static @Nullable Faction getFaction(@NotNull UUID uuid) {
        return Main.getPlugin().getDataSource().getFaction(uuid);
    }

    static @Nullable Faction getFaction(@NotNull String name) {
        return Main.getPlugin().getDataSource().getFaction(name);
    }

    static @Nullable Faction getFactionByMember(@NotNull Player player) {
        return Main.getPlugin().getDataSource().getFactionByMember(player);
    }

    static @Nullable Faction getFactionByMember(@NotNull UUID uuid) {
        return Main.getPlugin().getDataSource().getFactionByMember(uuid);
    }

    static boolean isLocationProtected(@NotNull Location location) {
        return getLandOwner(location) != null;
    }

    static @Nullable Faction getLandOwner(@NotNull Location location) {
        return Main.getPlugin().getDataSource().getLandOwner(location);
    }

    static @Nullable ProtectionBlock getProtectionBlockAt(@NotNull Location location) {
        return Main.getPlugin().getDataSource().getProtectionBlockAt(location);
    }

    static @Nullable SettlementBlock getSettlementBlockAt(@NotNull Block block) {
        return Main.getPlugin().getDataSource().getSettlementBlockAt(block.getLocation());
    }

}
