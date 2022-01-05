import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Auto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auto extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    int directionHumo=0; 
    boolean isHumo=false; 
    public void act() 
    {
        move(2);
        if (Greenfoot.isKeyDown("UP")){setRotation(180); directionHumo=0;MyWorld myworld=(MyWorld)getWorld();
            Gasolina ga= myworld.getGasolina();
            ga.Loseg();}
        if (Greenfoot.isKeyDown("DOWN")){setRotation(0); directionHumo=1;MyWorld myworld=(MyWorld)getWorld();
            Gasolina ga= myworld.getGasolina();
            ga.Loseg();}
        if (Greenfoot.isKeyDown("LEFT")){setRotation(90); directionHumo=2;MyWorld myworld=(MyWorld)getWorld();
            Gasolina ga= myworld.getGasolina();
            ga.Loseg();}
        if (Greenfoot.isKeyDown("RIGHT")){setRotation(-90); directionHumo=3;MyWorld myworld=(MyWorld)getWorld();
            Gasolina ga= myworld.getGasolina();
            ga.Loseg();}
        setHumo(directionHumo);
        Actor Bandera;
        Bandera= getOneObjectAtOffset(0,0,Bandera.class);
        if(Bandera!=null)
        {
            World detect;
            detect=getWorld();
            MyWorld myWorld=(MyWorld)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore(); counter.EXTRA();
            detect.removeObject(Bandera);
            Greenfoot.playSound("Bandera.mp3");
        }
        Actor b;
        b=getOneObjectAtOffset(0,0,Bandera_especial.class);
        if(b!=null)
        {
            World detect;
            detect=getWorld();
            MyWorld myWorld=(MyWorld)getWorld();
            Counter counter = myWorld.getCounter();
            counter.Especial(); counter.EXTRA();
            detect.removeObject(b);
            Greenfoot.playSound("Bandera_e.mp3");
        }
        hitRocks();
    }
   
    public void setHumo(int direction)
    {
        if (isHumo && Greenfoot.isKeyDown("space"))
        {
            Humo s1=new Humo(direction);
            getWorld().addObject(s1,getX(),getY());
            isHumo=false;
            MyWorld myworld=(MyWorld)getWorld();
            Gasolina ga= myworld.getGasolina();
            ga.Loseg();
        }
        if (!isHumo && Greenfoot.isKeyDown("space")){isHumo=true;}
        
    }
    public void move(int moveAmt)
    {
    // determine direction by keypress checking
    int dx = 0, dy = 0;
    if (Greenfoot.isKeyDown("right")){ dx += 1; setRotation(-90);}
    if (Greenfoot.isKeyDown("left")) {dx -= 1; setRotation(90);}
    if (Greenfoot.isKeyDown("down")) {dy += 1; setRotation(0);}
    if (Greenfoot.isKeyDown("up")) {dy -= 1; setRotation(180);}
    // check for wall on each step of move in both vertical and horizontal directions
    for (int i = 0; i < moveAmt; i++)
    {
        setLocation(getX() + dx, getY());
        if (getOneIntersectingObject(Muralla.class) != null) setLocation(getX() - dx, getY());
        setLocation(getX(), getY() + dy);
        if (getOneIntersectingObject(Muralla.class) != null) setLocation(getX(), getY() - dy);
    }  
    }
    public void hitRocks()
    {
        Actor A=getOneObjectAtOffset(0,0,Enemigos.class);
        if(A!=null )
        {
            MyWorld myworld=(MyWorld)getWorld();
            Lifes lifes= myworld.getLifes();
            lifes.LoseLife();
            getWorld().removeObject(this);
        }
    }
    
}
