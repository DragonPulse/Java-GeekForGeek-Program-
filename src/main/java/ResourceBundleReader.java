import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleReader {

	public static void main(String[] args) {
		Locale locale = Locale.CHINESE;
		ResourceBundle bundle = ResourceBundle.getBundle("com.samplernd.site", locale);
		System.out.println(bundle.getString("SUBMIT"));
		
	}
}
