package KUnit2;

public class SimpleM {
	
	 public float e = 2;
	  private float f = 5;
	  
	  public SimpleM(){}
	  
	  public SimpleM(float e, float f) {
		  this.e = e;
		  this.f = f;
	  }
	  
	  public void squareE() {
		  this.e *= this.e;
	  }
	  
	  private void squareF() {
		  this.f *= this.f;
	  }
	  
	  public float getE() {
		  return e;
	  }
	  
	  private void setE(float e) {
		  this.e = e;
	  }
	   
	  public float getF() {
		  return f;
	  }
	  
	  private void setD(float f) {
		  this.f = f;
	  }
	    
	  public String toString() {
		  return String.format("(e:%f, f:%f)", e, f);
	  }
}
