import java.util.Scanner;

public class ArrayDemo {
	static int arraySize = 10;
	static int[] a = new int[arraySize];

	public static void main(String[] args) {
		for (int i = 0; i < arraySize; i++) {
			// Random number 10 through 19
			a[i] = (int) (Math.random() * 10) + 10;
		}
		System.out.println("Before Delete");
		printArray();
		System.out.println("After Delete");
		removeTheElementFromArray(3);
		System.out.println();
		printArray();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number to search");
		linearSearch(scanner.nextInt());
	}

	public static int[] removeTheElementFromArray(int indexToRemove) {
		if (indexToRemove < arraySize) {
			for (int i = indexToRemove; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			arraySize--;
		}

		return a;

	}
	// Returns true or false if a value is in the Array

	public boolean doesArrayContainThisValue(int searchValue) {
		boolean valueInArray = false;
		for (int i = 0; i < arraySize; i++) {
			if (a[i] == searchValue) {
				valueInArray = true;
			}
		}
		return valueInArray;
	}

	public static void printArray() {
		System.out.println("----------");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(a[i] + " |");
			System.out.println("----------");
		}
	}
	
	public static void  linearSearch(int value) {
		
		boolean valueInArray = false;
		String foundAtIndex = "";
		for(int i =0;i<arraySize;i++) {
			if(a[i] == value) {
				valueInArray = false;
				foundAtIndex=foundAtIndex+" "+i;
			}
		}
		System.out.println("Value found at "+foundAtIndex);
		
	}
}
