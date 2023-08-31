
package lib;

public class Airliner extends Airplane {
	private int passenger; // 탑승 인원수
	
	public Airliner(String id) {
		super(id, "여객기");
		passenger = 0;
	}
	public Airliner(String id, int passenger) {
		super(id, "여객기");
		this.passenger = passenger;
	}
	
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public int getPassenger() {
		return passenger;
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
		System.out.println("탑승 인원수: "+ getPassenger());
	}
}
