package com.freeze.test2;

public class MiniDuck {
	public static void main(String[] args) {
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
