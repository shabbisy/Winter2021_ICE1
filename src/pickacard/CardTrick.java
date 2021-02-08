package pickacard;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 * 
 * Modifier:       Neil-Bryan Caoile
 * Student-Number: 991590424
 */
public class CardTrick {

    public static void main(String[] args) {
        Random randNum = new Random();
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int valueRand = 1 + randNum.nextInt(13);
            c.setValue(valueRand);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int suiteRand = randNum.nextInt(4);
            c.setSuit(Card.SUITS[suiteRand]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose type of card(diamond,spade,club and heart): ");
        String suitUserInputString = scanner.nextLine();
        System.out.println("Choose type of card Number (1-13)");
        int valueUserInput = scanner.nextInt();
        // and search magicHand here & Then report the result here
         for (int i = 0; i < magicHand.length; i++) {
            suitUserInputString.toLowerCase();
            if ((magicHand[i].getValue() == valueUserInput) && (magicHand[i].getSuit().equals(suitUserInputString))) {
                System.out.println("Card Matched!!!");
            }

        }
    }
}
