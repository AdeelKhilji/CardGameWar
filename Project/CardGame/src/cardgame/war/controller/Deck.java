/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.war.controller;
import cardgame.war.enums.Rank;
import cardgame.war.enums.Suit;
import cardgame.war.model.Card;
import java.util.*;
/**
 *
 * @author Adeel Khilji
 */

public class Deck 
{
    public Rank rank;
    public Suit suit;
    public List<Card> deck  = new ArrayList<Card>();
    
    public List<Card> deckOfCards()
    {
        for(Rank r: Rank.values())
        {
            deck.add(new Card(r.getRank(), suit.CLUBS.getSuit()));
        }
        for(Rank r: Rank.values())
        {
            deck.add(new Card(r.getRank(), suit.DIAMONDS.getSuit()));
        }
        for(Rank r: Rank.values())
        {
            deck.add(new Card(r.getRank(), suit.HEARTS.getSuit()));
        }
        for(Rank r: Rank.values())
        {
            deck.add(new Card(r.getRank(), suit.SPADES.getSuit()));
        }
        Collections.shuffle(deck);
        return deck;
    }
    
    public List<Card> getDeck()
    {
        return this.deck;
    }
    
    protected static boolean getDeckSize(Deck deck)
    {
        return deck.getDeck().size() >= 52;
    }
    
}
