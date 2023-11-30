package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class MapExam {
	
	public static void main(String[] args) {
		/*
		 * MAP
		 * 1. 중복불가
		 * 2. 순성벗음
		 * 3. K, V 형태로 이루어져 있음
		 * 
		 * HashMap, HashTable, Properties, TreeMap
		 * 
		 * */
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		/* kmove 성적 조작
		 * 나선인쿤의 해킹 시도기
		 * KEY값의 기준
		 * - 중복 우려가 없는 값. (유니크 값)
		 * */
		
		map.put("군침이", 0);
		map.put("오정권", 97);
		map.put("정다연", 99);
		map.put("크리스탈", 65);
		map.put("홍성준", 80);
		map.put("정지우", 85);
		map.put("김진우", 90);
		map.put("백가림", 98);
		map.put("정홍천", 100);
		map.put("박준이", 0);
		map.put("나선인", 70);
		map.put("한남욱", 100);
		
		System.out.println(map);
		System.out.println(map.size());
		
		// 키값을(키값만) 가져오기
		System.out.println(map.get("크리스탈"));
	}
	

}
