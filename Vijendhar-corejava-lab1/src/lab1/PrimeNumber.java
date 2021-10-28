package lab1;

import java.util.*;

public class PrimeNumber {
	static void checkprime(int n)
	{
		int c=0;
		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(c>0)
				break;
			if(n%i==0)
				c++;
		}
		if(c==0)
			System.out.println(n);
	}
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(int i=2;i<n;i++)
			checkprime(i);
	}

}