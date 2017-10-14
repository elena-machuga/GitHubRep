package task10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxPlusMinVariantFirst {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter three integer numbers:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[3];

		for (int i = 0; i < 3; i++) {
			array[i] = (Integer.parseInt(in.readLine()));
		}

		int max = maxValue(array);
		int min = minValue(array);

		int sum = max + min;
		System.out.println(sum);
	}
	
	public static int maxValue(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int minValue(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

}
