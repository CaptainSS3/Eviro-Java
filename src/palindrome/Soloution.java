package palindrome;

public class Soloution {
  /*
palindrome 123 true if 321 works
*///
    public boolean isPalindrome(int x) {
    	Integer xs = x;
    	System.out.println(x);
      String xword = xs.toString();
      System.out.println(xword);
      int l = xword.length();
      System.out.println(l);
      String flippedword = "" ;
      char[] temp = new char[20]; //i think you can also put l in here but not sure lets work with 0 for now
      for(int i = l ; i < 0 ; i--){
    	  temp[i] = xword.charAt(i);
      }
      System.out.println("its put in the list");
      for(int h = l ; h > 0 ; h--){
    	  System.out.println(temp[h]);
      }

        return false;
            
      
        
      
        
        
    }
}



