package ¹è¿­;

import java.util.Scanner;
import java.util.Arrays;

public class _1546_scanner {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		double[] numArray = new double[N];

		for (int i = 0; i < N; i++) {
			numArray[i] = scan.nextInt();
		}

		Arrays.sort(numArray);

		double avg = 0;
		double sum = 0;

		for (double i : numArray) {
			sum = sum + (i / numArray[N - 1]) * 100;
		}
		avg = sum / N;

		System.out.println(avg);
	}
}
