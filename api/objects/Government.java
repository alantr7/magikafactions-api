package com.alant7_.magika.factions.api.objects;

import com.alant7_.magika.factions.main.Main;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.UUID;

public interface Government {

    @NotNull
    UUID getIdentifier();

    @NotNull
    String getName();

    void setName(@NotNull String name);

    @Nullable
    String getDescription();

    boolean hasDescription();

    void setDescription(@Nullable String description);

    void removeDescription();

    double getBankBalance();

    void setBankBalance(double money);

    void depositMoney(double amount);

    void withdrawMoney(double amount);

    boolean hasMember(@NotNull UUID player);

    boolean hasMember(@NotNull Player player);

    @NotNull
    FactionMember[] getMembers();

    @NotNull
    FactionMember[] getOnlineMembers();

    void broadcast(@NotNull String message);

    void broadcastExcluding(@NotNull String message, FactionMember... exclusions);

    void save();

}
