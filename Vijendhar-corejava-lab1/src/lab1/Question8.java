package lab1;

import java.util.Scanner;

public class Question8 {
	static int checkNumber(int x) {
		if(x==0)
			return 0;
		while(x!=1) {
			if(x%2!=0)
				return 0;
			x=x/2;
		}
		return 1;
	} 
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int d=checkNumber(n);
		if(d==1)
			System.out.println("number is power of 2");
			else
				System.out.println("number is  not power of 2");
		
	}

}