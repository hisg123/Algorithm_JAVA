package ¹è¿­;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8958_getbytes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
				
		for (int i = 0; i< N; i++) {
			int cnt = 0;
			int sum = 0;
			
			for (Byte value : br.readLine().getBytes()) {
				if (value == 'O') {
					cnt +=1;
				} else {
					cnt = 0;
				}
				
				sum += cnt;
			}
			
			System.out.println(sum);
		}
		br.close();
	}
}
