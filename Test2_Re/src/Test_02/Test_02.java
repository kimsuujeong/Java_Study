package Test_02;

import java.util.Arrays;

public class Test_02 {

	public static void main(String[] args) {

		int[] intArray1 = { 1, 2, 3 };
		int[] intArray2 = { 4, 5, 6 };

		int length = Math.min(intArray1.length, intArray2.length);
		int[] intArray3 = new int[length];

		// 전에꺼 틀린 원인 : 결과 배열을 새로 담아주지 않고 그대로 출력하려고 해서 틀렸음!!
		for (int i = 0; i < length; i++) {
			intArray3[i] = intArray1[i] + intArray2[i];
		}

		System.out.println("배열1: " + Arrays.toString(intArray1));
		System.out.println("배열2: " + Arrays.toString(intArray2));
		System.out.println("결과배열: " + Arrays.toString(intArray3));
	}

}
