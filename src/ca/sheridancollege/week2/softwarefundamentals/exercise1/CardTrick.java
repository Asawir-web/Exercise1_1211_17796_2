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
        
        /*--------------THE USER-CARD ASKING CODE IS COMMENTED OUT-----------
                                --  STEP 7 --                                **/
//      //insert code to ask the user for Card value and suit, create their card
//        
//      Card userCard = new Card();                   //user-card object created
//            Scanner sc = new Scanner(System.in);
//        
//        System.out.printf("%-30s", "Enter your suit : ");
//          String userSuit = sc.nextLine();        //user-input for user's Suit
//          
//          System.out.printf("%-30s", "Enter your value of suit : ");
//          int userValue = sc.nextInt();          //user-input for user's Value
//       
//          userCard.setSuit(userSuit);                  
//          userCard.setValue(userValue);
//
//          System.out.println("");
//          System.out.println("Your Card is : " + userCard);
     
        // A new hard-coded object luckyCard is created (Step 7) 
        Card luckyCard = new Card();
            luckyCard.setSuit(Card.SUITS[3]);
            luckyCard.setValue(10);      
          
        // and search magicHand here
        
        /** THE ATTRIBUTES OF LUCKY-CARD OBJECT ARE COMPARED WITH THE ATTRIBUTES
            OF THE OBJECTS OF MAGIC-HAND ARRAY AND THE RESULT IS A BOOLEAN 
                                        STEP 7                                */
         boolean isTrue = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (luckyCard.getSuit().equals(magicHand[i].getSuit()) && 
                    luckyCard.getValue() == magicHand[i].getValue()) {
                isTrue = true;
            } 
        }    
        
        //Then report the result here
        
        /** THE WINNER MESSAGE IS DISPLAYED IF THE USER WINS
            THE LOSER MESSAGE IS DISPLAYED IF THE USER LOSES  
                                        STEP 7                                */       
        if (isTrue) {
           System.out.println("Congrats! You Won! The card was : " + luckyCard);
            System.out.println("");
            System.out.println("The Magic Hand is : ");
        for (int i = 0; i < magicHand.length; i++) {
                System.out.println(magicHand[i]);
        }
        }else {
            System.out.println("Sorry! You Lost! The card was : " + luckyCard);
            System.out.println("");
            System.out.println("The Magic Hand is : ");
        for (int i = 0; i < magicHand.length; i++) {
                System.out.println(magicHand[i]);
            }
        } 
    }   
}
