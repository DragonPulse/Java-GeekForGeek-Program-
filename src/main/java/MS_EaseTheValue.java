import java.util.Scanner;

public class MS_EaseTheValue {

	public static void printEaseNumber(int[] a) {
		// Replace method
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				a[i] = a[i] * a[i];
				a[i + 1] = 0;
			}
		}
		
		int count = 0; // Count of non-zero elements

		// Traverse the array. If element encountered is
		// non-zero, then replace the element at index 'count'
		// with this element
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[count] = a[i];
				count++;
			}

		} // here count is
			// incremented

		// Now all non-zero elements have been shifted to
		// front and 'count' is set as index of first 0.
		// Make all elements 0 from count to end.
		while (count < a.length) {
			a[count] = 0;
			count++;
		}

		for (Integer i : a)
			System.out.print(i+" ");
		
	}

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		for(int i=0;i<count-1;i++) {
			int sizeOFArray = scanner.nextInt();
			for(int j =0;j<sizeOFArray-1;j++) {
				
			}
		}
		int a[] = { 2, 2, 0, 4, 0, 8 };

		printEaseNumber(a);
		

	}
}
