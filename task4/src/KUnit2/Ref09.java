package KUnit2;
import java.lang.reflect.Method;

//Printing methods details
public class Ref09 {
	public static void main(String args[]) throws Exception{
		SimpleM sm = new SimpleM();
		
		Method[] methods = sm.getClass().getMethods();
		System.out.printf("There are %d methods\n",methods.length);
		
		for(Method m: methods) {
			System.out.printf("Method name=%s type=%s, parameters=\n", m.getName(), m.getReturnType());
			
			Class[] types = m.getParameterTypes();
			for(Class c : types) {
				System.out.print(c.getName() + "");
			}
			
			System.out.println();
		}
	}
}
 