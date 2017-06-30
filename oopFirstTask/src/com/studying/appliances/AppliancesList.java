package com.studying.appliances;

import com.studying.electronic.Fridge;
import com.studying.electronic.PC;
import com.studying.electronic.Router;
import com.studying.electronic.TV;

/**
 * Created by Voodoo3000 on 22.06.2017.
 */

public class AppliancesList{

    private PC pc;
    private TV tv;
    private Router router;
    private Fridge fridge;

    public AppliancesList(PC pc, TV tv, Router router, Fridge fridge) {
        this.pc = pc;
        this.tv = tv;
        this.router = router;
        this.fridge = fridge;
    }

    HouseholdElectronic[] as = new HouseholdElectronic[]{pc, tv, router, fridge};

    public HouseholdElectronic[] getAs() {
        return as;
    }
}
