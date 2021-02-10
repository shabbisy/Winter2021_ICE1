package pickacard;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 * @modifier Christina Kwamie
 * @studentid 991444121
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            int randomSuit = (int)(Math.random() *4);
            int randomValue = (int)(Math.random() * 13 +1);
            c.setSuit(Card.SUITS[randomSuit]);
            c.setValue(randomValue);
            
            magicHand[i]= c; 
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a Value (1-13):");
        int valueUser = sc.nextInt();
        System.out.println("Pick a Suit (0- Hearts, 1- Diamonds, 2- Clubs, "
                + "3- Spades):");
        int suitUser = sc.nextInt();
        
        Card d = new Card();
        d.setSuit(Card.SUITS[suitUser]);
        d.setValue(valueUser);
        
        
        boolean found = false;
                
        for (int i = 0; i < magicHand.length; i++) {
            
            if(magicHand[i].getSuit() == d.getSuit() && 
                    magicHand[i].getValue() == d.getValue()){
                 
                found = true;         
            }
 
        }
        
        if(found){
            System.out.println("Your Card Matches!");
        }else{
            System.out.println("\n"+"Your Card Did Not Match With The Magic Hand");
        }
        
        
        
    }

}
