package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _1904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int v[] = new int[N + 1];

		v[0] = 1;
		v[1] = 2;

		for (int i = 2; i < N; i++) {
			v[i] = (v[i - 2] + v[i - 1]) % 15746;
		}

		System.out.println(v[N - 1]);
	}
}
