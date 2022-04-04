package Greedy알고리즘;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class _1931 {
	public static void main(String[] args) {

		// input //
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int timeLine[][] = new int[N][2];

		// process //
		// ::1. input start time, endtime
		for (int i = 0; i < N; i++) {
			timeLine[i][0] = scan.nextInt();
			timeLine[i][1] = scan.nextInt();
		}

		// ::2. 2-dimension array-sort
		Arrays.sort(timeLine, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];	
				}

			}
		});
		
		
		// ::3. declare minEndtime & count up cnt
		int minEndtime = timeLine[0][1];
		int cnt = 1;

		for (int i = 1; i < N; i++) {
			if (minEndtime <= timeLine[i][0]) {
				cnt++;
				minEndtime = timeLine[i][1];
			}
		}

		// output //
		System.out.println(cnt);

	}
}
