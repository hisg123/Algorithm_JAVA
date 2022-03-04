package ¹è¿­;

import java.util.Scanner;
import java.util.Arrays;

public class _10818_2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] numArray = new int[N];

		for (int i = 0; i < N; i++) {
			numArray[i] = scan.nextInt();
		}
		
		scan.close();

		Arrays.sort(numArray);

		System.out.println(numArray[0] + " " + numArray[N-1]);

	}
}
