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
public class Person 
{
    private String name;
    
    protected Person(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    
    @Override
    public String toString()
    {
        return this.getName();
    }
}
