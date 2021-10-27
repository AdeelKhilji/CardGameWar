/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.war.model;

import cardgame.war.enums.Rank;
import cardgame.war.enums.Suit;

/**
 *
 * @author Adeel Khilji
 */
public class Card 
{
    private int cardRank;
    private String cardSuit;
    
    public Card(int cardRank, String cardSuit)
    {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }
    public int getCardRank()
    {
        return this.cardRank;
    }
    public String getCardSuit()
    {
        return this.cardSuit;
    }
    public String toString()
    {
        return this.getCardRank() + " OF " + this.getCardSuit();
    }
}
