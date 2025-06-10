import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta é uma classe que representará uma Abelha.
 * 
 * @author Richard Brosler 
 * @version 2025-06-04
 */
public class Abelha extends Actor
{
    //Definindo os fields
    int vidas;
    int score;
    int PONTOS = 200;
    private int indice;
    private GreenfootImage imgs [];
    //Definindo o constructor
    /**
     * Constructor da Classe Abelha
     */
    public Abelha(){
        vidas = 3; //vai ter 3 vidas
        score = 0;
        //GreenfootImage img = new GreenfootImage ("bee01.png/");
        //setImage (img);
        indice = 0;
        imgs = new GreenfootImage [4]; // Definindo vetor  4 posições
        for (int i=0; i<4 ; i++){
            imgs [1]  = new GreenfootImage ("bee0" + (i+1) + ".png");
        }
        setImage(imgs[indice]);
    }

    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        // Add your action code here.

        if (Greenfoot.isKeyDown("A")){
            turn (-5);
        }
        if (Greenfoot.isKeyDown("D")){
            turn (5);
        }
        if (Greenfoot.isKeyDown("w")){
            move (5);   
        }
        if (Greenfoot.isKeyDown("s")) {
            move (-5);
        } 
        verificarPosicao();
        capturarMosca();
        serCapturadoPelaAranha();
        animarAbelha();
    }

    /**
     * Método que verifica posição da Abelha.
     */
    public void verificarPosicao(){
        if (estaNoTopo()){
            setLocation(getX(), getWorld().getHeight()-10);
        }
        if (estaNaBase()){
            setLocation(getX(), 10);
        }
        if (estaNaDireita()){
            setLocation(10, getY());
        }
        if (estaNaEsquerda()){
            setLocation(getWorld().getWidth()-10, getY());
        }
    }

    /**
     * Método que verifica se a abelha está no topo.
     */
    public boolean estaNoTopo(){
        if (getY()<10){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que verifica se abelha está na base
     */
    public boolean estaNaBase(){
        return getY()>getWorld().getHeight()-10;
    }

    /**
     * Método que verifica se abelha está na esquerda
     */    
    public boolean estaNaEsquerda(){
        return getX()<10;
    }

    /**
     * Método que verifica se abelha está na direita.
     */
    public boolean estaNaDireita(){
        return getX()>getWorld().getWidth()-10;
    }

    public void capturarMosca(){
        if (isTouching(Moscas.class)) {
            removeTouching(Moscas.class);
            Greenfoot.playSound("slurp.wav");
            atualizarScore();
            //Vai de 1 a 800
            int posX = Greenfoot.getRandomNumber(getWorld().getWidth()) + 1;
            //Vai de 1 a 600
            int posY = Greenfoot.getRandomNumber(getWorld().getHeight()) + 1;
            //Criando a mosca
            Moscas mosca = new Moscas(Greenfoot.getRandomNumber(3)+1,Greenfoot.getRandomNumber(360));
            //Colocando no mundo na posição X, Y
            getWorld().addObject(mosca, posX, posY);
        }
    }

    public void capturarMosca2(){
        Actor mosca = getOneIntersectingObject(Moscas.class);
        if (mosca != null){
            getWorld().removeObject(mosca);
        }
    }

    public void serCapturadoPelaAranha(){
        if (isTouching(Aranha.class)){
            //Vai de 1 a 800
            int posX = Greenfoot.getRandomNumber(
                    getWorld().getWidth()) + 1;
            //Vai de 1 a 600
            int posY = Greenfoot.getRandomNumber(
                    getWorld().getHeight()) + 1;
            setLocation(posX, posY);
            Greenfoot.playSound("ouch.wav");
            vidas--;//vidas = vidas - 1
            if (vidas<=0){
                getWorld().showText("GAME OVER", 400, 300);
                Greenfoot.stop();
            }
        }
    }

    public void atualizarScore(){
        score += PONTOS; //score = score + PONTOS
        getWorld().showText("Score: " + score, 100, 10);
    }

    public void animarAbelha (){
        indice = (indice + 1) % 4; 
        setImage(imgs[indice]);
    }
}

