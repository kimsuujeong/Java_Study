package Oop_Review;

import java.util.Scanner;

public class NotePadService {

	private final NotePad notePad;
	// 사실 이렇게 써도 상관x

	// private final NotePad notePad = new NotePad();
	public NotePadService() {

		// 과제
		// 객체 생성을 왜 생성자를 통해 했는지를
		// 설명하세요.
		this.notePad = new NotePad();

	}

	public void run() {
		// 메모장에서 실현되는 서비스

		while (true) {
			System.out.println("안녕하세요. 메모장입니다");
			System.out.println("1.메모 전체보기 2.메모보기 3.메모작성 4.메모수정 5.메모삭제 6.종료");

			Scanner user_Num = new Scanner(System.in);
			System.out.println("원하시는 번호를 입력 해 주세요");
			int num = user_Num.nextInt();

			switch (num) {
			case 1:
				System.out.println("1. 메모 전체보기");
				notePad.printAllNote();
				break;
			case 2:
				System.out.println("2. 메모보기");
				notePad.printNote();
				break;
			case 3:
				System.out.println("3. 메모 작성");
				notePad.addText();
				break;
			case 4:
				System.out.println("4. 메모 수정");
				notePad.modifyNote();
				break;
			case 5:
				System.out.println("5. 메모 삭제");
				
				break;
			case 6:
				System.out.println("6. 종료");
				break;

			}

		}
	}
}
