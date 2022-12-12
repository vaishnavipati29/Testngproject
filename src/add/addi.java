package add;

public class addi {

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
	 		addi obj = new addi();
	            obj.addition(10,56);
	            obj.multification(24,18.5);         
		}
}
