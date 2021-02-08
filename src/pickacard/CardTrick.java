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
        Card userIput = new Card();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the value of the card (1 to 13): ");
        
        int value = scan.nextInt();
        System.out.print("Please enter the suit of the card " + Arrays.toString(Card.SUITS)+": ");
        
        String suit = scan.next();
        userIput.setValue(value);
        userIput.setSuit(suit);
        
        for(int i = 0; i < magicHand.length; i++)
        {
            if(userIput.getValue() == magicHand[i].getValue() 
                && magicHand[i].getSuit().equals(userIput.getSuit()))
            {
                System.out.println("User's card is in the Magic Hand ");
                break;
            }
            else
            {
                System.out.println("User's card is not in the Magic Hand ");
                break;
            }
        }
    }

}
