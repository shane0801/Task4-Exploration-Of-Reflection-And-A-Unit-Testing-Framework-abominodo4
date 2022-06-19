package KUnit2;
import java.lang.reflect.Field;

//Checking accessibility
public class Ref06 {

	public static void main(String args[]) throws Exception{
		SimpleM sm = new SimpleM();
		
		Field[] fields = sm.getClass().getDeclaredFields();
		System.out.printf("There are %d fields\n", fields.length);
		
		for(Field f : fields) {
			System.out.printf("Field name=%s type=%s accessible=%s\n", f.getName(), f.getType(), f.isAccessible());
		}
	}

}
 