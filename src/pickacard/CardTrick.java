package PickACard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author srinivsi
 */

 /**
    @author = Shreya Piyushkumar Patel
    Student ID = 991616971
 */

public class CardTrick
{
    public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
		
		
	   for (int i=0; i<magicHand.length; i++) 
	   {
		    magicHand[i] = new Card(SUITS[(int)(Math.random()*4)],(int)(Math.random()*13)+1 );
			
	   }

	   for (int i=0; i<magicHand.length; i++) 
	   {
		    System.out.println ( magicHand[i].toString() );
	   }
        
        
		Scanner input = new Scanner (System.in);
		
		System.out.println("Choose type of Card (diamonds,spades,club and hearts)");
		String userSuit = input.nextLine();
		System.out.println("Choose a Card Number(1-13)");
		int userValue = input.nextInt();
		
				
		Card userCard = new Card(userSuit,userValue);
		
		for(int i=0; i<magicHand.length;i++)
		{
			magicHand[i] = userCard;
			
		}
		
		
		
		if(magicHand[0] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[1] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[2] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[3] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[4] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[5] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[6] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else
		{
			System.out.println("Sorry your card doesn't matched");
		}
	    
	    Card luckyCard = new Card("Diamonds" , 1);
		
		if(magicHand[0].equals( luckyCard))
		{
			System.out.println("Congrats your luckycard matched");
		}
		else if(magicHand[1].equals( luckyCard))
		{
			System.out.println("Congrats your luckycard matched");
		}
		else if(magicHand[2].equals( luckyCard))
		{
			System.out.println("Congrats your luckycard matched");
		}
		else if(magicHand[3].equals( luckyCard))
		{
			System.out.println("Congrats your luckycard matched");
		}
		else if(magicHand[4].equals( luckyCard))
		{
			System.out.println("Congrats your luckycard matched");
		}
		else if(magicHand[5].equals( luckyCard))
		{
			System.out.println("Congrats your luckycard matched");
		}
		else if(magicHand[6].equals( luckyCard))
		{
			System.out.println("Congrats your luckycard matched");
		}
		else
		{
			System.out.println("Sorry your luckycard doesn't matched");
		}
		
		
		
		
    }
    
}



