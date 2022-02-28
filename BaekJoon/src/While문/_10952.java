package While¹®;

import java.util.Scanner;

public class _10952 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Integer A = -1, B = -1;
		
		while (!A.equals(0) || !B.equals(0)) {
			A = scan.nextInt();
			B = scan.nextInt();
			if (!A.equals(0) || !B.equals(0)) System.out.println(A + B);
		}
		
	}
}
