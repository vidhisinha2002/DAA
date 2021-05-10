import java.util.*;
public class Stack 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		StackOp stk = new StackOp();
		
		while(true) 
		{
			System.out.println("\n**MENU**\t");
			System.out.println("1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT");
			System.out.print("Enter your choice: ");
			int ch=sc.nextInt();
			switch(ch) 
			{
			case 1: stk.push();
					break;
			case 2: stk.pop(); 
					break;
			case 3: stk.display(); 
					 break;
			case 4:  System.exit(0);
			default: System.out.println("Enter a valid choice");

			}

		}
	}
}

class StackOp
{
	int top, size, s[];
	public StackOp() 
	{
		top=-1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of stack: ");
		size=sc.nextInt();
		s=new int[size];
	}
public void push() 
{
	Scanner sc=new Scanner(System.in);
	if(top==size-1) 
		System.out.println("Stack Overflow !! ");
	else 
	{
		int item;
		System.out.print("Enter element to be inserted: ");
		item=sc.nextInt();
		s[++top]=item;
		System.out.print("The  inserted element: "+ item);
	}
}
public void pop() 
{
	Scanner sc=new Scanner(System.in);
	if(top==-1) 
		System.out.println("Stack Underflow");
	else 
	{
		int item;
		item=s[top--];
		System.out.println("The  deleted element: "+ item);
	}
}
public void display() 
{
	Scanner sc=new Scanner(System.in);
	if(top==-1) 
		System.out.println("Empty");
	else 
	{
		System.out.println("The stack  elements are: ");
		for(int i=top; i>=0; i--)
			System.out.println(s[i]+"\t");
	}
}
}
