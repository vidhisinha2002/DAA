package program2;
import java.util.*;

class staff
{
	int id;
	String name;
	String phone;
	double salary;
	public staff(int id,String name,String phone,double salary)
	{
		this.id=id;
		this.name=name;
		this.phone=phone;
		this.salary=salary;
	}
	public void  display()
	{
		System.out.print(id+"\t\t"+name+"\t\t"+phone+"\t\t"+salary+"\t\t");	
	}
	
}

class teaching extends staff 
{
	String domain;
	int publications;
	 public teaching(int id,String name,String phone,double salary,String domain,int publications)
	 {
		 super(id,name,phone,salary);
		 this.domain=domain;
		 this.publications=publications;
	 }
	 public void display()
	 {
		 super.display();
		 System.out.println(domain+" \t\t"+publications+"  \t\t _   \t\t _");
	 }
}

class technical extends staff
{
	String skill;
	public technical(int id,String name,String phone,double salary,String skill)
	{
		super(id,name,phone,salary);
		this.skill=skill;
	}
	public void display()
	{
		super.display();
		System.out.println("_ \t\t  _ \t\t"+skill+"  \t\t _");
	}
}

class contracter extends staff
{
	int period;
	public contracter(int id,String name,String phone,double salary,int period)
	{
		super(id,name,phone,salary);
		this.period=period;
	}
	public void display()
	{
		super.display();
		System.out.println("_ \t\t    _ \t\t   _ \t\t"+period);
	}
}


public class P2a
{

	public static void main(String[] args)
	{
		int i;
	Scanner sc= new Scanner(System.in);
	int id,publications,period;
	String name,phone,domain,skill;
	double salary;
	staff []st=new staff[10];
	for(i=0;i<3;i++)
	{
		System.out.println("enter record of "+"staff "+(i+1));
		System.out.println("enter id");
		id=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter phone no.");
		phone=sc.next();
		System.out.println("enter salary");
		salary=sc.nextDouble();
		if(i<1)
		{ 
        System.out.println("enter domain");
       domain=sc.next();
        System.out.println("enter publications");
      publications=sc.nextInt();
      st[i]=new teaching(id,name,phone,salary,domain,publications);
		}
		else if(i>=1 && i<2)
		{
			System.out.println("enter skills");
			skill=sc.next();
			st[i]=new technical(id,name,phone,salary,skill);	
		}
		else
		{
			System.out.println("enter period");
			period=sc.nextInt();
			st[i]=new contracter(id,name,phone,salary,period);
		}
		
	}
	System.out.println("the staff details are:");
	System.out.println("ID \t\t NAME \t\t PHONENO. \t\t SALARY \t\t DOMAIN \t\t PUBLICATIONS \t\t SKILLS \t\t PERIOD");
	for(i=0;i<3;i++)
	{
	if(i<1)
	st[i].display();
	else if(i>=1 && i<2)
		st[i].display();
	else
		st[i].display();
	}

	}

}
