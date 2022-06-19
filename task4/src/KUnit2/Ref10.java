package KUnit2;
import java.lang.reflect.Method;

//changing the private accessibility and updating values
public class Ref10 {
	public static void main(String args[]) throws Exception{
		SimpleM sm = new SimpleM();
		Method m = sm.getClass().getDeclaredMethod("setE",float.class);
		m.setAccessible(true);
		m.invoke(sm, 20);
		System.out.println(sm);
	}
}
 