/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.war.controller;

import cardgame.war.model.Card;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adeel Khilji
 */
public class DeckTest {

    public DeckTest(){}
    @Test
    public void testGetDeckSizeGood() {
        System.out.println("getDeckSize-CheckLength-Good");
        Deck deck = new Deck();
        deck.deckOfCards();
        boolean expResult = true;
        boolean result = Deck.getDeckSize(deck);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetDeckSizeBad() {
        System.out.println("getDeckSize-CheckLength-Bad");
        Deck deck = new Deck();
        boolean expResult = false;
        boolean result = Deck.getDeckSize(deck);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetDeckSizeBoundaryIn() {
        System.out.println("getDeckSize-CheckLength-BoundaryIn");
        Deck deck = new Deck();
        deck.deckOfCards();
        boolean expResult = true;
        boolean result = Deck.getDeckSize(deck);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetDeckSizeBoundaryOut() {
        System.out.println("getDeckSize-CheckLength-BoundaryOut");
        Deck deck = new Deck();
        boolean expResult = false;
        boolean result = Deck.getDeckSize(deck);
        assertEquals(expResult, result);
    }
    
}
