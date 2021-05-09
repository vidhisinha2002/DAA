import java.util.*;
	class Student
	{
	    String USN, Name, Branch,Phone;
	    public Student( String usn, String name, String branch, String phone)
	    {
	    	USN=usn;
	        Name=name;
	        Branch=branch;
	        Phone=phone;
	    }
	}
	public class Main
	{
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number of students: ");
	        int n = sc.nextInt();
	        
	        Student[] s = new Student[n];
	        String usn, name, branch, phone;
	        for(int i=0; i<n; i++){
	            System.out.println("Enter details of student : "+(i+1));
	            System.out.println("Enter usn : ");
	            usn=sc.next();
	            System.out.println("Enter name : ");
	            name=sc.next();
	            System.out.println("Enter branch : ");
	            branch=sc.next();
	            System.out.println("Enter phone number : ");
	            phone=sc.next();
	            s[i]= new Student(usn, name, branch, phone);
	        }
	        System.out.println("Students Details: ");
	        System.out.println("USN\t\tName\t\tBranch\t\tPhone Number\t");
	        for(int i=0; i<n; i++)
	        {
	            System.out.println(s[i].USN+"\t"+s[i].Name+"\t\t"+s[i].Branch+"\t\t"+s[i].Phone+"\t");
	        }
	    }
	}

