package com.studying.Electronic;

import com.studying.Appliances.HouseholdElectronic;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class Router extends HouseholdElectronic {

    int linkSpeed = 1300;
    String vlanfeature = "4 VLAN";

    public Router(String modelName,boolean onOff, double power) {
        this.onOff = onOff;
        this.power = power;
        this.modelName = modelName;
    }
    @Override
    public String toString() {
        return "Network router " +
                modelName + "; 802.11ac "
                + this.linkSpeed + "Mbit/s; " +
                "Features " + this.vlanfeature +
                "; consumption power: " + power + "W, " +
                "on: " + onOff +
                '}' + super.toString();
    }
}
