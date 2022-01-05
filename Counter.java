import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Tableros
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score=0;
    public Counter()
    {
        setImage(new GreenfootImage("Score: "+score,40, Color.BLUE, Color.WHITE));
    }
    public void act() 
    {
         setImage(new GreenfootImage("Score: "+score,40, Color.BLUE, Color.WHITE));
    }
    public void addScore()
    {
        score=score+100;
    }
    public void Especial()
    {
        score=score+150;
    }
    public void EXTRA()
    {
        if(score==2000)
        {
            MyWorld myworld=(MyWorld)getWorld();
            Lifes lifes= myworld.getLifes();
            lifes.WinLife();
        }
    }
    public void youNextlvl()
    {
        if(score==1450)
        {
             Greenfoot.setWorld(new Nivel2());
        }
    }
    public void newscore()
    {
       if(score==0){
       score=score+1450; 
    }
    }
    public void youNextlvl2()
    {
        if(score==2900)
        {
            Greenfoot.setWorld(new Nivel3());
        }
    }
    public void Ultimo()
    {
        if(score==0)
        {
            score=score+2900;
        }
    }
    public void YouWin()
    {
        if(score>=4350)
        {
            getWorld().addObject(new YouWin(),390,332);
            Greenfoot.stop();
        }
    }
}
