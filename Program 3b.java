package program3;

import java.util.Scanner;

public class Trial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	try 
    	{
		    System.out.println("enter a");
		    int a = sc.nextInt();
		    System.out.println("enter b");
		    int b = sc.nextInt();
		    if (b != 0)
		    	System.out.println((float)a/b);
		    else
		    	throw new Exception();
		 }
	     catch (Exception e) 
    	 {
	        System.out.println(" divide by 0 not possible");
	     }

	}

}
