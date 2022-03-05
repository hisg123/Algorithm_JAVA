package ¹è¿­;

import java.util.Scanner;
import java.util.ArrayList;

public class _2577 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int ABC = A*B*C;
		
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		int[] resultArray = new int[10];
		
		while(ABC != 0) {	
			numArray.add(ABC%10);
			ABC = ABC/10;
		}
			
		for(int i: numArray) {
			resultArray[i] += 1;
		}
		
		for (int i: resultArray) {
			System.out.println(i);
		}
	}
}
