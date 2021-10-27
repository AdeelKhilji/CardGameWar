/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.war.enums;

/**
 *
 * @author Adeel Khilji
 */
public enum Suit 
{ 
    HEARTS("HEARTS"), DIAMONDS("DIAMONDS"), CLUBS("CLUBS"), SPADES("SPADES");
    
    String suit;
    Suit(String suit)
    {
        this.suit = suit;
    }
    public String getSuit()
    {
        return this.suit;
    }
}
