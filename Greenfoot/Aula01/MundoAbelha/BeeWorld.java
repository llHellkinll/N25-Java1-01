import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeeWorld extends World
{
    // Fields
    private int score;
    private final int PONTOS = 99999;
    private Abelha abelha;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        score = 0;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,32,33);

        abelha = new Abelha();
        addObject(abelha,45,152);

        for (int qtd=0; qtd<20; qtd++){
            int posX = Greenfoot.getRandomNumber(800);

            int posY = Greenfoot.getRandomNumber(600);
            int vel = Greenfoot.getRandomNumber(3)+1;
            int rot = Greenfoot.getRandomNumber(360)+1;
            addObject (new Moscas (vel,rot),posX,posY);
        }
        //Mostrando texto
        TextoColorido txt = new TextoColorido ("Ganhe o jogo",500, 50,  30, Color.GREEN, Color.BLACK);

        addObject(txt, 500, 50);
    }
    //Acessador ou  getter do Score
    public int getScore(){
        return score;
    }
    
    public void updateScore (){
        score += PONTOS; // score = score + PONTOS
        showText("Score: " + score, 101,10);
    }
    //Acessador da abelha
    public Abelha getAbelha(){
        return abelha;
    }
}
