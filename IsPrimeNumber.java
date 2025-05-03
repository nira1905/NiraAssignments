package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x = 8;
     
     boolean isPrime = true;
     
     for (int i=2; i<= x-1; i++) {
    	 if (x % i == 0)
    	 {
    		 isPrime = false;
    	 }
     }
	
	
	if (isPrime)
	{
		System.out.println(x + " is prime");
	} else 
	{
		System.out.println(x + " is not prime");
	}
}}
