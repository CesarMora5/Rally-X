import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lifes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lifes extends Actor
{
    int vidas=180;
    int vidasWidth=180;
    int vidasHeight=30;
    int pixelvidas=vidasWidth/vidas;
    int time=0;
    /**
     * Act - do whatever the Lifes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Lifes()
    {
        update();
    }
    public void act() 
    {
        update();
        YouLose();
    } 
    public void update()
    {
        setImage(new GreenfootImage(vidasWidth+2, vidasHeight+2));
        getImage().setColor(Color.WHITE);
        getImage().drawRect(0,0,vidasWidth+1, vidasHeight+1);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,vidas+pixelvidas,vidasHeight);
    }
    public void YouLose()
    {
        if(vidas<=0)
        {
            getWorld().addObject(new YouLose(),390,332);
            Greenfoot.stop();
        }
    }
    public void LoseLife()
    {
        Actor A=getOneObjectAtOffset(0,0,Auto.class);
        MyWorld Mw=(MyWorld)getWorld();
        vidas=vidas-60;
        getWorld().addObject(new Auto(),407,605);
    }
    public void WinLife()
    {
        vidas=vidas+60;
    }
}
