package pickacard;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
 *Kiet Hao Ho
 *991536256
 */
public class CardTrick 
{

    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7];
        Random num = new Random();
        for (int i = 0; i < magicHand.length; i++) 
        {
            Card c = new Card();
            c.setValue(num.nextInt(13)+1); 
            c.setSuit(Card.SUITS[num.nextInt(4)]); 
            magicHand[i] = c; 
        }
        Card userCard = new Card();
        int value;
        String suit;
        boolean found = false;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of the card(1-13): ");
        
        value = scan.nextInt();
        System.out.print("Enter the suit of the card" + Arrays.toString(Card.SUITS)+": ");
        
        suit = scan.next();
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        for(int i=0;i<magicHand.length;i++)
        {
           if(magicHand[i].getValue() == userCard.getValue() 
                   && magicHand[i].getSuit().equalsIgnoreCase(userCard.getSuit()))
           {
               found = true;
               break;
           }
        }
        
        if(found)
        {
           System.out.println("User card found in magicHand");
        }
        else
        {
           System.out.println("User card not found in magicHand");
        }
        
    }

}
