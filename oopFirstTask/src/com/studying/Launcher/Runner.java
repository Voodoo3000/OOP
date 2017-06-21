package com.studying.Launcher;

import com.studying.Appliances.HouseholdElectronic;
import com.studying.Electronic.Fridge;
import com.studying.Electronic.PC;
import com.studying.Electronic.Router;
import com.studying.Electronic.TV;

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

        HouseholdElectronic as[] = new HouseholdElectronic[]{pc, tv, router, fridge};
        Arrays.sort(as);

        double sum = 0;
        double minPower = 100d;
        double maxPower = 500d;
        for(HouseholdElectronic i : as) {
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
