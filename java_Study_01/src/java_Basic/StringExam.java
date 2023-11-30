package java_Basic;

public class StringExam {

	public static void main(String[] args) {
		
		String name = String.format("%s에 애쉬 궁던지고 싶다", "정글");
		System.out.println(name);
		
		// 문자열을 만드는 방법은 다양하지만
		// 생성 방법에 따라 JVM이 문자열을 관리하는 방법이
		// 달라진다. 그리고 그에 따라 비교하는 방법에 달라진다.
		
		// 문자열은 기본타입이면서 참조타입이기도 한 특별한 객체
		// -> 기본 타입이 저장되는 메모리 공간이 다르고
		//		참조 타입이 저장되는 메모리 공간이 다르다.

	}

}
