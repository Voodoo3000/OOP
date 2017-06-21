package com.studying.Electronic;

import com.studying.Appliances.HouseholdElectronic;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class TV extends HouseholdElectronic {

    private int diagSize = 75;
    private String dispResol = "4K HDR";

    @Override
    public String toString() {
        return "TV " +
                getModelName() + "; Diag "
                + this.diagSize + "inch; " +
                "Resolution picture " + this.dispResol +
                "; consumption power: " + getPower() + "W, " +
                "on: " + isOnOff() +
                '}' + super.toString();
    }
}
