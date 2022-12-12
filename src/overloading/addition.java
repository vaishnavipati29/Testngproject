package overloading;
  class MathmaticalOpration {
 	 
 public void  addition(int a, int b)
 {
	 int z = a+b;
	 System.out.println("Addition is = " + z);
 }		 	
public void multification (int a, double b)
{
	
	double z = a*b;
	System.out.println("Multiplication is = "+ z);
}
 	public static void main (String [] args) {
		MathmaticalOpration obj = new MathmaticalOpration();
            obj.addition(10,56);
            obj.multification(24,18.5);         
	}
	
	
}	
	
	
	
			 
 
	
	



 