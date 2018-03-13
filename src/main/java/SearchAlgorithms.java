
public class SearchAlgorithms {

	static int size = 10;
	static int array[] = {13,12,43,12,56,78,15,10,14,16};

	public static void main(String[] args) {
		//printArray();
		//linearSearch(78);
		//-------------------------------
		//bubbleSort();
		//-------------------------------
		//binarySearch(78);
		//selectionSort();
		insertionSort();
		
	}

	
	//Print the Array
	public static void printArray() {
		System.out.println("----------");
		for (int i = 0; i < size; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(array[i] + " |");
			System.out.println("----------");
			
		}
	}
	//Linear Search
	public static void linearSearch(int value) {
		String valueFoundAt ="";
		for(int i=0;i<size;i++) {
			if(value==array[i]) {
				valueFoundAt+=i+" ";
			}
		}
		System.out.println("----------Linear Search Results---------");
		System.out.println("Value found at "+valueFoundAt);
	}
	//Swap
	private static void swap(int indexOne,int indexTwo) {
		int temp = array[indexOne];
		array[indexOne]=array[indexTwo];
		array[indexTwo] = temp;
	}
	
	//Sort array by swapping the adjacent elements if they are in wrong order
	public static void bubbleSort() {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1;j++) {
				if(array[j]>array[j+1]) {
					swap(j,j+1);
				}
			}
		}
	}
	
	//The array should be sorted at first, Searching by dividing the array by 2 and finding the mid element
	public static void binarySearch(int value) {
		bubbleSort();
		printArray();
		int lowIndex= 0;
		int highIndex = size-1;
		while(lowIndex <= highIndex) {
			int midIndex = (lowIndex+highIndex)/2;
			if(value < array[midIndex]) {
				highIndex = midIndex-1;
			}else if (value > array[midIndex]) {
				lowIndex = midIndex+1;
			}else {
				System.out.println("Found at "+midIndex);
				lowIndex = midIndex+1;
			}
		}
	}
	
	
	//Selection Sort going to 
	public static void selectionSort() {
		for(int i = 0 ; i<size-1;i++) {
			int min = i;
			for(int j = i; j<size;j++) {
				if(array[j]< array[min]) {
					min=j;
				}
				
			}
			swap(i,min);
		}
		System.out.println("Array After Sorting");
		printArray();
	}

	
	//Insertion Sort
	public static void insertionSort() {
		for(int i =1;i<size;i++) {
			int j =i-1;
			int key = array[i];
			while((j>0) && array[j] > key) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
		System.out.println("After Sorting");
		printArray();
	}
}
