package ¹è¿­;

import java.util.HashSet;
import java.util.Scanner;

public class _3052_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		HashSet<Integer> remainSet = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			remainSet.add(scan.nextInt() % 42);
		}
		scan.close();
		
		System.out.println(remainSet.size());
	}
}
