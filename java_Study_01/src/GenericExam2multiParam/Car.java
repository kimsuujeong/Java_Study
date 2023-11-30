package GenericExam2multiParam;

public class Car {

	// 브랜드, 생산년, 생산월
	// 생성자 : 기본 생성자 명시, 필드 전부 선언
	// car클래스를 통해 직접적으로 데이터를 가져갈 수 없도록 해주세요.
	
	private String car_name;
	private String Made_year;
	private int Made_Monte;
	
	public Car() {
		
	}

	public Car(String car_name, int i, int made_Monte) {
		super();
		this.car_name = car_name;
		Made_year = i;
		Made_Monte = made_Monte;
	}

	public String getCar_name() {
		return car_name;
		
		
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public String getMade_year() {
		return Made_year;
	}

	public void setMade_year(String made_year) {
		Made_year = made_year;
	}

	public int getMade_Monte() {
		return Made_Monte;
	}

	public void setMade_Monte(int made_Monte) {
		Made_Monte = made_Monte;
	}

}
