import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aqui é a classe Mosca
 * 
 * @author JW 
 * @version 2025-06-03
 */
public class Moscas extends Actor
{
    //Fields
    private int velocidade;
    private int rotacao;
    //Constructor padrão
    public Moscas(){
        velocidade = 1;
        rotacao = 0;
    }
    //Constructor com parametros
    public Moscas (int vel,int rot) {
        velocidade = vel;
        rotacao = rot;
        setRotation(rot);
    }

    /**
     * Act - Método responsável pela ações da mosca quandoos botoes "Act" ou "Run" são pressionados
     * 
     */
    public void act()
    {
        // Add your action code here.
        move (velocidade);
        if(Greenfoot.getRandomNumber (100)<20) {
            turn (45-Greenfoot.getRandomNumber(90));
        }
    }
}
