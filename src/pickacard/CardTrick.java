package pickacard;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 * @author Karan Boparai
 * @author dancye
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] Karan) {
        
        int inputSuit, inputValue;
        boolean handHasCard = false;
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuit("Diamonds");

        for (int i = 0; i < magicHand.length; i++) 
        {
            Card c = new Card();
            c.setValue((int) Math.floor( (Math.random()*13) + 1));
            c.setSuit(Card.SUITS[(int) Math.floor( (Math.random()*4))]);
            magicHand[i] = c;
        }

        Card userCard = new Card();
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Please select a cart suit");
            System.out.println("1 for Hearts, 2 for Diamonds, 3 for Spades or 4 for Clubs");
            inputSuit = input.nextInt();
        }
        while (inputSuit < 1 || inputSuit > 4);
        do
        {
            System.out.println("Please enter a card value between 1 and 13");
            inputValue = input.nextInt();
        }
        while (inputValue < 1 || inputValue > 13);

        userCard.setSuit(Card.SUITS[inputSuit - 1]);
        userCard.setValue(inputValue);
        
        System.out.println("Your card:");
        System.out.println("Suit: " + userCard.getSuit());
        System.out.println("Value: " + userCard.getValue());

        for (int i = 0; i < magicHand.length; i++)
        {
            if (magicHand[i].getSuit() == userCard.getSuit() && magicHand[i].getValue() == userCard.getValue())
            {
                handHasCard = true;
            }
        }

        if (handHasCard == true)
        {
            System.out.println("The Magic Hand does contain your card");
        }
        else
        {
            System.out.println("The Magic Hand does NOT contain your card");
        }
    }

}
