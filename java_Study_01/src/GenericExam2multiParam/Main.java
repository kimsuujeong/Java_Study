package GenericExam2multiParam;

public class Main {
	
	public static void main(String[] args) {
		
		Product<TV, String> TV1 = new Product <TV, String>();
		TV1.setT(new TV(2023,8));
		TV1.setM("어쩔티비");
		
		System.out.println(TV1.getT().getYear());
		
		Product<Car, String> p1 = new Product <Car, String>();
		
		p1.setT("저쩔티비");
		p1.setM(new Car("아우디 A6",2023,8));

	}
}
