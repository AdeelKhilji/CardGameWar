/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.war.controller;

import cardgame.war.model.Card;
import cardgame.war.model.GameMode;
import cardgame.war.model.GameState;
import cardgame.war.model.Player;
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
public class GameTest 
{
   @Test
   public void testGetPlayerOneHandSizeGood()
   {
       System.out.println("getPlayerOneHandSize-Good");
       Hand hand = new Hand();
       boolean expResult = true;
       boolean result = Game.playerOneHandSize(hand);
       assertEquals(expResult,result);
   }
   public void testGetPlayerOneHandSizeBad()
   {
       System.out.println("getPlayerOneHandSize-Bad");
       Hand hand = null;
       boolean expResult = false;
       boolean result = Game.playerOneHandSize(hand);
       assertEquals(expResult,result);
   }
   public void testGetPlayerOneHandSizeBoundaryIn()
   {
       System.out.println("getPlayerOneHandSize-BoundaryIn");
       Hand hand = new Hand();
       boolean expResult = true;
       boolean result = Game.playerOneHandSize(hand);
       assertEquals(expResult,result);
   }
   public void testGetPlayerOneHandSizeBoundaryOut()
   {
       System.out.println("getPlayerOneHandSize-BoundaryOut");
       Hand hand = null;
       boolean expResult = false;
       boolean result = Game.playerOneHandSize(hand);
       assertEquals(expResult,result);
   }
}
