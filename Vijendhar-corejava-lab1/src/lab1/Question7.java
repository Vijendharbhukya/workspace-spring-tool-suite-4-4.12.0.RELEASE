package lab1;

import java.util.Scanner;

public class Question7 {
	static int checkNumber(int x) {
		boolean f=false;
		int num=x%10;
		x=x/10;
		while(x>0) {
			if(num<=x%10) {
				f=true;
				break;
			}
			 num=x%10;
			x=x/10;
		}
		if(f==true)
			return 0;
		else
			return 1;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int d=checkNumber(n);
		if(d==1)
		System.out.println("number is increasing");
		else
			System.out.println("number is  not increasing");
	}
}