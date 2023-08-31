
import java.util.*;

public class AirplaneManager {
	int order = 0; // 비행기 등록 순서 저장 필드
	
	ArrayList<Airplane> plane = new ArrayList<>();
	
	// 비행기 등록 기능
	void regist() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== 아래 정보를 입력하세요. ===");
		System.out.print("비행기 제조회사: ");
		String company = scanner.next();
		System.out.print("비행기 타입정보: ");
		String type = scanner.next();
		System.out.println();
			
		plane.add(new Airplane(company, type, generateID(company, type)));
		}
	
	// 제조회사, 타입정보, 계수번호로 구성된 식별정보 계산 기능
	String generateID(String company, String type) {
		String id = new String();
		// 제조회사 식별번호
		if(company.equals("아시아나"))
			id = id.concat("A");
		else if(company.equals("대한항공"))
			id = id.concat("K");
		else
			id = id.concat("Z");
		
		// 타입정보 식별번호
		if(type.equals("여객기"))
			id = id.concat("L");
		else if(type.equals("전투기"))
			id = id.concat("F");
		else
			id = id.concat("Z");
		
		// 계수정보 식볗번호
		order++;
		id = id.concat(String.format("%03d", order));
		
		return id;
	}
	
	// 전체 비행기 정보 출력 기능
	void showAll() {
		Iterator<Airplane> it = plane.iterator();
		while(it.hasNext()) {
			Airplane n = it.next();
			System.out.println("--------------------------");
			System.out.println("비행기 제조회사: "+ n.getCompany());
			System.out.println("비행기 타입정보: "+ n.getType());
			System.out.println("비행기 식별번호: "+ n.getID());
		}
	}
	
	public static void main(String[] args) {
		AirplaneManager manager = new AirplaneManager();
		
		for(int i=0; i<3; i++)
			manager.regist();
		
		manager.showAll();
	}
}
