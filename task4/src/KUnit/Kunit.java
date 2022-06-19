package KUnit;
import java.util.*;

 
public class Kunit {
	  private static List<String> checks;
	  private static int testscarriedout = 0;
	  private static int passedTests = 0;
	  private static int failedTests = 0;
	  
	  private static void Report(String txt) {
		    if (checks == null) {
		      checks = new LinkedList<String>();
		    }
		    checks.add(String.format("%04d: %s", testscarriedout++, txt));
		  } 
	  
	  public static void checkEqualFlt(float value1, float value2) {
		    if (value1==(value2)) {
		    	Report(String.format(" Passed Test(CES)(True) "+ value1+" == "+value2));
		      passedTests++;
		    } else {
		    	Report(String.format("* Failed Test- False(CES)(False) "+ value1+" == "+value2));
		      failedTests++;
		    }
		  }
	  
	  public static void checkUnEqualFlt(float value1, float value2) {
		    if (value1 != value2) {
		    	Report(String.format("Passed Test (CUES)(True) "+ value1+" != "+value2));
		      passedTests++;
		    } else {
		    	Report(String.format("*Failed Test (CUES)(False) "+ value1+" != "+value2));
		      failedTests++;
		    }
		  }
	  public static void report() {
		    System.out.printf("%d Passed Tests\n", passedTests);
		    System.out.printf("%d Failed Tests\n", failedTests);
		    System.out.println();
		    
		    for (String check : checks) {
		      System.out.println(check);
		    }
		  }
}
