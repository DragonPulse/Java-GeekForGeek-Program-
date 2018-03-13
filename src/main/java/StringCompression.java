import java.util.Scanner;
import java.util.Stack;

public class StringCompression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] charArray = str.toCharArray();

		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(str.charAt(i));
				continue;
			}
			if (stack.peek().equals(str.charAt(i))) {
				count++;
			} else {
				sb.append(stack.pop());
				sb.append(count);
				stack.empty();
				stack.push(str.charAt(i));
				count = 1;
			}

		}
		if(!stack.isEmpty()) {
			
		}
		System.out.println(sb);

	}
}
