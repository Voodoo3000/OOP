package com.studying;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        PC pc = new PC(true, 500);
        TV tv = new TV(true, 240);
        Router router = new Router(true, 50);
        Fridge fridge = new Fridge(false, 150);

        HouseholdElectronic as[] = new HouseholdElectronic[]{pc, tv, router, fridge};
        Arrays.sort(as);
        System.out.println(Arrays.deepToString(as));

        double sum = 0;
        double minPower = 40d;
        double maxPower = 300d;
        for(HouseholdElectronic i : as) {
            if(i.onOff) {
                sum = sum + i.power;
            }
            if (i.power > minPower && i.power <= maxPower) {
                System.out.println("Suitable consumed power: " + i);
            }
        }
        System.out.println("Summary consumed power: " + sum);
    }
}
