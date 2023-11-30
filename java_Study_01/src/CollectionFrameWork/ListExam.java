package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam {
	
	public static void main(String[] args) {
		
		// KMove 동
		ArrayList kmoveDong = new ArrayList();
		
		// 객체(입주자) 추가
		kmoveDong.add("나선인");
		kmoveDong.add("백가림");
		kmoveDong.add("김수정");
		
		System.out.print(kmoveDong);
		for(int i = 0 ; i < kmoveDong.size(); i++) {
			System.out.println(kmoveDong.get(i));
		}
		
		kmoveDong.add("군침이");
		kmoveDong.add("싸악싸악");
		kmoveDong.add("휘몰아치노오오오오!!!");
		kmoveDong.add(1, "박준이");
		System.out.println(kmoveDong);
		System.out.println(kmoveDong.indexOf("김수정"));
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(4);
		list1.add(3);
		list1.add(964);
		list1.add(34);
		list1.add(523);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // retrun타입과 결과만 알면 된다
		
		System.out.println(list1);
		System.out.println(list2);
		
		// sort()
		Collections.sort(kmoveDong);
		System.out.println("똑바러 서!!" + kmoveDong);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("마! 거꾸로 뒤집어라" + list1);
		
		// 포함관계(containsAll)
		// list1에 list2의 모든 요소가 ㅗ함되어 있는가
		System.out.println(list1.containsAll(list2));
		
		
	}

}
