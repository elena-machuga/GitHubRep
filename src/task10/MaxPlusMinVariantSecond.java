package task10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MaxPlusMinVariantSecond {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter three integer numbers:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			list.add(Integer.parseInt(in.readLine()));
		}

		Collections.sort(list);
		int sum = list.get(0) + list.get(2);
		System.out.println(sum);
	}

}
