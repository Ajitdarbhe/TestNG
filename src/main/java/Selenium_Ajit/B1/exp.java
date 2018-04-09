package Selenium_Ajit.B1;

//import org.omg.CORBA.ExceptionList;

public class exp {
	
	 static int[] arr=new int[5];

	public static void main(String[] args) throws Exception 
	{
		try {
			arr[6]=10;
			System.out.println(arr[5]);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		System.out.println(arr[6]);

	}

}
