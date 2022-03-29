package Greedy알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class _1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text[] = br.readLine().split("-");
		int numArray[] = new int[text.length];
		int result = 0;

		for (int i = 0; i < text.length; i++) {
			if (text[i].contains("+")) {
				int sum = 0;
//				System.out.println(text[i]);
				for (String s : text[i].split("\\+")) {
					sum += Integer.parseInt(s);
				}
				numArray[i] = sum;
			} else {
				numArray[i] = Integer.parseInt(text[i]);
			}
			if (i > 0) {
				result -= numArray[i];
			}
//			System.out.println(numArray[i]);
		}

		result += numArray[0];
		System.out.println(result);
	}
}
