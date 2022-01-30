package com.alant7_.magika.factions.api.objects;

import java.util.UUID;

public interface FactionMember {

    UUID getIdentifier();

    String getName();

    boolean isOnline();

    boolean hasPermission(String permission);

    void showProtectionBorder();

    void hideProtectionBorder();

    boolean isProtectionBorderVisible();

}
