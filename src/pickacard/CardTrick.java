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
        System.out.println("Lucky card: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        
        Card[] magicHand = new Card[7];
        System.out.println("Magic hand: ");

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13 + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 3)]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getValue() + " of" + magicHand[i].getSuit());
        }
        
        boolean isInMagicHand = false;
        
        for(int i = 0; i < magicHand.length; i++) {            
            if(luckyCard.getValue() == magicHand[i].getValue() 
                    && luckyCard.getSuit().equals(magicHand[i].getSuit())) {
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
