package Oop_Extend;

public class Over_riding_Exam {
	
	public static void main(String[] args) {
		// 오버라이딩 - 재정의
		// 상위클래스의 메서드를 하위클래스에서 재.정.의 하는 것.
		
		// 오버라이딩의 조건.
		// 1. 메서드으 ㅣ선언부는 동일해야한다.
		// - 오버라이딩은 구현부만 다르게 작성해야한다.
		// 2. 부모클래스보다 더 많은 예외 선언은 불가.
		
		// 오버 로딩 오버 라이딩 차이점
		// 오버 로딩 : 새로운 메서드의 생성 (new)
		// 오버 라이딩 : 선언부가 같고 구현부만 다르다. (바꾼다)
		
		Porche car911 = new Porche();
		car911.run();
		
		
	}

}
