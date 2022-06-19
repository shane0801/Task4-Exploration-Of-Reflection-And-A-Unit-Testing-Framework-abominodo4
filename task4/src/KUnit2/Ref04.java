package KUnit2;
import java.lang.reflect.Field;
public class Ref04 {

	public static void main(String args[]) throws Exception{
		SimpleM sm = new SimpleM();
		Field[] fields = sm.getClass().getFields();
		
		System.out.printf("There are %d fiels :  ", fields.length);
		for(Field f: fields) {
			System.out.printf("field name=%s type=%s value=%f\n", f.getName(), f.getType(), f.getFloat(sm));
		}

}
} 