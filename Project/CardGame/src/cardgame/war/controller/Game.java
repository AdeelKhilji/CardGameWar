/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.war.controller;

import cardgame.war.model.*;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Adeel Khilji
 */
public class Game 
{
    private int gameNumber;
    private GameMode gameMode;
    private GameState gameState;
    
    public static Hand handPlayerOne = new Hand();
    public static Hand handPlayerTwo = new Hand();
    
    public static int playerOneScore = 0;
    public static int playerTwoScore = 0;
    
    public static Registeration rPlayerOne = new Registeration();
    public static Registeration rPlayerTwo = new Registeration();
    
    
    public Game(int gameNumber, GameMode gameMode, GameState gameState)
    {
        this.gameNumber = gameNumber;
        this.gameMode = gameMode;
        this.gameState = gameState;
        
    }
    public int getGameNumber()
    {
        return this.gameNumber;
    }
    public GameMode getGameMode()
    {
        return this.gameMode;
    }
    public GameState getGameState()
    {
        return this.gameState;
    }
    
    public static void Session()
    {
        rPlayerOne.PlayerRegisteration();
        handPlayerOne.PlayerHand();

        rPlayerTwo.PlayerRegisteration();
        handPlayerTwo.PlayerHand();

        while(handPlayerOne.getHand().size()  != 0 || handPlayerTwo.getHand().size() != 0)
        {
            if(handPlayerOne.getHand().get(0).getCardRank() == handPlayerTwo.getHand().get(0).getCardRank())
            {
                handPlayerOne.getHand().add(handPlayerOne.getHand().get(0));
                handPlayerOne.getHand().remove(0);
                handPlayerTwo.getHand().add(handPlayerTwo.getHand().get(0));
                handPlayerTwo.getHand().remove(0);
                try
                {
                    WarRound(handPlayerOne.getHand().get(0),handPlayerTwo.getHand().get(0));   
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            else if(handPlayerOne.getHand().get(0).getCardRank() != handPlayerTwo.getHand().get(0).getCardRank())
            {
                try
                {
                    Round(handPlayerOne.getHand().get(0),handPlayerTwo.getHand().get(0));
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }   
            }
            
            if(handPlayerOne.getHand().size() == 0 || handPlayerTwo.getHand().size() == 0)
            {
                break;
            }
        }
        if(handPlayerOne.getHand().size() > handPlayerTwo.getHand().size())
        {
            System.out.println();
            System.out.println("PLAYER ONE WINS!!");
            System.out.println("SCORE: " + playerOneScore);
        }
        else
        {
            System.out.println();
            System.out.println("PLAYER TWO WINS!!");
            System.out.println("SCORE: " + playerTwoScore);
        }
    }
    public static void WarRound(Card cardPlayerOne, Card cardPlayerTwo) throws IOException
    {
        Game game;
        GameMode gameMode = new GameMode("WAR");
        GameState turn1 = new GameState(rPlayerOne.getPlayerName());
        GameState turn2 = new GameState(rPlayerTwo.getPlayerName());
        game = new Game(1,gameMode,turn1);
        System.out.println(game.toString());
        System.out.println("PRESS ENTER TO PLAY YOUR ROUND");
        char keyDown = (char) System.in.read();
        
        System.out.println("CARD PLAYED PLAYER ONE: " + handPlayerOne.getHand().get(0)
         + " " + handPlayerOne.getHand().get(1)
         + " " + handPlayerOne.getHand().get(2)
         + " " + handPlayerOne.getHand().get(3));
        
        game = new Game(1,gameMode,turn2);
        System.out.println(game.toString());
        System.out.println("CARD PLAYED PLAYER TWO: " + handPlayerTwo.getHand().get(0)
        + " " + handPlayerTwo.getHand().get(1)
        + " " + handPlayerTwo.getHand().get(2)
        + " " + handPlayerTwo.getHand().get(3));
        
        if(handPlayerOne.getHand().get(0).getCardRank() > handPlayerTwo.getHand().get(0).getCardRank())
        {
            handPlayerOne.getHand().add(handPlayerOne.getHand().get(0));
            handPlayerOne.getHand().remove(0);
            handPlayerOne.getHand().add(handPlayerOne.getHand().get(1));
            handPlayerOne.getHand().remove(1);
            handPlayerOne.getHand().add(handPlayerOne.getHand().get(2));
            handPlayerOne.getHand().remove(2);
            handPlayerOne.getHand().add(handPlayerOne.getHand().get(3));
            handPlayerOne.getHand().remove(3);
            
            handPlayerOne.getHand().add(handPlayerTwo.getHand().get(0));
            handPlayerTwo.getHand().remove(0);
            handPlayerOne.getHand().add(handPlayerTwo.getHand().get(1));
            handPlayerTwo.getHand().remove(1);
            handPlayerOne.getHand().add(handPlayerTwo.getHand().get(2));
            handPlayerTwo.getHand().remove(2);
            handPlayerOne.getHand().add(handPlayerTwo.getHand().get(3));
            handPlayerTwo.getHand().remove(3);
            playerOneScore++;
        }
        else if(handPlayerOne.getHand().get(0).getCardRank() < handPlayerTwo.getHand().get(0).getCardRank())
        {
            handPlayerTwo.getHand().add(handPlayerTwo.getHand().get(0));
            handPlayerTwo.getHand().remove(0);
            handPlayerTwo.getHand().add(handPlayerTwo.getHand().get(1));
            handPlayerTwo.getHand().remove(1);
            handPlayerTwo.getHand().add(handPlayerTwo.getHand().get(2));
            handPlayerTwo.getHand().remove(2);
            handPlayerTwo.getHand().add(handPlayerTwo.getHand().get(3));
            handPlayerTwo.getHand().remove(3);

            handPlayerTwo.getHand().add(handPlayerOne.getHand().get(0));
            handPlayerOne.getHand().remove(0);
            handPlayerTwo.getHand().add(handPlayerOne.getHand().get(1));
            handPlayerOne.getHand().remove(1);
            handPlayerTwo.getHand().add(handPlayerOne.getHand().get(2));
            handPlayerOne.getHand().remove(2);
            handPlayerTwo.getHand().add(handPlayerOne.getHand().get(3));
            handPlayerOne.getHand().remove(3);
            playerTwoScore++;
        }
        
        System.out.print("PLAYER ONE HAND: " + handPlayerOne.getHand() + "\n");
        System.out.print("PLAYER ONE NUMBER OF CARDS: " + handPlayerOne.getHand().size() + "\n");
        System.out.println();
        System.out.print("PLAYER TWO HAND: " + handPlayerTwo.getHand() + "\n");
        System.out.print("PLAYER TWO NUMBER OF CARDS: " + handPlayerTwo.getHand().size() + "\n");
        System.out.println();
        System.out.print("PLAYER ONE SCORE: " + playerOneScore + "\n");
        System.out.print("PLAYER TWO SCORE: " + playerTwoScore + "\n");
        
        
    }
    public static void Round(Card cardPlayerOne, Card cardPlayerTwo) throws IOException
    {
        Game game;
        GameMode gameMode = new GameMode("NORMAL");
        GameState turn1 = new GameState(rPlayerOne.getPlayerName());
        GameState turn2 = new GameState(rPlayerTwo.getPlayerName());
        
        game = new Game(1,gameMode,turn1);
        System.out.println(game.toString());
        System.out.println("PRESS ENTER TO PLAY YOUR ROUND");
        char keyDown = (char) System.in.read();
        
        System.out.println("CARD PLAYED PLAYER ONE: " + handPlayerOne.getHand().get(0));
        
        game = new Game(1,gameMode,turn2);
        System.out.println(game.toString());
        System.out.println("CARD PLAYED PLAYER TWO: " + handPlayerTwo.getHand().get(0));
        

        if(handPlayerOne.getHand().get(0).getCardRank() > handPlayerTwo.getHand().get(0).getCardRank())
        {
            handPlayerOne.getHand().add(handPlayerOne.getHand().get(0));
            handPlayerOne.getHand().remove(0);

            handPlayerOne.getHand().add(handPlayerTwo.getHand().get(0));
            handPlayerTwo.getHand().remove(0);
            playerOneScore++;
        }
        else if(handPlayerOne.getHand().get(0).getCardRank() < handPlayerTwo.getHand().get(0).getCardRank())
        {
            handPlayerTwo.getHand().add(handPlayerTwo.getHand().get(0));
            handPlayerTwo.getHand().remove(0);

            handPlayerTwo.getHand().add(handPlayerOne.getHand().get(0));
            handPlayerOne.getHand().remove(0);
            playerTwoScore++;
        }
        
        System.out.print("PLAYER ONE HAND: " + handPlayerOne.getHand() + "\n");
        System.out.print("PLAYER ONE NUMBER OF CARDS: " + handPlayerOne.getHand().size() + "\n");
        System.out.println();
        System.out.print("PLAYER TWO HAND: " + handPlayerTwo.getHand() + "\n");
        System.out.print("PLAYER TWO NUMBER OF CARDS: " + handPlayerTwo.getHand().size() + "\n");
        System.out.println();
        System.out.print("PLAYER ONE SCORE: " + playerOneScore + "\n");
        System.out.print("PLAYER TWO SCORE: " + playerTwoScore + "\n");
    }
    
    //You are checking for player one player two hand size
    public static boolean playerOneHandSize(Hand hand)
    {
        return hand.getHand().size() >= 26;
    }
    public static boolean playerTwoHandSize(Hand hand)
    {
        return hand.getHand().size() >= 26 ;
    }
    
    @Override
    public String toString()
    {
        return "\nGAME: " + this.getGameNumber() + "\t\tMODE: " + this.getGameMode() + "\nTURN: " + this.getGameState();
    }
}
