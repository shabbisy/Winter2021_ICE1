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
            c.setSuit(Card.SUITS[c.randomSuit()]);
            c.setValue(c.randomValue());
            magicHand[i] = c;
        }
        
        for(int i=0; i<magicHand.length; i++){
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }

        //insert code to ask the user for Card value and suit, create their card

        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a suit of cards (Hearts, Diamonds, Spades, Clubs)");
        String userSuit = input.next();
       
        System.out.println("Enter a value between 1 - 13");
        int userValue = input.nextInt();
        
        
        //and search magicHand here
        Card user = new Card();
        
        //Then report the result here
        
        System.out.println("Your card found a match!");
    }

}
