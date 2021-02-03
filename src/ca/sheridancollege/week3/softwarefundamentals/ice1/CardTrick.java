/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Megha Patel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            int n = (int)(Math.random() *(13)+1);
            c.setValue(n);
            int s = (int)(Math.random() * 4);
            c.setSuit(Card.SUITS[s]);
            magicHand[i] = c;
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        //        for (int i =0 ; i < magicHand.length; i++) {
        //            	System.out.print(magicHand[i].getValue() + "\n");
        //        	System.out.print(magicHand[i].getSuit() + "\n");
        //        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit("Clubs");
        
        boolean inHand = false;
        
        for (int i =0; i<magicHand.length; i++) {
        	
        	if (magicHand[i].getValue() == luckyCard.getValue()) {
        		
        		if (magicHand[i].getSuit().equals(luckyCard.getSuit())) {
        			
        			inHand = true;
        		}
        	}
        }

        
        
        if (inHand == true) {
        	System.out.print("Found!");
        }
        else {
        	System.out.print("Not Found");
        }
        
        
        
        
        
        
    }
    
}
