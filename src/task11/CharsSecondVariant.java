package task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharsSecondVariant {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter symbols. For exit enter 'q'.");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String c = in.readLine();
		
		while (true) {
			if (c.equalsIgnoreCase("q")) {
				break;
			} else {
				c = in.readLine();
			}
			
		}

	}

}
