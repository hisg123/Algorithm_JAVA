package ÇÔ¼ö;

public class _15596 {
	public static long sum(int[] a) {
		
		long sumValue = 0;
		
		for (int i : a ) {
			sumValue += i;	
		}
		
		return sumValue;
	}
	
	public static void main(String[] args) {
		
		int [] testArray = new int[] {1, 2, 3, 4, 5}; 
		System.out.println(sum(testArray));	
	}
}
