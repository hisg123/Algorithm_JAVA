package Greedy알고리즘;

import java.util.Scanner;

public class _11047_new {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 int N = scan.nextInt();
		 int K = scan.nextInt();
		
		 int cnt = 0;
		 int coinArray[] = new int[N];
				 
		 for (int i =0; i < N; i++) {
			 coinArray[i] = scan.nextInt();
		 }
		 
		 for (int i = N-1 ; i > -1 ; i--) {
			 if (coinArray[i] <= K) {
				 cnt += K / coinArray[i];
				 K = K % coinArray[i];			 
			 }
		 }
		 
		 System.out.println(cnt);
	 }
}
