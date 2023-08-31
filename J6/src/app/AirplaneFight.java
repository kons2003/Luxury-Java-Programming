
package app;

import lib.Airliner;
import lib.Fighter;

public class AirplaneFight {
	public static void main(String[] args) {
		Airliner liner = new Airliner("A100", 300);
		Fighter fighter = new Fighter("F300");
		
		liner.showInfo();
		System.out.println();
		
		liner.takeoff();
		liner.flight();
		liner.landing();
		System.out.println();
		
		fighter.showInfo();
		System.out.println();
		
		fighter.loadWeapon();
		System.out.println();
		
		fighter.takeoff();
		fighter.flight();		
		fighter.showWeapon();
		fighter.selectWeapon();
		System.out.println();
		
		fighter.landing();
		
	}
}
