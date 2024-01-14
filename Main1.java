import java.io.*;
import java.util.*;
class PrimeThread extends Thread {
	
	public boolean prime(int no)
	{
		int c=0;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			c++;
		}
		if(c==0)
		return true;
		return false;
	}

	
}

class FibonacciThread extends Thread {

	public boolean fibonacci(int n)
	{
		int n1=0,n2=1,n3;
		for(int i=0;i<n;i++)
		{
			n3=n1+n2;
			if(n==n3)
			return true;
			n1=n2;
			n2=n3;
		}
		return false;
	}
	
}

public class Main1 {
	
      public static void main(String[] args)
      {
      	Scanner sc = new Scanner(System.in);
		  PrimeThread pt= new PrimeThread();
      	FibonacciThread ft=new FibonacciThread();
      	System.out.println("Enter the value of N: ");
      	int n=sc.nextInt();
      	List<Integer>list = new ArrayList<Integer>();
      	System.out.println("Numbers that are both prime and Fibonacci:");
      	for(int i=2;i<=n;i++)
      	{
      		boolean flag1 = pt.prime(i);
      		boolean flag2 = ft.fibonacci(i);
      		if(flag1 && flag2)
      		list.add(i);
      	}
      	System.out.println(list);
      }
	
	
}