package week1.day2assignment;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		
		for(int i=0;i<b.length;i++) {
			if(a[i]==b[i]) {
				System.out.println("The matched numbers are:"+a[i]);
			}
		}
		

	}

}
