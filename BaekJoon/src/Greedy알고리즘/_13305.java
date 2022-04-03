package Greedy알고리즘;

import java.util.Scanner;
import java.util.Arrays;

public class _13305 {
	public static void main(String[] args) {

		// input
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		long distance[] = new long[N - 1];
		long city[] = new long[N];
		long result = 0;
		
		
		
		for (int i = 0; i < distance.length; i++) {
			distance[i] = scan.nextInt();
		}

		for (int i = 0; i < city.length; i++) {
			city[i] = scan.nextInt();
		}

		long smallestCity = city[0];
		
		
		// process
		for (int i = 0; i < city.length-1; i++) {
			if (smallestCity > city[i]) {
				smallestCity = city[i];
			}
			
			result += smallestCity*distance[i];
		}
		
		// output
		System.out.println(result);
	}
}
