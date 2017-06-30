package com.studying.powerOperations;

import com.studying.appliances.AppliancesList;
import com.studying.appliances.HouseholdElectronic;

/**
 * Created by VladislavYTsa on 27.06.2017.
 */
public class PowerCalc {

    public void powerSum(AppliancesList appliancesList, double sum) {
        for (HouseholdElectronic i : appliancesList.getAs()) {
            if (i.isOnOff()) {
                sum = sum + i.getPower();
            }
        }
        System.out.println("Running devices summary consumption power: " + sum + "W");
    }
}