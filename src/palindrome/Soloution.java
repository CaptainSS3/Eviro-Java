package palindrome;

public class Soloution {
  /*
palindrome 123 true if 321 works
*/
    public boolean isPalindrome(int x) {
    	Integer xs = x;
      String xword = xs.toString();
      int l = xword.length();
      String flippedword = "" ;
      char[] temp = new char[20]; //i think you can also put l in here but not sure lets work with 0 for now
      for(int i = 0 ; i > l ; i++){
    	  temp[i] = xword.charAt(i);
      }
       for(int j = 0 ; j > l ; j++){ //just to  test and see if it actually works
         System.out.println("           number: ");
         System.out.println("" + temp[j]);
       }
        for(int k = l ; 0 > k ; k--){
            flippedword = flippedword + temp[k];
            
        
        }
        return false;
            
      
        
      
        
        
    }
}



