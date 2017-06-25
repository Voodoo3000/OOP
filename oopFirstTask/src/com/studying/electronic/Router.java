package com.studying.electronic;

import com.studying.appliances.HouseholdElectronic;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class Router extends HouseholdElectronic {

    private int linkSpeed = 1300;
    private String vlanfeature = "4 VLAN";

    @Override
    public String toString() {
        return "Network router " +
                getModelName() + "; 802.11ac "
                + this.linkSpeed + "Mbit/s; " +
                "Features " + this.vlanfeature +
                "; consumption power: " + getPower() + "W, " +
                "on: " + isOnOff() +
                '}' + super.toString();
    }
}
