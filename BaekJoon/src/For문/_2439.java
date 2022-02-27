package For¹®;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;

public class _2439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
				
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			str += "*";
			System.out.printf("%"+ N +"s\n", str);
		}

		br.close();

	}
}
