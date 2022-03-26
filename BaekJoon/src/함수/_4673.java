package ÇÔ¼ö;

public class _4673 {
	public static long creator(int[] a) {

		long sumValue = 0;

		for (int i : a) {
			sumValue += i;
		}

		return sumValue;
	}

	public static void main(String[] args) {

		int[] testArray = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(creator(testArray));
	}
}
