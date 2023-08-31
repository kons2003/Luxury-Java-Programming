
public class Airplane {
	private String id;
	private String company;
	private int passenger;
	
	public Airplane(String id, String company, int passenger) {
		this.id = id;
		this.company = company;
		this.passenger = passenger;
	}
	
	public String getID() {
		return id;
	}
	
	public String getCompany() {
		return company;
	}
	
	public int getPassenger() {
		return passenger;
	}
	
	@Override
	public String toString() {
		return id+' '+company+' '+passenger;
	}
}
