package java_Basic;

import java.util.Scanner;

public class Variable { 
	
	public static void main(String[] args) {
//		String abc = "변수에 저장하기";
//		abc = "요걸로 바꿈";


//		int num1 = 10, num2 = 20;
//		int result;
//		String 무언가 = "양수";
//		String 쓰는건가 = "음수";
//		
//		result = (num1-num2 < 0 ) ? 무언가 : 쓰는건가;
//		System.out.println(result);
		
		// 퀴즈
		//두개의 숫자를 입력받아 두 수 중 큰수를 출력하시오
//		Input a : 5
//		Input b : 13

		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력");
		a = sc.nextInt();
		System.out.println("두 번째 숫자 입력");
		b = sc.nextInt();
		
		long result1 = (a > b) ? a:b;
		
		System.out.println("둘 중에 큰 숫자는: "+ result1);
		
		
		

	}

}
