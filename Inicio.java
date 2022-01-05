import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends World
{

    /**
     * Constructor for objects of class Inicio.
     * 
     */
    public Inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 768, 1); 
    }
    GifImage gifImg= new GifImage("RALLY_ANI.gif");
   
    public void gifAnimation()
    {
        setBackground(gifImg.getCurrentImage());
    }
    public void act()
    {
        gifAnimation();
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new Nivel1());
    }
}
