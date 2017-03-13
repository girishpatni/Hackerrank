package pkg;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str = "abcabccbcbaasadfjhbuewfrhjhjdsaf"; 
		System.out.println(removeDuplicate(str));

	}
	private static String removeDuplicate(String str){
		int [] charset =new int[26];
		for(int i=0;i<str.length();i++){
				charset[(int)(str.charAt(i)-'a')]+=1;
		}
		StringBuilder result= new StringBuilder();
		for(int i=0;i<str.length();i++){
			if(charset[(int)(str.charAt(i)-'a')]>0){
				result.append(str.charAt(i));
				charset[(int)(str.charAt(i)-'a')]=0;
		    }
		}
		return result.toString();	
	}

}
