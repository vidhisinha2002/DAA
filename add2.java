package program2;

import java.util.*;

class adj
{
	char c[];
	int n;
	public adj(char c[],int n)
	
	{
		this.c=c;
		this.n=n;
	}
	void cal()
	{
		int fre[]=new int[n];
		int x=0;
		int l,m,i,j;
		int f=0;
		int pos[][]=new int[n][n];
		for(i=0;i<n;i++)
		{	
			for(l=0;l<i;l++)
			{
				for(m=0;m<fre[l];m++)
				if(pos[l][m]==i)
				{
					fre[i]=0;
					f=1;
				}
			}
			if(f==1)
		    continue;
			else
			{
			x=0;
			for(j=i+1;j<n;j++)
			{
				if(c[i]==c[j]) 
				{
				pos[i][x]=j;
				x++;
				}
		    }
			if(x==0)
			fre[i]=1;
			else
			fre[i]=x+1;
			System.out.println("frequency of "+c[i]+" is "+fre[i]);
			}
		}
		int maxind,maxval,term;
		int arr1[]=new int[n];
		for(i=0;i<n-1;i++)
		{
			maxind=i;
			maxval=fre[i];
			for(j=i;j<n;j++)
			{
				if(fre[j]>maxval)
				{
					maxind=j;
					maxval=fre[j];
				}
			}
			if(maxind!=i)
			{
				term=fre[maxind];
				fre[maxind]=fre[i];
				fre[i]=term;
			}
			arr1[i]=maxind;
		}
		for(i=0;i<n;i++)
		{
			if(fre[i]!=0)
			{
				System.out.print(c[arr1[i]]);
				fre[i]--;
			}
		}
				
	}
	
}
public class Additional2 
{

	public static void main(String[] args) 
	{
		int n;
		int i;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of character");
		n=sc.nextInt();
		char ch[]=new char[n];
		System.out.println("enter string ");
		s=sc.next();
		for(i=0;i<n;i++)
		{
		ch[i]=s.charAt(i);
		}
     adj ad=new adj(ch,n);
     ad.cal();
	}

}
