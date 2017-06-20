package com.studying.Electronic;

import com.studying.Appliances.HouseholdElectronic;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class TV extends HouseholdElectronic {

    int diagSize = 75;
    String dispResol = "4K HDR";

    public TV(String modelName,boolean onOff, double power) {
        this.onOff = onOff;
        this.power = power;
        this.modelName = modelName;
    }
    @Override
    public String toString() {
        return "TV " +
                modelName + "; Diag "
                + this.diagSize + "inch; " +
                "Resolution picture " + this.dispResol +
                "; consumption power: " + power + "W, " +
                "on: " + onOff +
                '}' + super.toString();
    }
}
