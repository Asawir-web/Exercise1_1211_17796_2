/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifiedBy Abdallah Eghnaim - 991389869
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        //initializes an class arr of 7 instances
        Card[] magicHand = new Card[7];
       
       // for loop itterates through the hand of 7
        for (int i=0; i<magicHand.length; i++)
        {
            // following assigns each instance a random suit and random value
            magicHand[i] = new Card();
            magicHand[i].setValue((int) (Math.random()*13)+1);
            magicHand[i].setSuit(Card.SUITS[(int) (Math.random()*3)]);
        }
        

	   // hard coded Lucky card object 
        // used modifiers to choose the suit(hearts)
        // modified the value to choose 5 
        Card luckyCard =new Card(); 
        
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(5);
        
        // since I cannot compare objects with = operator
        //  accessors used  to unbox(return) 
        //them into their primitive type(int,String)
        
        String userS =luckyCard.getSuit();
        int userV= luckyCard.getValue();
        
       
      //  for loop to itterate through magicHand[] obj array
      // passed obj array into primitive types using accessors
     
        for(int j = 0; j <magicHand.length; j++){
           
            String mhS= magicHand[j].getSuit();
            
            
            int mhV=magicHand[j].getValue();
            
            
            
        // if statement used to compare magichand [] and LuckyCard
        // equals() method can compare string
        // == operater can compare int value
            
         if(userS.equals(mhS)&& userV == mhV){
         
         
         // winning message!!!
       
         System.out.println("yayy this is your card: "+userV + userS);
         
         
         
         
         
         }
            
            // losing message!!!
         else System.out.println("nope its not:"+magicHand[j].getValue()+magicHand[j].getSuit());
            
             }
        
        
        }
        
        
        
    }
    

