package week1.day1assignments;

public class IsPrime {

	public static void main(String[] args) {
		int n=21;
		int i;
		boolean num=true;
		for(i=2;i==n/2;++i);
		{
			if(n % i==0) {
				num=true;
			
			}
			if(!num) {
				System.out.println("It is a prime number");
			
				}
				
				else {
				System.out.println("It is not a prime number");

				}
		}
	}
}