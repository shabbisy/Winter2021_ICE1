package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 * Nitin Minhas
 * Student # 991381688
 */
public class CardTrick {

    public static void main(String[] args) 
    {
        
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();  
            magicHand[i] = c;
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);                                         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int) (Math.random() * 13 + 1));                                               //c.setValue(insert call to random number generator here)
            System.out.print(c.getSuit() + ", " + c.getValue());  

        }
        
        Scanner input = new Scanner(System.in);                                                       //insert code to ask the user for Card value and suit, create their card
            System.out.println("Choose a Suit for card (Hearts, Diamond, Spades, Clubs:");
            String userSuit = input.next();
            System.out.println("Enter a number to go with your suit from (1-13): ");
            int userValue = input.nextInt();
      
        for(Card c: magicHand)                                                                        //and search magicHand here                          
        {   
            if (c.getSuit().equals(userSuit) && c.getValue() == userValue)                            //Then report the result here
            {
                System.out.println("Congratulations, Your card matched!!");
                    break;
            }
            else
            {

                System.out.println("Your card did not match, Please try again...");
            }
                                                                                                 
        }
       
     
      Card luckyCard = new Card();
        luckyCard.setSuit(Card.SUITS[2]);
        luckyCard.setValue(1);
        
        for(Card c:magicHand)                                                                          //and search magicHand for lucky card                          
        {
            if (c.getSuit().equals(luckyCard.getSuit()) && c.getValue() == luckyCard.getValue())
            {
                System.out.println("You got the lucky card, You Win!!");
                  break;
            }                                                                                          //Then report the result here
        }
    }

}

