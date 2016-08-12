package sample;

import java.util.Scanner;

public class ReverseNumber {
	
	

	
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int reverse=0;
		while(n>0){
			int r=n%10;
			n=n/10;
			reverse=reverse*10+r;
			
		}
		System.out.println(reverse);
		
	}

}
