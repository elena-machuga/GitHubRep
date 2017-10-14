package task7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenPositive {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter a number from -9 to 9:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(in.readLine());

		if (a % 2 == 0 && a > 0) {
			System.out.println("This number is even and positive");
		} else {
			System.out.println("This number is not even and positive");
		}
	}

}
