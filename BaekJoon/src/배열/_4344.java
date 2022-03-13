package ¹è¿­;

import java.util.Scanner;

public class _4344 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for (int i = 0; i < T; i++) {
			
			double[] scoreArray = new double[scan.nextInt()];
			double avg = 0;
			double cnt = 0;
			
			for (int j = 0; j < scoreArray.length; j++) {
				scoreArray[j] = scan.nextInt();
				avg += scoreArray[j];
			}
			
			avg = avg/scoreArray.length;
			for (double score : scoreArray) {
				if (score > avg) cnt += 1;
			}
			
			System.out.printf("%.3f%%\n", (cnt/scoreArray.length)*100);
		}
		
		scan.close();
	}
}
