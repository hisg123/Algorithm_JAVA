package For¹®;

import java.util.Scanner;
import java.util.ArrayList;

public class _10876 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		ArrayList<Integer> NumList = new ArrayList<Integer>();
		
		
		for (int i = 0; i< N ; i++) NumList.add(scan.nextInt());
		
		for (int i : NumList) if (i < X) System.out.print(i + " ");
		
				
	}
}
