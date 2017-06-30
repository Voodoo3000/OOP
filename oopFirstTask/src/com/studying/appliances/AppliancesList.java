package com.studying.appliances;

import com.studying.electronics.Fridge;
import com.studying.electronics.PC;
import com.studying.electronics.Router;
import com.studying.electronics.TV;

/**
 * Created by VladislavYTsa on 22.06.2017.
 */
public class AppliancesList{

    private HouseholdElectronic as [] = new HouseholdElectronic[]{};

    public AppliancesList(PC pc, TV tv, Router router, Fridge fridge) {

        this.as = new HouseholdElectronic[]{pc, tv, router, fridge};
    }
    public HouseholdElectronic[] getAs() {
        return as;
    }
}