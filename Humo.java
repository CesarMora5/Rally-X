import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Humo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Humo extends Actor
{
    int position;int time=0;
    public Humo(int direction)
    {
        position=direction;
    }
    public void act() 
    {
        time++;
        setImage("Humo.png");
        switch(position){
            case 0:
            setLocation(getX(),getY());
            break;
            case 1:
            setLocation(getX(),getY());
            case 2:
            setLocation(getX(),getY());
            break;
            case 3:
            setLocation(getX(),getY());
    } 
    Actor Auto_e=getOneObjectAtOffset(0,0,Auto_enemigo.class);
    if(Auto_e!=null)
    {
        MyWorld Mw=(MyWorld)getWorld();
        getWorld().removeObject(Auto_e);
        getWorld().addObject(new Auto_enemigo(),493,593);
    }
    if(time==80)
    {
        getWorld().removeObject(this);
    }
}
}

