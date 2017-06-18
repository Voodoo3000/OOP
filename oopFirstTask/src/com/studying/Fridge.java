package com.studying;

/**
 * Created by VladislavYTsa on 15.06.2017.
 */
public class Fridge extends HouseholdElectronic {

    public Fridge(boolean onOff) {
        this.onOff = onOff;
    }

    String name = "Fridge";
    double amp = 1.5;
    int volt = 220;
}
