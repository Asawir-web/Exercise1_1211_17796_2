/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

import java.util.Scanner;

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
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
       
        // Tells user to pick a card any card
        System.out.println("pick a card any card");
        
       
             }
        
        
        }
        
        
        
    
    

