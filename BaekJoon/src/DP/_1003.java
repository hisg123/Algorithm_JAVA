package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _1003 {
	public static void fibonacci(int n) {
		int num1 = 0, num2 = 1;
		int cnt = 0;

		if (n == 0)
			System.out.println("1 0");

		else {
			while (cnt < n - 1) {
				int temp = num1 + num2;
				num1 = num2;
				num2 = temp;
				cnt += 1;
			}
			System.out.println(num1 + " " + num2);
		}
	}

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			fibonacci(Integer.parseInt(br.readLine()));
		}
	}
}
