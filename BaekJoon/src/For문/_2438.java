package For¹®;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2438 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "";
				
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			str += "*";
			bw.write(str + "\n");
		}

		bw.close();
		br.close();

	}
}
