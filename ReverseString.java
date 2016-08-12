package sample;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String str1="";
		for(int i=str.length()-1;i>=0;i--){
			str1=str1+str.charAt(i);
			
		}
		
		System.out.println(str1);

	}

}
