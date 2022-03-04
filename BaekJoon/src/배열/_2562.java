package ¹è¿­;

import java.util.Scanner;

public class _2562 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] numArray = new int[9];

		for (int i = 0; i < 9; i++) {
			numArray[i] = scan.nextInt();
		}

		int max = numArray[0];
		int index = 0;

		for (int i = 0; i < 9; i++) {
			if (numArray[i] >= max) {
				max = numArray[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
