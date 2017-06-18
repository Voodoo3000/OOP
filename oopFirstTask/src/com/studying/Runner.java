package com.studying;

public class Runner {

    public static void main(String[] args) {

        PC pc = new PC(true);
        TV tv = new TV(true);
        Router router = new Router(true);
        Fridge fridge = new Fridge(false);

        pc.powerCalc(pc.name, pc.amp, pc.volt, pc.onOff);
        tv.powerCalc(tv.name, tv.amp, tv.volt, tv.onOff);
        router.powerCalc(router.name, router.amp, router.volt, router.onOff);
        fridge.powerCalc(fridge.name, fridge.amp, fridge.volt, fridge.onOff);

    }
}
