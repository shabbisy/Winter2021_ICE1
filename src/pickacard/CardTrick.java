package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 * @author Adrian Davies 991524635
 * Date modified: 02/08/2021
 */
public class CardTrick {

    public static void main(String[] args) {
        Card luckyCard = new Card;
        luckyCard.setValue(6);
        luckyCard.setSuit("Clubs");
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13 + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 3)]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        Scanner userInput = new Scanner(System.in);
        System.out.print("Pick a Card value: ");
        int userValue = userInput.nextInt();
        System.out.print("Pick a Card suit: ");
        String userSuit = userInput.next();
        
        Card myCard = new Card();
        myCard.setValue(userValue);
        myCard.setSuit(userSuit);
        
        boolean isInMagicHand = false;
        
        for(int i = 0; i < magicHand.length; i++) {            
            if(myCard.getValue() == magicHand[i].getValue() 
                    && myCard.getSuit().equals(magicHand[i].getSuit())) {
                isInMagicHand = true;
                break;
            }
        }
        //Then report the result here
        String result = "";
        
        if(isInMagicHand == true) {
            result = "Your card is in the magic hand!";
        }
        else {
            result = "Your card is not in the magic hand.";
        }
        
        System.out.println(result);
    }

}
