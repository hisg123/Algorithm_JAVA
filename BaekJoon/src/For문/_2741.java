package For��;

import java.io.*;

public class _2741 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=0; i< N; i++) {
			bw.write(i+1 + "\n");
		}
		
		br.close();
		bw.close();
	}
}
