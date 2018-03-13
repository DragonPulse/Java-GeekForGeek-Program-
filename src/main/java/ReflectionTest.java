import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) {
		Class c = CompressStrings.class;
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}
}
