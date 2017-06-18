package com.studying;

public class Main {

    public static void main(String[] args) {
        PC pc = new PC(true);
        TV tv = new TV();
        Router router = new Router();
        Fridge fridge = new Fridge();

        pc.powerCalc(pc.name, pc.amp, pc.volt);
        tv.powerCalc(tv.name, tv.amp, tv.volt);
        router.powerCalc(router.name, router.amp, router.volt);


    }
}
