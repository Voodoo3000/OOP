package com.studying.launcher;

import com.studying.appliances.HouseholdElectronic;
import com.studying.appliances.AppliancesList;
import com.studying.electronic.Fridge;
import com.studying.electronic.PC;
import com.studying.electronic.Router;
import com.studying.electronic.TV;
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

        double sum = 0;
        double minPower = 100d;
        double maxPower = 500d;
        for(HouseholdElectronic i : appliancesList.getAs()) {
            if(i.isOnOff()) {
                sum = sum + i.getPower();
            }
            if (i.getPower() > minPower && i.getPower() <= maxPower) {
                System.out.println("Suitable consumption power: " + i);
            }
        }
        System.out.println("Running devices summary consumption power: " + sum + "W");
    }
}
