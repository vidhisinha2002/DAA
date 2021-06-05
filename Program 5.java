import java.util.*;
public class Mergesort
{
	static final int MAX = 1000000;
	static int[] a = new int[MAX];
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter max");
		int n = sc.nextInt();
		Random random = new Random();
		for (int i=0;i<n;i++)
		{
			a[i] = random.nextInt(1000);
			System.out.println(a[i]);
		}
		
		long start=System.nanoTime();
	
		MergeSort(a,0,n-1);
		
		long stop=System.nanoTime();
		long elapsed=stop-start;
		System.out.println("Time Complexity " + (double)elapsed/1000000);
		
		for (int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	public static void MergeSort(int a[],int l, int r)
	{
		int mid;
		if (l<r)
		{
			mid=(l+r)/2;
			MergeSort(a,l,mid);
			MergeSort(a,mid+1,r);
			Merge(a,l,mid,r);
		}
	}
	public static void Merge(int a[],int l,int mid,int r)
	{
		int n1=mid-l+1;
		int n2=r-mid;
		int[] x = new int[n1];
		int[] y = new int[n2];
		//
		for(int i=0;i<n1;i++)
			x[i]=a[l+i];
		for(int i=0;i<n2;i++)
			y[i]=a[mid+1+i];
		
		int i=0,j=0,k=l;
		
		while(i<n1&&j<n2)
		{
			if(x[i]<y[j])
			{
				a[k]=x[i];
				k++;
				i++;
			}
			else
			{
					a[k]=y[j];
					k++;
					j++;
			}
				
		}
		
		while(i<n1)
		{
			a[k]=x[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			a[k]=y[j];
			k++;
			j++;
		}
	}
}
