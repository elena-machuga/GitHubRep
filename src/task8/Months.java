package task8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Months {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String a = in.readLine();

		if (a.equalsIgnoreCase("december") || a.equalsIgnoreCase("january") || a.equalsIgnoreCase("february")) {
			System.out.println("This is winter");
		} else if (a.equalsIgnoreCase("march") || a.equalsIgnoreCase("april") || a.equalsIgnoreCase("may")) {
			System.out.println("This is spring");
		} else if (a.equalsIgnoreCase("june") || a.equalsIgnoreCase("july") || a.equalsIgnoreCase("august")) {
			System.out.println("This is summer");
		} else if (a.equalsIgnoreCase("september") || a.equalsIgnoreCase("october") || a.equalsIgnoreCase("november")) {
			System.out.println("This is autumn");
		} else {
			System.out.println("This is not a month");
		}

	}

}
