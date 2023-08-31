
package lib;

public abstract class Airplane {
	private String id; // 식별 번호
	private String type; // 비행기 타입
	
	public Airplane(String id, String type) {
		this.id = id;
		this.type = type;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	public String getID() {
		return id;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public abstract void takeoff(); //비행기가 이륙하는 메소드
	public abstract void flight(); // 비행기가 주행하는 메소드
	public abstract void landing(); // 비행기가 착륙하는 메소드
	public abstract void showInfo(); // 식별 번호와 비행기 타입을 출력하는 메소드
}
