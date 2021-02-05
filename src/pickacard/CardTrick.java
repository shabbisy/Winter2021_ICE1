package pickacard;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author janeya - 991461495
 * @author srinivsi
 */
public class CardTrick 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Card> magicHand = new ArrayList<>();

        for(int i = 0; i < 7; i++) //generates 7 random cards
        {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*12)+1);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            
            magicHand.add(c);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Please enter a card value and suit separated by a space: ");
        int    myValue  = input.nextInt();
        String mySuit   = input.next();
        
        Card myCard = new Card();
        
        myCard.setValue(myValue);
        myCard.setSuit(mySuit);
        
        // and search magicHand here
        boolean isInHand = false;
        for(Card searchCard : magicHand)
        {
        //Then report the result here
            if(searchCard.equals(myCard))
                isInHand = true;
            else
                isInHand = false;
        }
        
        if(isInHand == true)
            System.out.println("Your card,  " + myValue + " of " + mySuit
            + " is in the hand!");
        else
            System.out.println("Your card was not in the hand.");
        
        System.out.print("The Hand: " + magicHand);
    }
}
