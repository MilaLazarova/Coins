
package coins;
import java.util.*;
public class Coin {
    private char res;
    private static Random ram=new Random();
 
   public Coin()
   {
   Flip();
   }
   public void Flip()
   {
   res=ram.nextBoolean()?'H':'T';
   }
    
  char getRes(){
      return res;
  }
  public String toString(){
  return " "+res;
  
  }
}
