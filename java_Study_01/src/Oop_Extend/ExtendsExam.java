package Oop_Extend;

public class ExtendsExam {

	public static void main(String[] args) {
		// 상속 : 물려주는 것.
		// - 부모 클래스의 요소를 자식클래스가 가져가는 것.
		// - 기존 클래스에 기능을 추가하거나 재 정의하여
		// 새로운 클래스를 정의하는 것.
		// 기존에 정의되어 있던 클래스를 부모 ro 사우이 클래스라 부름
		// 상속을 통해 시롭게 작성되는 클래스를 자식 or 하위 클래스라 부름

		Welsicogi welsi = new Welsicogi();
		welsi.how();
		welsi.name = "엄준식";
		System.out.println(welsi.name);
	}

//	1. 부모클래스 말고도 조부모 클래스를 만드는 거솓 가능
//	2. 자식클래스가 2개 이상의 상속을 받는 것을 다중 상속이라고 하는데
//	자바는 기본적으로 다중 상속 방지
//	
//	상속과 생성자
//	생성자는 상속 받을 수 있는가
	생성자는 상속받을 수 없음
	 - 만약 

}
