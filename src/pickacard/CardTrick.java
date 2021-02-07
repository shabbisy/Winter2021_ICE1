package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args) 
    {
        
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();  
            magicHand[i] = c;
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);                                    //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int) (Math.random() * 13 + 1));                                              //c.setValue(insert call to random number generator here)
            System.out.print(c.getSuit());
            System.out.println(", " + c.getValue());  

        }
        
        Scanner input = new Scanner(System.in);                                                 //insert code to ask the user for Card value and suit, create their card
            System.out.println("Choose a Suit for card (Hearts, Diamond, Spades, Clubs:");
            String userSuit = input.next();
            System.out.println("Enter a number to go with your suit from (1-13): ");
            int userValue = input.nextInt();
       

       for(Card c: magicHand)                             //and search magicHand here                          
        {
           boolean find = c.getSuit().equals(userSuit) && c.getValue() == userValue;
            if (find == true)
            {
                System.out.println("Your card did not match, Please try again...");
                  break;
            }
            else
            {
                System.out.println("Congratulations, Your card matched!!");
            }
                                                                                                 //Then report the result here
        }

    }
}

