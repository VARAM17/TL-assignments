package week1.day2assignment;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] data= {1,4,3,2,8,6,7};
		int length=data.length;
		Arrays.sort(data);
		//1,2,3,4,6,7,8
		for(int i=1;i<length;i++) {
			if(data[i-1]!=i) {
				System.out.println("Missing No:"+i);
				break;
			}
	
		}
		 
}

}