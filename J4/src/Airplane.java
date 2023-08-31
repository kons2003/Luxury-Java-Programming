
public class Airplane {
	private String model; // 비행기 모델
	private String company; // 비행기 회사
	private int number; // 탑승 인원수

	public void setModel(String model) { 
		this.model = model; 
		}
	
	public String getModel() { 
		return model; 
		}
	
	public void setCompany(String company) { 
		this.company = company; 
		}
	
	public String getCompany() { 
		return company; 
		}
	
	public void setNumber(int number) { 
		this.number = number; 
		}

	public int getNumber() { 
		return number; 
		}
	
	public void showAirplane() {
		System.out.println("비행기 모델: "+ getModel());
		System.out.println("비행기 회사: "+ getCompany());
		System.out.println("탑승 인원수: "+ getNumber());
	}
	
	public Airplane() {
		this("", "", 0);
	}
	
	public Airplane(String model, String company) {
		this.model = model;
		this.company = company;
	}
	
	public Airplane(String model, String company, int number) {
		this.model = model;
		this.company = company;
		this.number = number;
	}
}
