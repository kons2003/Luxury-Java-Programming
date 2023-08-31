
public class Airplane {
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
	
	public void showInfo() {
		System.out.println("식별 번호: "+ getID());
		System.out.println("비행기 타입: "+ getType());
	}
}

class Airliner extends Airplane {
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
	
	public void showInfo() {
		System.out.println("식별 번호: "+ getID());
		System.out.println("비행기 타입: "+ getType());
		System.out.println("탑승 인원수: "+ getPassenger());
	}
}

class Fighter extends Airplane {
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
	
	public void showInfo() {
		System.out.println("식별 번호: "+ getID());
		System.out.println("비행기 타입: "+ getType());
		System.out.println("스텔스 모드: "+ getStealth());
	}
}