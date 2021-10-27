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
public class HandTest 
{
    public HandTest(){}
    @Test
    public void testGetHandSizeGood() {
        System.out.println("getHandSize-CheckLength-Good");
        Hand hand = new Hand();
        hand.PlayerHand();
        boolean expResult = true;
        boolean result = Hand.getHandSize(hand);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetHandSizeBad() {
        System.out.println("getHandSize-CheckLength-Bad");
        Hand hand = new Hand();
        boolean expResult = false;
        boolean result = Hand.getHandSize(hand);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetHandSizeBoundaryIn() {
        System.out.println("getHandSize-CheckLength-BoundaryIn");
        Hand hand = new Hand();
        hand.PlayerHand();
        boolean expResult = true;
        boolean result = Hand.getHandSize(hand);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetHandSizeBoundaryOut() {
        System.out.println("getHandSize-CheckLength-BoundaryOut");
        Hand hand = new Hand();
        boolean expResult = false;
        boolean result = Hand.getHandSize(hand);
        assertEquals(expResult, result);
    }
}
