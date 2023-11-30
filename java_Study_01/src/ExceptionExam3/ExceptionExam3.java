package ExceptionExam3;

public class ExceptionExam3 {

	public static void main(String[] args) {
		// 도저히 어떤 예외가 나올지 감이 안잡힌다면?
		// RuntimeException을 활용할 것
		// 그냥 Exception은 왜 안씀?
		// 1. 가장 마지막에 처리해두는 것이 정석

		try {

			throwsWhat();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	public static void throwsWhat() throws Exception {

		Class class1 = Class.forName("java.lang.string");
		throw new Exception("예외 강제 발생!");

	}

}
