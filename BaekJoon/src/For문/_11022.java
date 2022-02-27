package For��;

import java.io.*;
import java.util.StringTokenizer;

public class _11022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			bw.write("Case #" + (i + 1) + ": " + A + " + " + B + " = " + (A + B) + "\n");
		}

		bw.close();
		br.close();

	}
}
