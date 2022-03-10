package ¹è¿­;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _3052 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Integer[] remainArray = new Integer[10];

		for (int i = 0; i < 10; i++) {
			remainArray[i] = scan.nextInt()%42;
		}
		
		int length = 0;
		List<Integer> remainList = Arrays.asList(remainArray);
		Set<Integer> remainSet = new HashSet<>(remainList);
		
		System.out.println(remainSet.size());
		
	}
}
