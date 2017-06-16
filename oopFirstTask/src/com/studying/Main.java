package com.studying;

public class Main {

    public static void main(String[] args) {
	    PC pc = new PC();
	    TV tv = new TV();
	    Router router = new Router();
	    Fridge fridge = new Fridge();
	    pc.plugIn(pc.pcpower);
		tv.plugIn(tv.tvpower);
		router.plugIn(router.routerpower);
    }
}
