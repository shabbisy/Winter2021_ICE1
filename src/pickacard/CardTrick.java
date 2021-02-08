package pickacard;
import java.lang.Math;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 * Name : Mandeep Singh (ManiUbhi Github UserName)
 * Student Id : 991630288
 * 
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        // Setting out the lucky card
        Card luckyCard = new Card();
        luckyCard.setSuit("Spades");
        luckyCard.setValue(5);
        // Filling out random suits and vals in magic hand
        for (int i = 0; i < magicHand.length; i++) {
            Card c      = new Card();
            c.setValue(generateRandomNumber(1,13));
            c.setSuit(c.SUITS[generateRandomNumber(0,3)]);
            magicHand[i] = c;
        }
        //for(Card c : magicHand){System.out.println(c);}  for cheating, finding out the available cards
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hi Welcome to The Card Trick\nChoose your Suit below");
        System.out.println("Hearts,Diamonds,Spades,Clubs respectively,Check your spells, Never Mind");
        String inpSuit = userInput.next();
        System.out.println("Cool!, now select the number between 1 to 13");
        int inpNum= userInput.nextInt();
        boolean answer = findCard(inpSuit,inpNum, magicHand, luckyCard);
        System.out.println ((answer) ? "BullsEye!, You got it" : "Bad luck,Never Mind");
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
    
    // Utility function for generating random values
    // Time Complexity O(1)
    // Space Complexity O(1)
    public static int generateRandomNumber(int low, int high)
    {
        int range   = high - low;
        int num     = (int) (Math.random()*range+low);
        return num;
    }
    // Utility function to finding out the cards in a magichard
    // Time Complexity O(n)
    // Space Complexity O(1)
    public static boolean findCard(String suit,int num, Card[] cards, Card luckyCard){
        for (Card c : cards){
            if ((c.getValue()   == num) && (c.getSuit().equals(suit))){
                if ((c.getValue()   == luckyCard.getValue()) && (c.getSuit().equals(luckyCard.getSuit())))
                {System.out.println("Lucky Card <- ->");}
                return true;
            }
        }
        return false;
    }
}
