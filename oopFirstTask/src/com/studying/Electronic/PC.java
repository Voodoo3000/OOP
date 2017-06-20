package com.studying.Electronic;

import com.studying.Appliances.HouseholdElectronic;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class PC extends HouseholdElectronic {

    int cpuGhz = 4;
    String gpu = "GTX1080 8Gb";

    public PC(String modelName,boolean onOff, double power) {
        this.onOff = onOff;
        this.power = power;
        this.modelName = modelName;
    }
    @Override
    public String toString() {
        return "Desktop computer " +
                modelName + "; CPU "
                + this.cpuGhz + "Ghz; " +
                "GPU " + this.gpu +
                "; consumption power: " + power + "W, " +
                "on: " + onOff +
                '}' + super.toString();
    }
}
