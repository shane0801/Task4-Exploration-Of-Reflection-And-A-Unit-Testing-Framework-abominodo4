package KUnit2;
import java.lang.reflect.Field;

//Changing the field values
public class Ref08 {
	public static void main(String args[]) throws Exception{
		SimpleM sm = new SimpleM();
		Field[] fields = sm.getClass().getDeclaredFields();
		System.out.printf("There are %d fields\n", fields.length);
		
		for(Field f : fields) {
			f.setAccessible(true);
			float x = f.getFloat(sm);
			x++;
			f.setFloat(sm, x);
			System.out.printf("field name=%s, type=%s, value=%f\n", f.getName(), f.getType(), f.getFloat(sm));
		}
	}
}
 