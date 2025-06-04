import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aqui é a classe Mosca
 * 
 * @author JW 
 * @version 2025-06-03
 */
public class Moscas extends Actor
{
    /**
     * Act - Método responsável pela ações da mosca quandoos botoes "Act" ou "Run" são pressionados
     * 
     */
    public void act()
    {
        // Add your action code here.
        move (1);
        turn (10-Greenfoot.getRandomNumber(20));
    }
}
