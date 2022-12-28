/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cardsproject;

/**
 *
 * @author kmacr
 */
public class Card {

    //Attributes of CardDeck
    private Suit suit;
    private int value;

    //The constructor  
    //constructors initialize the attributes
    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    //getters and setters becasue constructor is private
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getDisplayValue(Card card) {
        if (card.getValue() == 1) {
            return "Ace";
        }

        if (card.getValue() == 13) {
            return "King";
        }

        if (card.getValue() == 12) {
            return "Queen";
        }

        if (card.getValue() == 11) {
            return "Jack";
        } else {
            //intValue is a integer tgat is equal to the value of the card
            int intValue = card.getValue();
            //converts the int value of the card to a String.
            return String.valueOf(intValue);

        }

    }

    //The equals method should take another Card object and return true 
    //only if the Suit and the value both match, false otherwise
    public boolean equals(Card card, Card otherCard) {
        if (card.getValue() == otherCard.getValue() && card.getSuit().equals(otherCard.getSuit())) {
            return true;
        }
    return false;
 }
 
    

    @Override
    public String toString() {

        return "Suit: " + suit + "Value: " + value;

    }

    //methods of CardDeck class 
}
