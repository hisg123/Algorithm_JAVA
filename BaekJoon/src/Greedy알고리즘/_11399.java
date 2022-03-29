package Greedy알고리즘;

import java.util.Scanner;
import java.util.Arrays;

public class _11399 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int P[] = new int[N];

		for (int i = 0; i < N; i++) {
			P[i] = scan.nextInt();
		}

		Arrays.sort(P);

		for (int i = 0; i < N; i++) {
			if (i != 0) {
				P[i] += P[i - 1];
			}
		}
		
		int sum = 0;
		for (int i : P) {
			sum += i;
		}
		
		System.out.println(sum);

	}
}
