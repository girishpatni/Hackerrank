import java.util.Scanner;
public class Solution{
    public static int stepCounts(String str){
		int index=0;
		int length=str.length();
		int steps=0;
		char []word=str.toCharArray();
		for(int i=length-1;i>=(length/2);i--){
				while(word[i]!=word[index])
				{
					if(word[index]>word[i])
						word[i]=(char)(((int)word[i])+1);
					else
						word[i]=(char)(((int)word[i])-1);
					steps++;
				}
				index++;
		}
		return steps;
	}
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(int i=1;i<=N;i++){
			String str = in.next();
			System.out.println(stepCounts(str));
        } 
    }
}
