package com.studying.Electronic;

import com.studying.Appliances.HouseholdElectronic;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class Fridge extends HouseholdElectronic {

    int capacity = 560;

    public Fridge(String modelName, boolean onOff, double power) {
        this.onOff = onOff;
        this.power = power;
        this.modelName = modelName;
    }
    @Override
    public String toString() {
        return "Refridgerator " +
                modelName + "; Capacity "
                + this.capacity + "Litres " +
                "; consumption power: " + power + "W, " +
                "on: " + onOff +
                '}' + super.toString();
    }
}
