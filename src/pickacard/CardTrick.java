package pickacard;

import java.util.*;
import java.util.Arrays;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author sirvinsi
 * Sukhpreet 991618599
 * Feb,6 2021
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Random randomNum       = new Random();
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(randomNum.nextInt(13)+1);                 // randomly generate a value between 1 to 13
            c.setSuit(Card.SUITS[randomNum.nextInt(4)]);         // randomly generate a number between [0,3] and get SUITS array as a stirng
            magicHand[i] = c;
        }
            
            Card userCard = new Card();                         // make default usercard
            boolean find  = false; 
	    
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter the value of card(1-13:)");
	    int     selectValue = input.nextInt();
            
            System.out.println("choose a type of card(Diamonds, Hearts, Spades, Clubs):");
            String  selectSuit  = input.next();
            
            userCard.setValue(selectValue);
            userCard.setSuit(selectSuit);
            
            for(int i=0; i<magicHand.length; i++)
            {
                if(magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(userCard.getSuit()))
                {
                    find = true;
                    break;
                }
            }
            
            if(find)
                System.out.println("Congrats! Your card matched");
            else
           System.out.println("oops! card not matched");
	    
	    Card luckyCard = new Card();
	    luckyCard.setValue(6);
            luckyCard.setSuit(Card.SUITS[3]);
	    
	    for(int i=0;i<magicHand.length;i++)
           {
                 if(magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit()))
           {
                 find = true;
                 break;
           }
       }
     
       // display the result 
       if(find)
           System.out.println("Lucky card is found in magicHand");
       else
           System.out.println("Lucky card is not found in magicHand");
      }
}
