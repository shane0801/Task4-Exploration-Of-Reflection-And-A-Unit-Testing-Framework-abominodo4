package KUnit2;
import java.lang.reflect.Field;

public class Ref07 {
	public static void main(String args[]) throws Exception{
		SimpleM sm = new SimpleM();
		Field[] fields = sm.getClass().getDeclaredFields();
		System.out.printf("There are %d fields\n", fields.length);
		
		//Changing the Accessibility
		
		for(Field f : fields) {
			f.setAccessible(true);
			System.out.printf("Field name=%s type=%s value=%f\n",f.getName(), f.getType(), f.getFloat(sm));
		}
	}
}
 