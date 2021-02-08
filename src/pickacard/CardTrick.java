package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Zubear Nassimi
 * Student # 991 628 529
 * Class: SYST 17796
 * Instructor: Sivagama Srinivasan
 * assignment ICE_1
 */

public class CardTrick 
{
    public static void main(String[] args) 
    {
        Card luckyCard = new Card();
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(6);
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) 
        {
            Card c = new Card();
            c.setValue((int) (1+Math.random()*13));
            c.setSuit(Card.SUITS[(int) (0+Math.random()*3)]);
            magicHand[i]=c;
        }
        
        for (int i = 0; i < magicHand.length; i++)
        {
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
        
        Scanner userCardValue=new Scanner(System.in);
        System.out.println("enter a number from 1 - 13 for your card value:");
        int userValue = userCardValue.nextInt();
        
        Scanner userCardSuit=new Scanner(System.in);
        System.out.println("type Hearts, Diamonds, Spades or Clubs (case-sensitive!):");
        String userSuit = userCardSuit.nextLine();
                
        int count = 0;
        for (int i=0; i < magicHand.length; i++)
        {
            if (magicHand[i].getSuit().equals(userSuit) && userValue == magicHand[i].getValue())
            {
                count++;
            } 
        }
        
        if (count >= 1)
        {
            System.out.println("Congrats you got a Match!");
        }
        else
        {
            System.out.println("Sorry better luck next time");
        } 
    }
}
