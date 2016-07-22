# Abi

public class PosNegative {

	
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a=args.length;
		System.out.println("length:"+a);
		if(n==0)
		{
			System.out.println(+n+ " is postive or negative");
		}
		else if(n>0)
		{
			System.out.println(+n+ " is postive ");
		}
		else
		{
			System.out.println(+n+ " is negative");
		}

	}

}
