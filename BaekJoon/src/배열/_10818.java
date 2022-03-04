package ¹è¿­;

import java.util.Scanner;

public class _10818 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] numArray = new int[N];

		for (int i = 0; i < N; i++) numArray[i] = scan.nextInt();
		
		scan.close();
		
		int max = numArray[0];
		int min = numArray[0];
		
		for (int i : numArray) {
			if (i >= max) max = i;
			if (i <= min) min = i;
		}
		
		System.out.println(min + " " + max);
	}
}
