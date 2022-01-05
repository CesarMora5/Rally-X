import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Auto_enemigo extends Enemigos
{
    private boolean movingVertically = Greenfoot.getRandomNumber(1) == 0;
    public void act(){
    followAuto();
   }
   // the method to follow the player
   public void followAuto()
    {
    // do nothing if player not in world
    if (getWorld().getObjects(Auto.class).isEmpty()) return;
    // get reference to Player object
    Actor actor = (Actor)getWorld().getObjects(Auto.class).get(0);
    // give some randomness to follow direction by changing travel axis
    // (the '100' can be adjusted to make changes occur slower or faster)
    if (Greenfoot.getRandomNumber(10) == 0) movingVertically = Greenfoot.getRandomNumber(2) == 0;
    // change axis if no movement required along current axis
    if ((movingVertically && getY() == actor.getY()) || (!movingVertically && getX() == actor.getX())) movingVertically = !movingVertically;
    // move along current axis
    if (movingVertically) setLocation(getX(), getY()+(int)Math.signum(actor.getY()-getY()));
    else setLocation(getX()+(int)Math.signum(actor.getX()-getX()), getY());
    
    }
   public void setLocation(int x, int y) {
     if (getWorld().getObjectsAt(x, y, Muralla.class).isEmpty()) {
        super.setLocation(x, y);
     }
    }
    public void setLocations(int x, int y)
    {
        if(getWorld().getObjectsAt(x,y,Roca.class).isEmpty())
        {
            super.setLocation(x,y);
        }
    }
}
