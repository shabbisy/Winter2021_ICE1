package pickacard;
// Name: Akshita Sreenivasulu
// Date: February 10, 2020
// Student ID Number: 991592661
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 * @author akshita
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            Random rn = new Random();
            int value1 = rn.nextInt(13-1+1)+1;
            int value2 = rn.nextInt(3+1);
            
            //c.setValue(insert call to random number generator here)
            c.setValue(value1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[value2]);
            
            magicHand[i] = c;
        }

        Scanner in = new Scanner(System.in);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
