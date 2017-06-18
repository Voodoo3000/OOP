package com.studying;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class TV extends HouseholdElectronic {

    public TV(boolean onOff) {
        this.onOff = onOff;
    }

    String name = "TV";
    double amp = 2;
    int volt = 110;
}
