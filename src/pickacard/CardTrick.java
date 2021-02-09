package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 * Programmed by: Tommy Chiu
 * Student ID: 991535148
 */
public class CardTrick 
{
    public static void main(String[] args) 
    {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) 
        {
            Card c = new Card();
            c.setSuit(Card.SUITS[c.randomSuit()]);
            c.setValue(c.randomValue());
            magicHand[i] = c;
        }
        for(int i = 0; i < magicHand.length; i++)
        {
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a suit of cards (Hearts, Diamonds, Spades, Clubs)");
        String playerSuit = input.next();
       
        System.out.println("Enter a value between 1 - 13");
        int playerValue = input.nextInt();
        
        Card player = new Card();
        player.setSuit(playerSuit);
        player.setValue(playerValue);
        
        boolean found = false;
        
        Card luckyCard = new Card();
    
        luckyCard.setSuit("Spades");
        luckyCard.setValue(7);
    
        for(int i = 0; i < magicHand.length; i++)
        {
            if(player.getSuit().equals(luckyCard.getSuit()) && player.getValue() == luckyCard.getValue())
            {
                found = true;
            }
        }
            if(found)
            {
                System.out.println("The lucky card is " + luckyCard.getValue() + " of " + luckyCard.getSuit() + ". Congrats!");
            }
            else
            {
                System.out.println("The lucky card was " + luckyCard.getValue() + " of " + luckyCard.getSuit() + ". You did not find the lucky card!");
            }
        

       for(int i = 0; i < magicHand.length; i++)
        {
           if(magicHand[i].getSuit().equals(player.getSuit()) && magicHand[i].getValue() == player.getValue())
            {
               found = true;
            }
        }
            if(found)
            {
                System.out.println("Your card " + player.getValue() + " of " + player.getSuit() + " was found within the magic hand!");
            } 
            else 
            {
                System.out.println("Your card was not found");
            }
        
    }
}
