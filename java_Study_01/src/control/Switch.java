package control;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		System.out.println("날짜를 숫자로 입력해 주세요 : 월요일 1");
//		int day = s.nextInt();
//		switch (day) {
//		case 1 :
//			System.out.println();
		
		// 퀴즈
		// 모음자를 대소문자를 구분해 줄 수 없는가
		// 대문자 모음자 입니다. 소문자 모음자 입니다.
		// -> a,e,i,o,u를 입력하면 (소문자 모음자 입니다 라는 메세지 출력)
		// -> A,E,I,O,U를 입력하면 (대문자 모음자 입니다 라는 메세지 출력)
		
		// 해당 알파벳에 속하지 않으면 모음자가 아닙니다 출력
		
		char big_Letter;
		char small_Letter;
		
		Scanner s = new Scanner(System.in);
		System.out.println("문자를 입력해주세요!: ");
		char latter = s.nextLine().charAt(0);
		
		
	}

}
