/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cardsproject;

import java.util.Random;

/**
 *
 * @author kmacr
 */
public class CardDeck {

    //attributes
    final static int numberOfCards = 52;  // Used for the number of cards in the array 
    final static int CARDS_PER_SUIT = 13;

    //Array of cards called deck, which is an array of 52 cards
    Card[] deck = new Card[numberOfCards];

    //For the shuffle class
    //Card[] temporaryCard = new Card[numberOfCards];
    Card [] tempArray = new Card[numberOfCards];

    //1 argument constructor that passes in a collection of card objects 
    //public CardDeck(Card[] deck) {   
    //    this.deck = deck;
    //}
    //Contructor without arguements that will build a deck of cards
    public CardDeck() {
        initialize();
    }

    /*
    *This will iterate through each enum value one at a time
    *For each enum value (HEART, SPADE etc...) 13 cards will be made and added to deck array
    * The card will have Suit attribute of the current suit and value of current iteration 1-13
     */
    private void initialize() {
        //for each suit...
        int c = 0;
        for (Suit s : Suit.values()) {    //returns each of the values in the enum (HEARTS, SPADES etc...
            //perform 13 times for each suit
            for (int i = 1; i < CARDS_PER_SUIT+1; i++) {
                //13 times add a card with the suit and number iteration (1,2,3 etc...)
                deck[c] = new Card(s, i);
                c++;

            }

        }
    }

    /*The shuffle method should randomly place the 52 cards into a different order in 
    the array (hint: use a second temporary Card[] array and the Random class).
    It does not return anything*/
    public void shuffle() {
        //for each element in deck
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = random.nextInt(numberOfCards);
            if (tempArray[i] == null){
                tempArray[i] = deck[randomIndex];
            }
            else {
                i++;
            }
                
        }
        deck = tempArray;
    }

    /*
    dealCard() takes the first Card from the array (i.e. at index 0 or the first non-null location) and returns it. 
    That Card object must then be removed from the deck. Removing from the deck means it is no longer present 
    in the deck array.
     */
    //Why is this removing two cards???
    //Need it to return a card and use that for compareCards
    public Card dealCard() {
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] != null) {
                System.out.println("Delt Card is Suit: " + deck[i].getSuit() + " Value " + deck[i].getValue());
                Card c = deck[i];
                deck[i] = null;
                return c;
            } 
            
        }
        return null; 

    }
    
    public Card compareCards(int i){
        return deck[i];
    }

    public Card[] removeCard(Card[] newDeck, Card deltCard) {

        for (int i = 0; i < deck.length; i++) {
            if (newDeck[i].equals(deltCard)) {    //if deltCard is equal in value to array element, make it null thus removing it from the array
                newDeck[i] = null;
            }
        }
        return newDeck;
    }

    //Not sure what to do here???
    public Card[] getDeck() {
        return deck;

    }

    public void showCardDeck() {
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] == null) {
                i++;
            } else {
                System.out.println("Suit " + deck[i].getSuit() + " Value " + deck[i].getValue());
            }
        }
    }
    
    //@Override
    //toString() should return a String that represents the entire deck of cards with each card being on a newline.
    
    public String toString(CardDeck deck) {     //Isnt it not supposed to take parameters
        //for (int i = 0; i < deck.length; i++ )
            return deck.toString();
            
        
            
        
        /*for (int i = 0; i < deck.length; i++){
            System.out.println("Card Value: " + deck[i].getSuit() + " " + deck[i].getValue());
        }
        
        
        return "";*/
    }
    

}
