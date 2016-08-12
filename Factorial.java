package General;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);	
		int n=s.nextInt();
     int a=1,i=1;
		
		do
		{
		a=a*i;
		i++;
		}while(i<=n);

			System.out.println("The factorial of "+n+" is "+a);	
			

	}
	}


