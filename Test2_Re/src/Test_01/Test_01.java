package Test_01;

import java.util.Scanner;

public class Test_01 {

	/*
	 * 주어진 정수가 소수(Prime)인지 판별하는 프로그램을 작성하세요. 소수는 1과 자기 자신만을 약수로 가지는 정수입니다.
	 * 
	 * 답안은 주어진 정수가 소수인 경우 true를, 소수가 아닌 경우 false를 반환하는 결과를 작성해야 합니다.
	 * 
	 * 예시 1 17의 경우 실행결과는 true입니다 출력 예시 2 25의 경우 실행결과는 false입니다 출력
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int a = sc.nextInt();

		int r = 0;

		if (a == 1) {
			System.out.println(a + "의 경우 실행결과는 flase입니다.");
		} else {
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					System.out.println(a + "의 경우 실행결과는 flase입니다.");
					r = 1;
					break;
				}
			}
			if (r != 1) {
				System.out.println(a + "의 경우 실행결과는 true입니다.");
			}

		}
	}

}
