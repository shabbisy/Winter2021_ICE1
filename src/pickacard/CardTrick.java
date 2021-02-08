/*
  Name: Ken Florencio
  Student Number: 991547422
  Course: SYST17796, class 1211_34537
  Professor: Sivagama Srinivasan
  Assignment: ICE1,
  Due Date: Feb 8, 2021 1:00 P.M. EST
 */
package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Ken Florencio
 * @author 991547422
 */
public class CardTrick
{

    public static void main(String[] args)
    {
        //----------- Making lucky card for Task 6 -----------

        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit(Card.SUITS[2]);
        System.out.println("Lucky card(Task 6): " + luckyCard.getValue() + " of " + luckyCard.getSuit() + "\n"); //5 of spades
      
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);                  //This gets the value of the card (Ace, 2, 3... King)
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);          //call to random number between 0 and 3 here (clubs, heart, spades, diamonds)
            magicHand[i] = c;                                       //Stores the card c into the current index of magicHand

            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }

        //------------- Getting user to pick a card, any card -----------
        Card userCard = new Card();                                //creates an instance of class Card for user's guess
        Scanner input = new Scanner(System.in);

        System.out.println("\nPlease pick a card... ANY card");
        System.out.println("First pick a value from 1 - 13");

        int userVal     = input.nextInt();                         //gets the value of card from user
        if (userVal > 13 || userVal < 1)                           //if userVal > 13 or userInput < 1, error
        {
            System.out.println("Please enter a valid number from 1 - 13");
            System.exit(1);
        }

        System.out.println("Secondly, pick a suit - 0 = Hearts, 1 = Diamonds, 2 = Spades, 3 = Clubs");

        int userSuit = input.nextInt();                            //gets suit of card from user

        if (userSuit > 3 || userSuit <0)                           //if userInput > 3 or userInput < 0, error
        {
            System.out.println("Please enter a valid number from 0 - 3");
            System.exit(1);
        }

        userCard.setValue(userVal);                                //sets user's card value to be equal to what they inputted at line 38
        userCard.setSuit(Card.SUITS[userSuit]);                    //sets user's card suit to be equal to what they input at line 39

        System.out.println("You picked: " + userCard.getValue() + " of " + userCard.getSuit());

        //----- Go through the array of magicHand and compare each card with the user's card guess ------
        for (int i = 0; i < magicHand.length; i++)
        {
            if (userCard.getValue() == magicHand[i].getValue() && userCard.getSuit().equals(magicHand[i].getSuit()))
            {
                System.out.println("You guessed the right card!");
                System.exit(1);                              //Breaks out of the for loop if the user guesses the right card
            }
        }
        System.out.println("Sorry, you picked the wrong card!");   // This code only runs if the user does not guess the right card

    }
}
