package KUnit2;

import KUnit.Kunit;
import static KUnit.Kunit.*;
import java.lang.reflect.*;
import java.io.IOException;
import java.sql.SQLException;


public class TestSimpleM {
	
	public static void main(String args[]) throws IOException, SQLException{
		SimpleM sm = new SimpleM (3, 2);		
		
		
		checkEqualFlt(sm.getE(), 3);
		checkUnEqualFlt(sm.getF(), 2);
		checkEqualFlt(sm.getF(), 2);
				
		 
		
		Field field = null;
		try {
			field = sm.getClass().getDeclaredField("e");
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    field.setAccessible(true);
	    try {
			checkEqualFlt(field.getFloat(sm), 2);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}	     
	    
		report();	
	}
	
}
