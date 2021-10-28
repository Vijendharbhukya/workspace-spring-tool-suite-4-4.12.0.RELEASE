package lab1;

import java.util.Scanner;

public class Question5 {
	static int calculateSum(int x) {
		int sum=0;
		for(int i=0;i<=x;i++) {
			 if(i%3==0||i%5==0) {
				 sum=sum+i;
			  }
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int s=calculateSum(n);
		System.out.println(s);
	}

}
