package task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter two integer numbers and one of the operators: +, -, * or /:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(in.readLine());
		int b = Integer.parseInt(in.readLine());
		String c = in.readLine();

		if (c.equals("+")) {
			int x = a + b;
			System.out.println(x);
		} else if (c.equals("-")) {
			int x = a - b;
			System.out.println(x);
		} else if (c.equals("*")) {
			int x = a * b;
			System.out.println(x);
		} else if (c.equals("/")) {
			int x = a / b;
			System.out.println(x);
		}

	}

}
