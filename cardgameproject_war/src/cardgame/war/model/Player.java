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
public class Player extends Person
{
    private int age;
    
    public Player(String name, int age)
    {
        super(name);
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
    
    @Override
    public String toString()
    {
        return "NAME: " + super.toString() + "\nAGE: " + this.getAge() + "\n";
    }
}
