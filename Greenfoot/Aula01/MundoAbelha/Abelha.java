import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Abelha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abelha extends Actor
{
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("A")){
            turn (-5);
        }
        if (Greenfoot.isKeyDown("D")){
            turn (5);
        }
        if (Greenfoot.isKeyDown("w")){
            move (10);   
        }
        if (Greenfoot.isKeyDown("s")) {
            move (-10);
        } 
        if(this.getY() <50)
        {
            this.setLocation(this.getX(), 800);
        }
        
    }
}
