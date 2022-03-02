package While문;

import java.util.Scanner;

public class _1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Integer N = scan.nextInt();
		Integer temp = N ;
		
		Integer First = temp/10;
		Integer Second = temp%10;
		
		Integer Sum = First + Second;
		Sum = Sum%10;
		temp = Integer.parseInt(Integer.toString(Second) + Integer.toString(Sum));
		
		Integer i = 1;
		
		while (!N.equals(temp)) {
			First = temp/10;
			Second = temp%10;
			
			Sum = First + Second;
			Sum = Sum%10;
			
//			System.out.println("First: " + First);
//			System.out.println("Second: " + Second);
//			System.out.println("Sum: " + Sum);
			
			temp = Integer.parseInt(Integer.toString(Second) + Integer.toString(Sum));
			i += 1;
//			System.out.println("Temp: " + temp);
		}
		
		System.out.println(i);
	}
}
