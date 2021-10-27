/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.war.controller;

import cardgame.war.model.Card;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adeel Khilji
 */
public class Hand 
{
    
    List<Card> handPerPlayer = new ArrayList<Card>();
    public List<Card> PlayerHand()
    {
        Deck deck = new Deck();    
        deck.deckOfCards();
        for(int i = 0; i < deck.getDeck().size() / 2; i++)
        {
            handPerPlayer.add(deck.getDeck().get(i));
        }
        return handPerPlayer;
    }
    public List<Card> getHand()
    {
        return this.handPerPlayer;
    }
    
    public static boolean getHandSize(Hand hand)
    {
        return hand.getHand().size() >= 26;
    }
}
