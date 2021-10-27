/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.war.controller;
import cardgame.war.model.*;
import java.util.Scanner;
/**
 *
 * @author Adeel Khilji
 */
public class Registeration 
{
    private Player player;

    public String PlayerRegisteration()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME: ");
        String  name = s.nextLine();
        System.out.print("ENTER YOUR AGE: ");
        while(!s.hasNextInt())
        {
            System.out.println("Age is a numbered value ");
            System.out.print("ENTER YOUR AGE: ");
            s.nextLine();
        }
        int age = s.nextInt();
        player = new Player(name, age);
        
        return player.toString();
    }
    public String getPlayerName()
    {
        return player.getName();
    }
    public int getPlayerAge()
    {
        return player.getAge();
    }
    
    public String toString()
    {
        return player.toString();
    }
    
    public static boolean nameValidate(Player player)
    {
        return player.getName().length() > 3;
    }
    public static boolean ageValidate(Player player)
    {
        return player.getAge() > 15;
    }
}
