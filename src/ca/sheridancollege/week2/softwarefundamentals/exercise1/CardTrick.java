// @Author            :   ASAWIR AHMED
// @Student Number    :   991618277
// @Purpose           :   Exercise 01 {SOFTWARE FUNDAMENTALS}
// @Date Assigned     :   25/01/2021
// @Date Due          :   01/02/2021
// @Date Attempted    :   26/01/2021

package ca.sheridancollege.week2.softwarefundamentals.exercise1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
 public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++){
           
            magicHand[i] = new Card();
            
            //7 random suites created : 
            magicHand[i].setSuit(Card.SUITS[(int)(Math.random()* 4)]);
            
            //7 random values of suits created : 
            magicHand[i].setValue((int) (Math.random() * 13 ) + 1);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        Card userCard = new Card();                   //user-card object created
            Scanner sc = new Scanner(System.in);
        
        System.out.printf("%-30s", "Enter your suit : ");
            String userSuit = sc.nextLine();        //user-input for user's Suit
          
          System.out.printf("%-30s", "Enter your value of suit : ");
            int userValue = sc.nextInt();          //user-input for user's Value
        
          userCard.setSuit(userSuit);                  
          userCard.setValue(userValue);

          
        // and search magicHand here
        //Then report the result here
    }
    
}
