package com.studying.electronic;

import com.studying.appliances.HouseholdElectronic;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class PC extends HouseholdElectronic {

    private int cpuGhz = 4;
    private String gpu = "GTX1080 8Gb";

    @Override
    public String toString() {
        return "Desktop computer " +
                getModelName() + "; CPU "
                + this.cpuGhz + "Ghz; " +
                "GPU " + this.gpu +
                "; consumption power: " + getPower() + "W, " +
                "on: " + isOnOff() +
                '}' + super.toString();
    }
}
