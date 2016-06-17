import java.util.Scanner;

public class RecursiveMethod {
	
	static int[] Fibonacciarr=new int[20];
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{		
		Fibonacciarr=Fibonacci();
		for(int i=0;i<=19;i++)
		{
			System.out.println(Fibonacciarr[i]);
		}
		
		System.out.println("Please enter a number for Collatz:");
		int collatz=sc.nextInt();
		Collatz(collatz);
		
	}
	
	public static int[] Fibonacci()
	{
		int[] Fib=new int[20];
		int choose=0;
		System.out.println("Please choose the start point: Press 1 ( 1 and 1 )or Press 2 (0 and 1) ");
		choose=sc.nextInt();
		
		if(choose==1)
		{
			Fib[0]=1;
			Fib[1]=1;			
		}
		else if(choose ==2)
		{
			Fib[0]=0;
			Fib[1]=1;
		}
		
		for(int i=0; i<=17;i++)
		{
			Fib[i+2]=Fib[i]+Fib[i+1];
		}
		return Fib;
	}
	public static void Collatz(int num)
	{
		int mod=0;
		while(num>0)
		{
			if(num==1)
			{
				System.out.println(num);
				break;
			}
			System.out.println(num);
		    mod=num%2;
			if(mod==0)
			{
				num=num/2;
			}
			else if(mod==1)
			{
				num=(3*num)+1;
			}
		}
	}

}
