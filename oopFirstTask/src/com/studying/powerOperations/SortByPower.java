package com.studying.powerOperations;

import com.studying.appliances.AppliancesList;
import com.studying.appliances.HouseholdElectronic;

/**
 * Created by VladislavYTsa on 26.06.2017.
 */
public class SortByPower {

    public void sorting(AppliancesList appliancesList, double minPower, double maxPower) {
        for (HouseholdElectronic i : appliancesList.getAs())
            if (i.getPower() > minPower && i.getPower() <= maxPower) {
                System.out.println("Suitable consumption power: " + i);
            }
    }
}