package task11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharsFirstVariant {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter symbols. For exit enter 'q'.");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char c = in.readLine().charAt(0);
		
		while (true) {
			if (c == 'q') {
				break;
			} else {
				c = in.readLine().charAt(0);
			}
			
		}

	}

}
