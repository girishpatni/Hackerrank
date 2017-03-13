package pkg;

import java.util.Scanner;

class CountZeros{
	public static void main(String []args){
		Scanner in =new Scanner(System.in);
		int num =in.nextInt();				
		System.out.println(numZeros(num));	
		in.close();
	}
	private static int numZeros(int n){
		int count =0;
		int temp =1;
		while(n>temp){
			if((n&temp)==0)
				count++;
			temp<<=1;
		}
		return count;
	}	
}
