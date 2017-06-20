package com.studying.Launcher;

import com.studying.Appliances.HouseholdElectronic;
import com.studying.Electronic.Fridge;
import com.studying.Electronic.PC;
import com.studying.Electronic.Router;
import com.studying.Electronic.TV;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        PC pc = new PC("ROG G20CB",true, 500);
        TV tv = new TV("Sony XE94",true, 240);
        Router router = new Router("HP R120",true, 50);
        Fridge fridge = new Fridge("Bosch KDD74AL20N",false, 150);

        HouseholdElectronic as[] = new HouseholdElectronic[]{pc, tv, router, fridge};
        Arrays.sort(as);

        double sum = 0;
        double minPower = 100d;
        double maxPower = 500d;
        for(HouseholdElectronic i : as) {
            if(i.onOff) {
                sum = sum + i.power;
            }
            if (i.power > minPower && i.power <= maxPower) {
                System.out.println("Suitable consumption power: " + i);
            }
        }
        System.out.println("Running devices summary consumption power: " + sum + "W");
    }
}
