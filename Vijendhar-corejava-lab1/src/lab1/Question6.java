package lab1;


	import java.util.Scanner;

	public class Question6 {
		static int calculateDifference(int x) {
			int sum=0,sq=1,s=0;
			for(int i=0;i<=x;i++) {
				s=s+i;
				sq=i*i;
				sum=sum+sq;
				
			}
			return sum-(s*s);
			
		}
		public static void main(String[] args) {
			int n;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number");
			n=sc.nextInt();
			int d=calculateDifference(n);
			System.out.println(d);
			
		}
	}
