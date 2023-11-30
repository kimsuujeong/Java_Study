package Oop_Review2;

import java.text.DecimalFormat;

public class Test_01{
	
	final static double PI = 3.13149;
	
static //    area(a:int):double       => 원의넓이=반지름*반지름*PI
//    area(a:int, b:int):double     => 사각형의넓이=가로*세로
//    area(a:int, b:int, c:int):doble     => 사다리꼴의 넓이=(밑변 + 윗변 )*높이/2 
	
	double onearea (int a) {
		return PI*a*a;
		
	}
	static double samarea (int a, int b) {
		return a*b;
		
	}
	static double saarea (int a, int b, int c) {
		return (a+b)*c/2;
	}
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("삼각형의넓이: " + df.format(onearea(3)));
		System.out.printf("빗면의길이: " + df.format(samarea(4,5)));
		System.out.printf("\n둘레 길이: "+ df.format(saarea(3,4,7)));
		
	}

//
//	[결과화면]
//	원의넓이 : 28.274337
//	사각형의넓이 : 20.0
//	사다리꼴의넓이 : 24.5

}
