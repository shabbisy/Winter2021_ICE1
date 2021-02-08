package pickacard;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 * @author Bezawit Abebe 991585378
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
            Scanner input =  new Scanner(System.in);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13));
            
             //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            
            magicHand[i]=c;
           
        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please Enter the Card Value(choose a number between 1-13): ");
        int value = input.nextInt();
        Card user = new Card ();
        user.setValue(value);
        input.nextLine();
        
        System.out.println("Enter the Suit (0-Hearts, 1-Diamonds, 2- Spades, 3- Clubs): ");
        int suitval = input.nextInt();
        user.setSuit(Card.SUITS[suitval]);
        
        Card luckycard = new Card();
        luckycard.setValue(3);
        luckycard.setSuit(Card.SUITS[3]);
        
        // searhing the Magic Hand to see if the LuckyCard is in it
        
        int luck = 0;
        for (Card magicCard: magicHand){
            if(magicCard.getValue() == luckycard.getValue() && magicCard.getSuit() == luckycard.getSuit()){
                luck=1;
            } else {
                luck=0;
            }
        }
        
        //Then report the result here
        
        if (luck ==0){
            System.out.println("Sorry! This card is not in the Magic Hand.");
        } else {
            System.out.println("Congrats! This card is in the Magic Hand!");
        }
        
        // Print Out Magic Hand to confirm Lucky Card is/ isn't in the there
        
          System.out.println(Arrays.deepToString(magicHand));
    }

}
