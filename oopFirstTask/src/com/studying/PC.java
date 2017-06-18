package com.studying;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class PC extends HouseholdElectronic {

    public PC(boolean onOff) {
        this.onOff = onOff;
    }

    String name = "Desktop PC";
    double amp = 2.5;
    int volt = 220;
}
