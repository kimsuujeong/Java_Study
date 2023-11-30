package control;

public class Do_while {
	public static void main(String[] args) {
		
		int test = 0;
		while (test < 50) {
			
			test++;
			
			if (test % 3== 0) {
				System.out.println("이건 3의 배수 이라우");
				// continue; // 현재 반복의 루프를 취소하고 처음으로 돌아간다
							 // 자신이 포함된 반복문의 끝으로 이동
			}
			
			System.out.println(test);

		}
		
	}
}
