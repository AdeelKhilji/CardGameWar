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
public class GameMode 
{
    private String gameMode;
    
    public GameMode(String gameMode)
    {
        this.gameMode = gameMode;
    }
    
    public String getGameMode()
    {
        return this.gameMode;
    }
    
    @Override
    public String toString()
    {
        return this.getGameMode();
    }
}
