package de.srendi.advancedperipherals.common.addons.lightmanscurrency;


import dan200.computercraft.api.lua.LuaFunction;
import de.srendi.advancedperipherals.AdvancedPeripherals;
import de.srendi.advancedperipherals.lib.peripherals.APGenericPeripheral;

import org.jetbrains.annotations.NotNull;

public class TraderIntegration implements APGenericPeripheral {
    @NotNull
    @Override
    public String getPeripheralType() {
        return "trading_terminal";
    }

    @LuaFunction(mainThread = true)
    public final boolean isReal() {
        AdvancedPeripherals.debug("Method isReal() was called.");
        return true;
    }

}
