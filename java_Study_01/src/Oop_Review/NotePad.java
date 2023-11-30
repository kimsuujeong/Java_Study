package Oop_Review;

import java.io.FileReader;
import java.util.Scanner;

public class NotePad {

	private int noteLength = 0;
	private final NoteEntitiy[] wtf;
	private final int NOTE_SIZE = 50;

	public NotePad() {

		this.wtf = new NoteEntitiy[NOTE_SIZE];

	}

	public void addText() {
		// TODO Auto-generated method stub
		if (NOTE_SIZE == this.noteLength) {

			System.out.println("메모 배부르노");
			System.out.println("");
			return;
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("제목 쓰노");
		String title = sc.nextLine();

		System.out.println("본문 작성");
		String content = sc.nextLine();

		wtf[this.noteLength++] = NoteEntitiy.newIstance(title, content);

		System.out.println("완료 됐노");
	}

	public void printAllNote() {
		// TODO Auto-generated method stub\
		System.out.println("");

		for (int i = 0; i < this.noteLength; i++) {
			NoteEntitiy noteEntitiy = wtf[i];

			String head = String.format("번호:%d 제목 : %s 작성일자:%s", i + 1, noteEntitiy.getTitle(),noteEntitiy.getLast_update());
			System.out.println(head);

		}

	}

	public void printNote() {

		System.out.println("");
		// 몇번째 글의 인스턴스를 읽어올껀지 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 번호가 뭐노?");
		int num = sc.nextInt();

		NoteEntitiy noteEntitiy = wtf[num - 1];
		// 출력
		if (null == noteEntitiy) {
			System.out.println("작성된 메모가 없습니다");
			System.out.println("");
			
			return;
		}

		// 퀴즈 : 상세보기 완성
		// 상세보기의 기준은 제목, 날짜 , 내용
		System.out.println("");

		String JOLRATITLE = String.format("ㅈㄴ 타이틀이노: %s", noteEntitiy.getTitle());
		String JOLRADATE = String.format("날짜: %s", noteEntitiy.getLast_update());
		String JOLRACONTENT = String.format("제목: %s", noteEntitiy.getContent());
		
		System.out.println(JOLRATITLE);
		System.out.println(JOLRADATE);
		System.out.println(JOLRACONTENT);
		System.out.println("");
	}
	public void modifyNote() {
		
		Scanner sc = new Scanner(System.in);
		
         System.out.println("수정하실 메모의 번호를 입력해주세요");
         int modifyNumber = Integer.parseInt(sc.nextLine()); // 문자열 숫자를 정수로 변경

         System.out.println("본문을 작성해주세요");
         String content = sc.nextLine();
         
         NoteEntitiy noteEntity = wtf[modifyNumber];

         if (null == noteEntity) {
             System.out.println("존재하지 않는 메모입니다");
             return;
         }
         noteEntity.setContent(content);

         System.out.println("메모가 체인지!! >_<");
         System.out.println("");


		
		
	}
	
	public void delectNote() {
		
		
		
	}
	

}
