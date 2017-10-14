package task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stop {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter strings. For exit enter \"stop\".");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String c = in.readLine();
		
		while (true) {
			if (c.equalsIgnoreCase("stop")) {
				break;
			} else {
				c = in.readLine();
			}
			
		}

	}

}
