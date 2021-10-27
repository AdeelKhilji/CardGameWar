/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.war.controller;

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
public class RegisterationTest 
{
    Player player;
    
    @Test
    public void testNameValidateGood() {
        System.out.println("getPlayerNameGood");
        player = new Player("Jane", 0);
        boolean expResult = true;
        boolean result = Registeration.nameValidate(player);
        assertEquals(expResult, result);
    }
    @Test
    public void testNameValidateBad() {
        System.out.println("getPlayerNameBad");
        player = new Player("",0);
        boolean expResult = false;
        boolean result = Registeration.nameValidate(player);
        assertEquals(expResult, result);
    }
    @Test
    public void testNameValidateBoundaryIn() {
        System.out.println("getPlayerNameBoundaryIn");
        player = new Player("tommy", 0);
        boolean expResult = true;
        boolean result = Registeration.nameValidate(player);
        assertEquals(expResult, result);
    }
    @Test
    public void testNameValidateBoundaryOut() {
        System.out.println("getPlayerNameBoundaryOut");
        player = new Player("tom", 0);
        boolean expResult = false;
        boolean result = Registeration.nameValidate(player);
        assertEquals(expResult, result);
    }

    @Test
    public void testAgeValidateGood() {
        System.out.println("testAgeValidateGood");
        player = new Player("",20);
        boolean expResult = true;
        boolean result = Registeration.ageValidate(player);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgeValidateBad() {
        System.out.println("testAgeValidateBad");
        player = new Player("",14);
        boolean expResult = false;
        boolean result = Registeration.ageValidate(player);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgeValidateBoundaryIn() {
        System.out.println("testAgeValidateBoundaryIn");
        player = new Player("",16);
        boolean expResult = true;
        boolean result = Registeration.ageValidate(player);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgeValidateBoundaryOut() {
        System.out.println("testAgeValidateBoundaryOut");
        player = new Player("",14);
        boolean expResult = false;
        boolean result = Registeration.ageValidate(player);
        assertEquals(expResult, result);
    }

}
