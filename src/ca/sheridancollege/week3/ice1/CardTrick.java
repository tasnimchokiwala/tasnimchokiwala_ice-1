/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Tasnim Chokiwala
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random random = new Random();
            //c.setValue(insert call to random number generator here)
            c.setValue(random.ints(1, 14).findFirst().getAsInt());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[random.ints(0, 4).findFirst().getAsInt()]);           
            magicHand[i] = c;
        }
    
        Card luckyCard = new Card();
        luckyCard.setSuit(Card.SUITS[2]);
        luckyCard.setValue(5);
        boolean isCardInMagicHand = false;
        
        // search magicHand here
        for(int i=0;i<magicHand.length;i++)
        {
            if(magicHand[i].getSuit().equals(luckyCard.getSuit()))
            {
              if(magicHand[i].getValue() == luckyCard.getValue())  
              {
                  isCardInMagicHand = true;
              }
            }
        }
        
        
        if(isCardInMagicHand)
        {
            System.out.println("Your card is in the magic hand");
        }
        else
        {
            System.out.println("Your card is not in the magic hand");
        }      
    }
    
}
