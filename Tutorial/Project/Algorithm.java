
public class Algorithm {

	// basic algorithm with try catch and exception handling
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =23 , b=100000, c=36, d=34;
		double e ;
		try {
			e= (a+b)/(c-d);
			System.out.println(" The Output is : "+e);
		} catch (ArithmeticException Ae)
		{
			System.out.println("Error is " +Ae.getMessage());		}
		
		catch (Exception e2) {
			System.out.println("Unexpected Error " +e2.getMessage());
		}
	}

}
