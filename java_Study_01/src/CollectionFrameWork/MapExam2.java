package CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MapExam2 {
	
	public static void main(String[] args) {
		/*
		 * HashSet
		 * set : 중복 저장이 불가하다.*/
		
		Set<String> set = new HashSet <String>();
		set.add("리치정");
		set.add("오박사");
		set.add("군침이");
		System.out.println(set);
		
		// 이터레이터 : 순차적으로 나열된 요소들을 다루는 인터페이스
		// 	- 구조를 알 필요 없이 각 요소들을 순서대로 접근 하고 처리가 가능
		Iterator<String> iterator = set.iterator();
		// 가져올게 있느냐? 있으면 true, 없음녀 false를 리턴한다.
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			// 반복자를 통해서 가져오면 Set에서 객체들을 제거하지 않는다.
			System.out.println("사이즈: " + set.size());
			
			// 내부 구조 유출X
			// 참조타입에 대한 순환
			// 요약 : 요소 순회도 가능하면서 컬렉션 내부구조 유출을 방지하여
			//	유연하고 확장 가능한 코드를 작성하는 것이 목적
		}
		
		
	}

}
