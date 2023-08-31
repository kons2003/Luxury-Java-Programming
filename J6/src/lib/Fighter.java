
package lib;

import java.util.Scanner;

public class Fighter extends Airplane implements Weapon {
	private boolean stealth; // 스텔스 모드
	
	public Fighter(String id) {
		super(id, "전투기");
		stealth = false;
	}
	public Fighter(String id, boolean stealth) {
		super(id, "전투기");
		this.stealth = stealth;
	}
	
	public void stealthOn() { 
		stealth = true; 
	}
	public void stealthOff() { 
		stealth = false; 
	}
	public boolean getStealth() { 
		return stealth; 
	}
	
	@Override
	public void loadWeapon() {
		System.out.println(super.getID() +" 무기 장착");
		for(int i = 0; i < weaponList.length; i++)
			System.out.println(weaponList[i] +" 무기가 장착되었습니다.");
	}
	@Override
	public void showWeapon() {
		System.out.println(super.getID() +" 무기 목록");
		for(int i = 0; i < weaponList.length; i++)
			System.out.println(i+1 +": "+ weaponList[i]);
	}
	@Override
	public void selectWeapon() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("무기를 선택하시오: ");
		int weapon = scanner.nextInt();
		System.out.println(weaponList[weapon-1] +"이 발사되었습니다.");
	}
	
	@Override
	public void takeoff() {
		System.out.println(getType() +" "+ getID() +"가 이륙합니다.");
	}
	@Override
	public void flight() {
		System.out.println(getType() +" "+ getID() +"가 비행합니다.");
	}
	@Override
	public void landing() {
		System.out.println(getType() +" "+ getID() +"가 착륙합니다.");
	}
	@Override
	public void showInfo() {
		System.out.println("식별 번호: "+ getID());
		System.out.println("비행기 타입: "+ getType());
		System.out.println("스텔스 모드: "+ getStealth());
	}
}
