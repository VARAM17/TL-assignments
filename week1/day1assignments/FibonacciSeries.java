package week1.day1assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n=6;
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
				
				for(int i = 1;i<=n;i++) {
					int c=a+b;
					System.out.println(c);
					a=b;
					b=c;
					
				}

	}
}
