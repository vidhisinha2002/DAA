package program3;
import java.util.*;

public class Program3a 
{

	public static void main(String[] args) {
		RandomThread Thread = new RandomThread();
		Thread t1 = new Thread(Thread);
		t1.start();

	}
}

class Cube implements Runnable
{	int x;
	Cube(int x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println("cube thread "+(x*x*x));
	}
}

class RandomThread implements Runnable
{	int n;
	public void run()
	{	Random r;
		Thread t2,t3;
		r=new Random();
		try
		{
			while(true)
			{
				n=r.nextInt(10);
				System.out.println(n);
				t2 = new Thread(new Square(n));
				t2.start();
				t3 = new Thread(new Cube(n));
				t3.start();
				Thread.sleep(1000);
			}
		}
		catch (Exception ex)
		{
			System.out.println("Interrupt");
		}
			
		
	}
}
class Square implements Runnable
{	int x;
	Square(int x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println("square thread "+(x*x));
	}
}
