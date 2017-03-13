package pkg;

import java.util.Scanner;

public class Hackerrank_InsertionSort2 {

	public static void insertionSortPart2(int[] arr)
    {     int index=1;
          for(int i=index;i>0;i--){
        	  if(arr[index]<arr[index-1]){
        		  int temp = arr[index];
        		  arr[index-1] =arr[index];
        	  }
        		  
          }
    }       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       in.close();
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
