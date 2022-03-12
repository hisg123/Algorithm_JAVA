package ¹è¿­;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1546 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		double[] numArray = new double[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			numArray[i] = Double.parseDouble(st.nextToken());
		}
		
		br.close();

		Arrays.sort(numArray);

		double avg = 0;
		double sum = 0;

		for (double i : numArray) {
			sum = sum + (i / numArray[N - 1]) * 100;
		}
		avg = sum / N;

		System.out.println(avg);
	}
}
