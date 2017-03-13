package pkg;

import java.util.HashSet;
import java.util.Set;

public class CountPalindromes {

    public static void main(String[] args) {
    
        String test = "aabaa";
        System.out.println(palindromes(test));
    }


    public static int countPalindromes(String str) {

        int palindromes = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1, k = i; k > 0 && j < str.length(); j++) {
                if (str.charAt(k) == str.charAt(j))
                    palindromes++;
                k -= 1;
                if (str.charAt(k) == str.charAt(j))
                    palindromes++;
            }
        }
        return palindromes;
    }
    
    
    static int palindrome(String str) {
        Set<String> palindromes =new HashSet<String>();
        Set<String> rejectPalindromes =new HashSet<String>();
        String current =null;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                current=str.substring(i,j);
                if(!palindromes.contains(current) && !rejectPalindromes.contains(current)){
                    if(!isPalindrome(current)){
                       rejectPalindromes.add(current) ;                     
                    }
                    else{
                       palindromes.add(current); 
                    }
                }
            }
        }
         return palindromes.size();
     }
     
     static boolean isPalindrome(String str){
         int strLength = str.length();
         if(str!=null){
             for(int i=0;i<strLength/2;i++){
                 if(str.charAt(i)!=str.charAt(strLength-i-1))
                     return false;
             }
         }
         return true;        
     }
     
     
     static int palindromes(final String input) {
         final Set<String> palindromeSet = new HashSet<String>();
         for (int i = 0; i < input.length(); i++) {
             expandPalindromes(palindromeSet,input,i,i+1);
             expandPalindromes(palindromeSet,input,i,i);
         } 
         return palindromeSet.size();
      }

      static void expandPalindromes(final Set<String> result, final String input, int i, int j) {
          while (i >= 0 && j < input.length() && input.charAt(i) == input.charAt(j)) {
                result.add(input.substring(i,j+1));
                i--; j++;
          }
      }
}
