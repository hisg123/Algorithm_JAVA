package ¹è¿­;

import java.util.Scanner;

public class _8958_scanner_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] arr = new String[scan.nextInt()];
		

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.next();
		}

		scan.close();

		for (int i = 0; i < arr.length; i++) {

			int weight = 0;
			int sum = 0;

			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O')
					weight += 1;
				else
					weight = 0;
				sum += weight;
			}
			System.out.println(sum);
		}
	}
}
