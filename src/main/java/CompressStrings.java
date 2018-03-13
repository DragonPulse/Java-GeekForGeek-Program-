import java.util.Scanner;
import java.util.Stack;

/*
 * Compress the string when lower and upper case are same. In compressed string characters should be in lowercase.

for ex:     input    aaABBb

               output  3a3b

Input

The first line of the input contains a single integer T denoting the number of test cases.
The first line of each test case contains string s.
Output

For each test case, output the required string.
 */
public class CompressStrings {

	public static void compressString(String str) {
		
		StringBuilder sb = new StringBuilder();
		int charCount=1;
		
		
		
		
		
		Character prevCh = null;
		
		if(str.length()==1) {
			sb.append(charCount).append(str);
		}else {
			
			for(int i=1;i<str.length();i++) {
				if( Character.toLowerCase(str.charAt(i-1)) == Character.toLowerCase(str.charAt(i))) {
					charCount++;
					if(i==str.length()-1) {
						sb.append(charCount).append(str.charAt(i-1));
					}
				}else {
					sb.append(charCount).append(str.charAt(i-1));
					charCount=1;
				}
				
			}
			sb.append(charCount).append(str.charAt(str.length()-1));
		}
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String[] dataInputs = new String[count];
		for(int i=0;i<count;i++) {
			dataInputs[i]=scanner.next();
			compressString(dataInputs[i]);
		}
		
		
	}
	
}
