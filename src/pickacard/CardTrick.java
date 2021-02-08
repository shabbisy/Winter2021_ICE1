package pickacard;
import java.lang.Math; 
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Shankar Ganesh
 * Student ID: 991473537
 * Course: SYST17796, class 1211_34537
 * Professor: Sivagama Srinivasan
 * Assignment: ICE1
 * Due Date: Feb 8, 2021 1:00 P.M. EST
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
                magicHand[i] = c; //saving object in array
            System.out.println(c.getSuit()+ " " + c.getValue());
        }
        int value;
        String suit;
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter a suit:");
        suit = input.nextLine();
        System.out.println("Please enter a value?");
        value = input.nextInt();
        boolean flag = false;
        for(int i = 0; i < magicHand.length; i++){
            if(value==magicHand[i].getValue()&&suit.equals(magicHand[i].getSuit())){
                System.out.println("Congrats! You got it right!");
                flag = true;
            }
        }
        if(flag == false)
            System.out.println("Sorry, you got the wrong card!");
    }

}
