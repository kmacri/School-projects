/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.cardsproject;

import java.util.Scanner;

/**
 *
 * @author kmacr
 */
public class CardsProject {

    public static void main(String[] args) {

        //1. instantiate a CardDeck
        CardDeck deck = new CardDeck();
        //System.out.println(deck);
        //deck.showCardDeck();
        
        
        
        //2. Display menu of 6 options
        Scanner in = new Scanner(System.in);
        int menuSelection;
        
        do {    
            do {
                System.out.println("");
                System.out.println("What do you want to do?");
                System.out.println("1. Show the deck");
                System.out.println("2. Shuffle the deck");
                System.out.println("3. Deal a card");
                System.out.println("4. Deal and compare the next two cards");
                System.out.println("5. Start over with a new deck");
                System.out.println("6. End program");

                System.out.print("Enter a number: ");
                menuSelection = in.nextInt();
                if (menuSelection < 1 || menuSelection > 6) {
                    System.out.println("Invalid Choice");
                    System.out.println();
                    System.out.println();
                }

            } while (menuSelection < 1 || menuSelection > 6);

            if (menuSelection == 1) {
                //Display deck
                deck.showCardDeck();
                //deck.toString(deck);
            }
            if (menuSelection == 2) {
                //Shuffle the deck
                deck.shuffle();
                deck.showCardDeck();
                
                
                
            }
            if (menuSelection == 3) {
                deck.dealCard();
                deck.showCardDeck();
                //why is this deleting two cards???
            }
            if (menuSelection == 4) {
                //Deal and compare the next two cards
                
                //***Need to get dealCard to return a card
                Card firstCard = deck.dealCard();
                Card secondCard= deck.dealCard();
                
                //Card firstCard = deck.compareCards(1);
                //Card secondCard = deck.compareCards(2);
                
                System.out.println("");
                System.out.println("The first card is: " + firstCard.getSuit() + ", " + firstCard.getValue());
                System.out.println("The second card is: " + secondCard.getSuit() + ", " + secondCard.getValue());
                
                
                if (firstCard.getSuit().equals(secondCard.getSuit())){
                    System.out.println("The Suits match");
                }
                else {
                    System.out.println("The Suits do not match");
                    
                }
                
                if (firstCard.getValue() == (secondCard.getValue())){
                    System.out.println("The Values match");
                }
                else {
                    System.out.println("The Values do not match");
                    
                }
               
               

            }
            if (menuSelection == 5) {
                //Start over with a new deck 
                deck = new CardDeck();

            }
        }

        
        while (menuSelection != 6); 
}
}