
public class Airplane {
	private String company;
	private String type;
	private String id;
	
	public Airplane(String company, String type, String id) {
		this.company = company;
		this.type = type;
		this.id = id;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getType() {
		return type;
	}
	
	public String getID() {
		return id;
	}
}
