import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,32,33);
        Abelha abelha = new Abelha();
        addObject(abelha,581,378);
   
        Moscas moscas = new Moscas();
        addObject(moscas,516,331);
        moscas.setLocation(576,385);
        abelha.setLocation(302,180);
        Moscas moscas2 = new Moscas();
        addObject(moscas2,511,378);
        Moscas moscas3 = new Moscas();
        addObject(moscas3,450,383);
        moscas3.setLocation(33,376);
        moscas2.setLocation(581,28);
    }
}
