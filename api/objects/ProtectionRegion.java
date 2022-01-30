package com.alant7_.magika.factions.api.objects;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ProtectionRegion {

    int getX();

    int getY();

    List<ProtectionBlock> getProtectionBlocks();

    @NotNull ProtectionRegion[] getNeighbors();

}
