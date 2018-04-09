package Selenium_Ajit.B1;

import java.util.ArrayList;
import java.util.List;

public class Arrlist
{
	public static void print(List<String> arraylist) 
	{
		for(int i=0;i<arraylist.size();i++) 
		{
			System.out.println("arraylist[" + i + "]: "+arraylist.get(i));
		}
	}

	public static void main(String[] args) 
	{
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("Ajit");
		print(arraylist);
		
		arraylist.add(1, "test");
		System.out.println("Add element with index");
		print(arraylist);
		arraylist.add(2, "Selenium");
		System.out.println("Add element with index");
		print(arraylist);
		arraylist.remove(1);
		System.out.println("Remove element is ");
		print(arraylist);
		
		
	}

}
