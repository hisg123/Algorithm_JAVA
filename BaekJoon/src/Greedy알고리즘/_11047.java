package Greedy알고리즘;

import java.util.Scanner;

public class _11047 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();

		int coin[] = new int[N];
		int coin_cnt = 0;

		for (int i = 0; i < N; i++) {
			coin[i] = scan.nextInt();
		}


		for (int i = N-1; i >= 0; i--) {
			if (K >= coin[i]) {
				do {		
					K -= coin[i];
					coin_cnt++;
//					System.out.println("\n");
//					System.out.println("K:::" + K);
//					System.out.println("coin:::" + coin[i]);
//					System.out.println("coin_cnt:::" + coin_cnt);
							

				} while (K - coin[i] >= 0);
			}

			if (K < 0)	break;
		}

		System.out.println(coin_cnt);
	}
}
