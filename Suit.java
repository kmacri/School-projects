/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.cardsproject;

/**
 *
 * @author kmacr
 */
public enum Suit {
    //String is initializing it.
    //Creates suit and sets display name to those values. 
    //special for loop for (Suit s : Suit.values())
    CLUBS ("Club"),
    DIAMONDS ("Diamonds"),
    HEARTS ("Hearts"),
    SPADES ("Spades");
    
    //initializing displayName attribute    
    private final String displayName;

    //suit contructor 
    Suit(String displayName) {
        this.displayName = displayName;
} 
    
    
    
    //Call it with Suit.CLUB.getDisplayName()
    public String getDisplayName() {
        return displayName;
    }
    
            
            
}
