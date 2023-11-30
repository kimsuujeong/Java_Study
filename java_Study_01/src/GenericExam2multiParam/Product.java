package GenericExam2multiParam;

// Formal Type parameter라 부름
// T: 타입의 약자, 어떤 타입이든 될 수 있는 일반적 타입 파라미터
// F: 멀티플 타입의 약자 ,여러개의 타입을 표현하는데에 사용

// M은 일반적으로 다양한 타입을 다룰 때 사용한다.
// 클래스가 두개 이상의 다른 타입을 다룰 때 쓰는 것이 좋음

/* 제네릭 정적 메서드
 * public static <T etends Animal> void test(Animal 데이터) {
 * 		사시 정적 제네릭 메서드는 Formal Type Parameter와 상관 없음
 * 		정적 제네릭 메서드가 의미를 갖기 위해서는 상속 처리가 필요*/

public class Product<T,M> {
	
	private T t;
	private M m;
	
	
	public T getT() {
		return t;
	}
	public void setT(String string) {
		this.t = string;
	}
	public M getM() {
		return m;
	}
	public void setM(Car car) {
		this.m = car;
	}

}
