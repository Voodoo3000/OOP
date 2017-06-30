package com.studying.electronics;

import com.studying.appliances.HouseholdElectronic;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class Fridge extends HouseholdElectronic {

    private int capacity = 560;

    @Override
    public String toString() {
        return "Refridgerator " +
                getModelName() + "; Capacity "
                + this.capacity + "Litres " +
                "; consumption power: " + getPower() + "W, " +
                "on: " + isOnOff() + super.toString();
    }
}
