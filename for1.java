package cs;
import java.util.Scanner;
public class p1 {
	public static void main (String [] agrs) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms");
		int n=sc.nextInt();
		int n1=0,n2=2,n3=0;
		if(n==1) 
			System.out.println(n1);
		else if(n==2)
		{
			System.out.println(n1);
			System.out.println(n2);
			
		}
		else
		{
			System.out.println(n1);
			System.out.println(n2);
			for(int i=2;i<n;i++);
			{
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
			}
		}
	}

}
