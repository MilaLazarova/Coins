
package coins;

public class Coins {

    public static void main(String[] args) {
        Coin[] c=new Coin[2];
       
        c[0]=new Coin();
        c[1]=new Coin();
        c[1].Flip();
        c[0].Flip();
        
        System.out.println("Resultata za c1 e"+c[0]+" i za c2 e"+c[1]);
    }
    
}
