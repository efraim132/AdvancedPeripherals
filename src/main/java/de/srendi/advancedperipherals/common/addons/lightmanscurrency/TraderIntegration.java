package de.srendi.advancedperipherals.common.addons.lightmanscurrency;

import lightmanscurrency.api.traders.TraderAPI; // TODO: Need to fine the proper import for Trader API and if its even the right one
import com.lightmanscurrency.common.trades.Trade; //TODO: Replace with the actual import for Trade
import com.lightmanscurrency.common.trades.TradeManager;
import dan200.computercraft.api.lua.LuaFunction;
import de.srendi.advancedperipherals.lib.peripherals.APGenericPeripheral;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TraderIntegration implements APGenericPeripheral {

    @NotNull
    @Override
    public String getPeripheralType() {
        return "lightmans_currency_trader";
    }



    @LuaFunction(mainThread = true)
    public final List<Map<String, Object>> getTrades() {
        List<Trade> trades = TradeManager.getAllTrades(); // Replace with the actual method to fetch trades
        List<Map<String, Object>> tradeList = new ArrayList<>();

        for (Trade trade : trades) {
            Map<String, Object> tradeData = new HashMap<>();
            tradeData.put("id", trade.getId());
            tradeData.put("input", trade.getInput().toString());
            tradeData.put("output", trade.getOutput().toString());
            tradeData.put("price", trade.getPrice().toString());
            tradeList.add(tradeData);
        }

        return tradeList;
    }
}