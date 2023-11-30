package control;

public class For_Exam {

	public static void main(String[] args) {
		// 반복문
		// 프로그램내에서 똑같은 명령을 일정횟수 반복하여
		// 수행하도록 제어하는 명령문.

//		for (int i = 0; i <= 10000; i++) {
//			
//			System.out.print("빠따 ");
//			System.out.println(i+" 이꾸요오오오잇이이잉ㅅ");
//			
//		}

//		for (int 빠다빠다 = 1; 빠다빠다 <= 10; 빠다빠다++) {
//
//			if (빠다빠다 == 1) {
//
//				System.out.println("수업 시작이누 ;;;;");
//			}
//
//			System.out.println("수업은 언제 끝나나" + 빠다빠다 + "이꾸요오옹옷");
//
//			if (빠다빠다 == 10) {
//				System.out.println("수업 다 끝났누 츄베룹");
//			}
		
		//4단 구구단
		
		for ( int 난4단이라우 = 1; 난4단이라우 <=4; 난4단이라우 ++) {
			for (int j = 1; j<=9; j ++) {
				int o = 난4단이라우*j;
				System.out.println(난4단이라우+"x"+j + "=" + o);
			}

		}

	}
}
