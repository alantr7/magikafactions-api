package com.alant7_.magika.factions.api.objects;

import org.jetbrains.annotations.NotNull;

public class FactionFlag {

    private final String identifier;

    private final boolean defaultValue;

    FactionFlag(String identifier, boolean defaultValue) {
        this.identifier = identifier;
        this.defaultValue = defaultValue;
    }

    public String getIdentifier() {
        return identifier;
    }

    public boolean isDefaultValue() {
        return defaultValue;
    }

}
