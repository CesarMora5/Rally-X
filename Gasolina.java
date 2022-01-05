import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gasolina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gasolina extends Tableros
{
    int g=7000;
    int gWidth=300;
    int gHeight=30;
    int pixelg=gWidth/g;
    public Gasolina()
    {
        updates();
    }
    public void act() 
    {
        updates();
        YouLose();
    } 
    public void updates()
    {
        setImage(new GreenfootImage(gWidth+2, gHeight+2));
        getImage().setColor(Color.WHITE);
        getImage().drawRect(0,0,gWidth+1, gHeight+1);
        getImage().setColor(Color.GRAY);
        getImage().fillRect(1,1,g+pixelg,gHeight);
    }
    public void YouLose()
    {
        if (g<=0)
        {
            getWorld().addObject(new YouLose(),390,332);
            Greenfoot.stop();
        }
    }
    public void Loseg()
    {
        g=g-1;
    }
}
