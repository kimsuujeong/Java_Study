package Test_03;

public class Test_03 {

	public static void main(String[] args) {

		Test_03 obj = new Test_03();
		for (String a : "aaabbccc".split(" "))
			System.out.println(a + " 는 " + obj.compress(a) + "로 압축되어야 합니다.");
		for (String a : "banana".split(" "))
			System.out.println(a + " 는 " + obj.compress(a) + "로 압축되어야 합니다.");
		for (String a : "APPLE".split(" "))
			System.out.println(a + " 는 " + obj.compress(a) + "로 압축되어야 합니다.");
	}

	String compress(String s) {
		String t = "";
		for (String u : s.split("(?<=(.))(?!\\1)"))
			t = t + u.charAt(0) + u.length();
		return t;
	}

}
