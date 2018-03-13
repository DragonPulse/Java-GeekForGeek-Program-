
public class PalindromChecker {

	public boolean isPalinDrome(String str) {
		if(str.length()<2) return true;
		if(str.charAt(0)!=str.charAt(str.length()-1)) {
			return false;
		}else {
			return isPalinDrome(str.substring(1, str.length()-1));
		}
	}
	
	public static void main(String[] args) {
		PalindromChecker palin = new PalindromChecker();
		System.out.println(palin.isPalinDrome("MADAM"));
		System.out.println(palin.isPalinDrome("ABBA"));
	}
}
