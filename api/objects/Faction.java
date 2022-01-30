package com.alant7_.magika.factions.api.objects;

import com.alant7_.util.sorting.Sortable;
import io.lumine.xikage.mythicmobs.mobs.ActiveMob;
import io.lumine.xikage.mythicmobs.mobs.MythicMob;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface Faction extends Government, Sortable {

    boolean getFlag(@NotNull FactionFlag flag);

    void setFlag(@NotNull FactionFlag flag, boolean toggle);

    boolean isOnline();

    void invitePlayer(@NotNull Player player);

    void cancelInvitation(@NotNull Player player);

    void cancelInvitation(@NotNull String name);

    boolean isPlayerInvited(@NotNull Player player);

    void addPlayer(@NotNull UUID uuid);

    void addPlayer(@NotNull Player player);

    boolean hasMember(@NotNull UUID player);

    boolean hasMember(@NotNull Player player);

    @Nullable FactionMember getMember(@NotNull UUID player);

    @Nullable FactionMember getMember(@NotNull Player player);

    void kickPlayer(@NotNull UUID uuid);

    @Nullable FactionMember getLeader();

    void setLeader(@NotNull UUID uuid);

    boolean isLeader(@NotNull UUID uuid);

    boolean isLeader(@NotNull Player player);

    boolean hasNation();

    @Nullable Nation getNation();

    void setNation(@Nullable Nation nation);

    @NotNull ProtectionBlock[] getTerritoryBlocks();

    @Nullable SettlementBlock getSettlementBlock();

    boolean isTerritoryBlock(@NotNull Block block);

    boolean isSettlementBlock(@NotNull Block block);

    void setSettlementBlock(@NotNull Block location);

    void removeSettlementBlock();

    void setProtectionBlock(@NotNull Location location);

    void removeProtectionBlock(@NotNull Location location);

    boolean isProtected(@NotNull Location location);

    @Nullable Location getFactionHome();

    boolean hasFactionHome();

    void setFactionHome(@NotNull Location location);

    void unsetFactionHome();

    int getTier();

    int getManaLevel();

    double getBankBalance();

    void setBankBalance(double money);

    void depositMoney(double amount);

    void withdrawMoney(double amount);

    default boolean hasLeader() {
        return true;
    }

    @NotNull FactionMember[] getOfflineMembers();

    @NotNull Faction[] getAlliedFactions();

    @NotNull Faction[] getRequestedAllies();

    boolean hasActiveRaid();

    @Nullable ActiveMob getActiveProtector();

    void spawnProtector(@NotNull MythicMob mob);

    boolean hasRequestedAlly(@NotNull Faction faction);

    void sendAllyRequest(@NotNull Faction faction);

    void cancelAllyRequest(@NotNull Faction faction);

    void setAlliance(@NotNull Faction faction);

    boolean isAlly(@NotNull Faction faction);

    void removeAlliance(@NotNull Faction faction);

    boolean isDisbanded();

    void disband();

}
