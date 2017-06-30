package com.studying.launcher;

import com.studying.appliances.AppliancesList;
import com.studying.powerOperations.PowerCalc;
import com.studying.powerOperations.SortByPower;
import com.studying.electronics.Fridge;
import com.studying.electronics.PC;
import com.studying.electronics.Router;
import com.studying.electronics.TV;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        PC pc = new PC();
        pc.setModelName("ROG G20CB");
        pc.setOnOff(true);
        pc.setPower(500);
        TV tv = new TV();
        tv.setModelName("Sony XE94");
        tv.setOnOff(true);
        tv.setPower(240);
        Router router = new Router();
        router.setModelName("HP R120");
        router.setOnOff(true);
        router.setPower(50);
        Fridge fridge = new Fridge();
        fridge.setModelName("Bosch KDD74AL20N");
        fridge.setOnOff(false);
        fridge.setPower(150);

        AppliancesList appliancesList = new AppliancesList(pc, tv, router, fridge);
        Arrays.sort(appliancesList.getAs());

        SortByPower sortByPower = new SortByPower();
        sortByPower.sorting(appliancesList,100d,500d);

        PowerCalc powerCalc = new PowerCalc();
        powerCalc.powerSum(appliancesList,0);

    }
}
