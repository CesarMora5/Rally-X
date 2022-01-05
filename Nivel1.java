import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends MyWorld
{

    /**
     * Constructor for objects of class Nivel1.
     * 
     */
    public Nivel1()
    {
        prepare();
    }

    public void act()
    {
        counter.youNextlvl();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bandera bandera = new Bandera();
        addObject(bandera,213,600);
        Bandera bandera2 = new Bandera();
        addObject(bandera2,212,497);
        Bandera bandera3 = new Bandera();
        addObject(bandera3,407,454);
        Bandera bandera4 = new Bandera();
        addObject(bandera4,591,500);
        Bandera bandera5 = new Bandera();
        addObject(bandera5,484,213);
        Bandera bandera6 = new Bandera();
        addObject(bandera6,33,367);
        Bandera bandera7 = new Bandera();
        addObject(bandera7,96,184);
        Bandera bandera8 = new Bandera();
        addObject(bandera8,433,118);
        Bandera bandera9 = new Bandera();
        addObject(bandera9,712,624);
        Bandera bandera10 = new Bandera();
        addObject(bandera10,711,314);
        Bandera_especial bandera_especial = new Bandera_especial();
        addObject(bandera_especial,599,268);
        Bandera_especial bandera_especial2 = new Bandera_especial();
        addObject(bandera_especial2,731,53);
        Bandera_especial bandera_especial3 = new Bandera_especial();
        addObject(bandera_especial3,305,279);
        Roca roca = new Roca();
        addObject(roca,236,507);
        Roca roca2 = new Roca();
        addObject(roca2,391,351);
    }
}
