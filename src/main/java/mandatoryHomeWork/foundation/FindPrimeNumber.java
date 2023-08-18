package mandatoryHomeWork.foundation;

import org.junit.Test;

public class FindPrimeNumber {
	
	
	@Test
	public void test1()
	{
		int n=1;
		boolean isPrime = valPrimenumber(n);
		 if(isPrime)
			 System.out.println("The given number is a Prime number");
		 else
			 System.out.println("The given number is not a prime number");
	}
	
	@Test
	public void test2()
	{
		int n=2;
		boolean isPrime = valPrimenumber(n);
		 if(isPrime)
			 System.out.println("The given number is a Prime number");
		 else
			 System.out.println("The given number is not a prime number");
	}
	
	@Test
	public void test3()
	{
		int n=3;
		boolean isPrime = valPrimenumber(n);
		 if(isPrime)
			 System.out.println("The given number is a Prime number");
		 else
			 System.out.println("The given number is not a prime number");
	}
	
	public boolean valPrimenumber(int n) {
		
		if (n<=1)
			return false;
		for (int i=2;i<n;i++)
		{
			if(n%i ==0)
				return false;
		}
		
		return true;
		
	}

}
