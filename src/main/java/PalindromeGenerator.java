import java.util.Random;

public class PalindromeGenerator {

	public static void main(String[] args) {
		int size = 5;
		StringBuilder sb = new StringBuilder(size);
		Random rand = new Random();
		for(int i=0;i<Math.ceil((double)size/2);i++) {
			char ch = (char)(rand.nextInt(26) + 97);
			sb.append(ch);
		}
		for(int i=(size/2)-1;i>=0;i--) {
			sb.append(sb.charAt(i));
		}
		System.out.println(sb);
	}
}
