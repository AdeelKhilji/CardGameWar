/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.war.enums;

/**
 *
 * @author Adeel Khilji
 */
public enum Rank 
{ 
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JOKER(11), QUEEN(12), KING(13);
    
    int rank;
    Rank(int rank)
    {
        this.rank = rank;
    }
    public int getRank()
    {
        return this.rank;
    }
}
