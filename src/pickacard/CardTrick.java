package pickacard;

import java.util.Scanner;
import java.lang.Math;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int value = (int)(Math.random() * 13);
            c.setValue(13);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])\
            
            c.setSuit(Card.SUITS[3]);
            System.out.println(Card.SUITS[3] + " " + value);
            
        }

        //insert code to ask the user for Card value and suit, create their card
        String suitCard;
        int cardValue;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a suit of cards (Hearts, Diamonds, Spades, Clubs)");
        suitCard = input.nextLine();
        
        System.out.println("Enter a value between 1 - 13");
        cardValue = input.nextInt();
        
        
        //and search magicHand here
        //Then report the result here
        
        System.out.println("Your card found a match!");
    }

}
