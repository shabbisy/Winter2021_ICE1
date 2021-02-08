/*
    Name: Ismael Marquez Jimenez
    Student Number: 991627630
    Course: SYST 17796
    Professor: Sivagama Srinivasan
    Assignment ICE_1
    Date: February 8, 2021
 */

package pickacard;
import java.sql.SQLOutput;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args) {
        
        //Step 6: adding a card object called luckyCard
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Diamonds");
        
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)((Math.random()*13)+1));

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);

            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner userInput = new Scanner(System.in);
        System.out.println("Step right up, step right up! Come and try your luck!");
        System.out.println("In this game you will be asked to pick a card value and corresponding suit, if the card is in the hand, you win!");
        System.out.println("\n" + "Alright, please pick a card value (1-13)");
        int userCardValue = userInput.nextInt();
        System.out.println("Excellent, now please enter a suit:");
        userInput.nextLine();
        String userCardSuit = userInput.nextLine();

        Card userCard = new Card();

        userCard.setValue(userCardValue);
        userCard.setSuit(userCardSuit);

        // and search magicHand here
        boolean cardFound = false;
        for (int x = 0; x < magicHand.length; x++) {
            if(magicHand[x].getValue() == userCard.getValue() && magicHand[x].getSuit().equals(userCard.getSuit()))
                cardFound = true;
            else
                cardFound = false;
        }

        //Then report the result here
        if (cardFound == true) {
            System.out.println("\n" + "Winner! Your card, the " + userCardValue + " of " + userCardSuit + " is in the hand!");
        }
        else {
            System.out.println("\n" + "Better luck next time! The card: " + userCardValue + " of " + userCardSuit + " was not in the hand.");
        }
        System.out.println("The cards in the hand are: ");
        for (int x = 0; x < magicHand.length; x++) {
            System.out.println(magicHand[x].getValue() + " of " + magicHand[x].getSuit());
        }
    }

}
