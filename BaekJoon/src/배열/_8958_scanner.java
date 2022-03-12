package ¹è¿­;

import java.util.Scanner;
import java.util.Arrays;

public class _8958_scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scan.next();
			
			int weight = 0;
			int sum = 0;
			
			for (char j : arr[i].toCharArray()) {
				if (j == 'O') weight += 1;
				else weight = 0;
				sum += weight;
			}
			System.out.println(sum);
		}
	}
}
