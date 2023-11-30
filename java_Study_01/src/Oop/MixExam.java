package Oop;

import Oop_Mix.Car;
import Oop_Mix.Engine;
import Oop_Mix.Handle;
import Oop_Mix.Wheel;

public class MixExam{
	
	public static void main(String[] args) {
		// 객체의 합성
		// 객체는 속서오가 행동을 가지고 있고
		// 이러한 객체들이 모여서 또 하나의 객체를 만들 수 있음
		// 이러한 개념을 객체의 합성이라고 함
		
		// 객체의 합성 구현
		// 객체를 합성할때는 합성할 객체들을 먼저 인스턴스로 선언이 필요.
		Engine engline = new Engine();
		Handle handle = new Handle();
		Wheel wheel = new Wheel();
		
		Car bugatti1 = new Car("뷰가티 1호","무","운","자");
		

	}

}
