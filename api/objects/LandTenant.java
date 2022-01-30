package com.alant7_.magika.factions.api.objects;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface LandTenant {

    @NotNull UUID getIdentifier();

    @NotNull ProtectionBlock getLand();

    double getRentPrice();

    void setRentPrice(double amount);

    void kick();

}
