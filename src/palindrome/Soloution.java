package palindrome;

public class Soloution {
  /*
palindrome 123 true if 321 works
*/

class Solution {
    public boolean isPalindrome(int x) {
      String xword = x.toString();
      int l = xword.length();
      String flippedword = "" ;
      char[] temp = new char[20]; //i think you can also put l in here but not sure lets work with 0 for now
      for(int i = 0 ; i > l ; i++){
      char[i] = xword.charat(i);
      }
       for(j = 0 ; j > l ; j++){ //just to  test and see if it actually works
         System.out.Println("           number: ");
         System.out.Print(char[j];
       }
        for(int k = l ; 0 > k ; k--){
            flippedword = flippedword + temp[k];
            
        
        }
        switch(flippedword){
          case xword: 
          return true;
          default:
          return false;
            
      
        
      
        
        
    }
}


}
