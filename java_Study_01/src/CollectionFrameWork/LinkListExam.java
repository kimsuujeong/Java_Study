package CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListExam {
	public static void main(String[] args) {
		// ArrayList의 장단점
		// 장점
		// 1. 구조가 간단.
		// 2. 속도가 빠름(데이터를 읽는 시간이 빠름)
		// - 접근시간이 짧다

		// 단점
		// 1. 크기 변경시 메모리 낭비가 심하다.
		// 2. 데이터 추가 삭제에는 부적합

		// 변경이 거의 없는 리스트에 사용.

		// LinkedList
		// 1. 인접 참조를 링크해서 체인처럼관리.

		// 링크드 리스트의 선언
		LinkedList<String> linklist = new LinkedList<>();
		ArrayList<String> arrList = new ArrayList<>();

		System.out.println(add1(linklist));
		System.out.println(add1(arrList));

//		System.out.println(add2(linklist));
//		System.out.println(add2(arrList));
		
		System.out.println(delete1(linklist));
		System.out.println(delete1(arrList));
		
		
	}

	// 순차적 추가
	public static long add1(List<String> list) {
		// 시간재기
		long start = System.currentTimeMillis();

		// 이 사이에 코드를 쓰면 실행시간을 계산할수 있음
		for (int i = 0; i < 9000000; i++) {
			list.add(i + "");
		}

		long end = System.currentTimeMillis();
		return end - start;
	}

	// 비순차적 추가
	public static long add2(List<String> list) {
		// 시간재기
		long start = System.currentTimeMillis();

		// 이 사이에 코드를 쓰면 실행시간을 계산할수 있음
		for (int i = 0; i < 9000000; i++) {
			list.add(972, "ssak");
		}

		long end = System.currentTimeMillis();
		return end - start;
	}

	// 순차적 삭제
	public static long delete1(List<String> list) {
		// 시간재기
		long start = System.currentTimeMillis();

		// 이 사이에 코드를 쓰면 실행시간을 계산할수 있음
		for (int i = list.size() - 1; i >= 0; i--) {
			
			list.remove(i);

		}

		long end = System.currentTimeMillis();
		return end - start;
	}

}
