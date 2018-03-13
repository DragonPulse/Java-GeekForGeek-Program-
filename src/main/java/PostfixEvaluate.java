import java.util.Stack;

public class PostfixEvaluate {

	public static void main(String[] args) {
		String exp="231*+9-";
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<exp.length();i++) {
			char ch=exp.charAt(i);
			if(Character.isDigit(ch)) {
				stack.push(ch-'0');
			}else {
				int val1 = stack.pop();
				int val2 = stack.pop();
				switch(ch) {
				case '+':stack.push(val2 + val1);
						break;
				case '-':stack.push(val2 - val1);
						break;
				
				case '*':stack.push(val2 * val1);
						break;
				
				case '/':stack.push(val2 / val1);
						 break;
				
				}
			}
			
		}
		System.out.println(stack.peek());
	}
}
