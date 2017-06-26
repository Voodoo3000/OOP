package com.studying.appliances;

import com.studying.electronic.Fridge;
import com.studying.electronic.PC;
import com.studying.electronic.Router;
import com.studying.electronic.TV;

/**
 * Created by Voodoo3000 on 22.06.2017.
 */

public class AppliancesList{

private HouseholdElectronic as [] = new HouseholdElectronic[]{};

public AppliancesList(PC pc, TV tv, Router router, Fridge fridge) {

    this.as = new HouseholdElectronic[]{pc, tv, router, fridge};
    }

 HouseholdElectronic[] as = new HouseholdElectronic[]{pc, tv, router, fridge};

 public HouseholdElectronic[] getAs() {
        return as;
    }
}
