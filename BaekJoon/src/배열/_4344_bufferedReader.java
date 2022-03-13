package ¹è¿­;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4344_bufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			double[] scoreArray = new double[Integer.parseInt(st.nextToken())];
			double avg = 0;
			double cnt = 0;

			for (int j = 0; j < scoreArray.length; j++) {
				scoreArray[j] = Integer.parseInt(st.nextToken());
				avg += scoreArray[j];
			}

			avg = avg / scoreArray.length;
			for (double score : scoreArray) {
				if (score > avg)
					cnt += 1;
			}

			System.out.printf("%.3f%%\n", (cnt / scoreArray.length) * 100);
		}

		br.close();
	}
}
