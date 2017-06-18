package com.studying;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class Router extends HouseholdElectronic {

    public Router(boolean onOff) {
        this.onOff = onOff;
    }

    String name = "Internet router";
    double amp = 1.5;
    int volt = 50;
}
