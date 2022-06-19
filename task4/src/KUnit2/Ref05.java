package KUnit2;
import java.lang.reflect.Field;
public class Ref05 {
	public static void main(String args[]) throws Exception{
		//printing all fields of the main class 
		SimpleM sm = new SimpleM();
		Field[] fields = sm.getClass().getDeclaredFields();
		
		System.out.printf("There are %d fields :  ", fields.length);
		for(Field f: fields) {
			System.out.printf("Field name=%s type=%s value=%f : ", f.getName(), f.getType(), f.getFloat(sm));
		}
}
} 