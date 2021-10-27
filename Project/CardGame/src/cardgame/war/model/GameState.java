/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.war.model;

/**
 *
 * @author Adeel Khilji
 */
public class GameState 
{
    private String gameState;
    
    public GameState(String gameState)
    {
        this.gameState = gameState;
    }
    
    public String getGameState()
    {
        return this.gameState;
    }
    
    @Override
    public String toString()
    {
        return this.getGameState();
    }
}
