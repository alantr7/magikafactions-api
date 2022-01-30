package com.alant7_.magika.factions.api.objects;

import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;

public interface SettlementBlock extends ProtectionBlock {

    @NotNull Faction getFaction();

    @NotNull Location getLocation();

}
