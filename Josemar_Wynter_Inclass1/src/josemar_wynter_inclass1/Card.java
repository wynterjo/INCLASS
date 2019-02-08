/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josemar_wynter_inclass1;

/****
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card.
 * To be used as starting code for ICE 1
 * @author Sivagami
 */
import java.util.Scanner;
public class Card {

    /**
     * @param args the command line arguments
     */
    //insert 2 random number methods for value and suit
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
	CardBase[] magicHand = new CardBase[7];
	CardBase c = new CardBase();
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            int randValue = (int)(Math.random() * 13) + 1;
            int randSuit = (int)(Math.random()*3) + 0;
        
            //c.setValue(insert call to random number generator here)
            c.setValue(randValue);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(CardBase.SUITS[randSuit]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("1. What is your card value:");
	int cardValue = input.nextInt();
	System.out.println("What is your card suit:");
	String cardSuit = input.next();
        // and search magicHand here
        if (cardValue == c.getValue() && cardSuit == c.getSuit()){
		System.out.println("Congrats you win");
		System.out.println("The card was " + c.getValue() + " of " + c.getSuit());
	}
	else{
		for (int j=2; j<=magicHand.length; j++){
			System.out.println("\nTry again");
			System.out.println(j+". What is your card value:");
			cardValue = input.nextInt();
			System.out.println("What is your card suit:");
			cardSuit = input.next();
	//Then report the result here
                	if (j==7){
                        	System.out.println("The card was " + c.getValue() + " of " + c.getSuit());
			}   
            }
        }
    }
}