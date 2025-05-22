package de.srendi.advancedperipherals.common.addons.lightmanscurrency;

import dan200.computercraft.api.ComputerCraftAPI;
//import io.github.lightman314.lightmanscurrency.common.menus.traderstorage.core.TradeRulesTab;

public class Integration implements Runnable {

    @Override
    public void run() {
        ComputerCraftAPI.registerGenericSource(new TraderIntegration());
    }
}
