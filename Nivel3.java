import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends MyWorld
{

    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public Nivel3()
    {
        prepare();
    }
    public void act()
    {
        counter.Ultimo();
        counter.YouWin();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Roca roca = new Roca();
        addObject(roca,150,375);
        Roca roca2 = new Roca();
        addObject(roca2,216,512);
        Roca roca3 = new Roca();
        addObject(roca3,54,202);
        Roca roca4 = new Roca();
        addObject(roca4,484,219);
        Roca roca5 = new Roca();
        addObject(roca5,341,146);
        Auto_enemigo auto_enemigo = new Auto_enemigo();
        addObject(auto_enemigo,59,596);
        Auto_enemigo auto_enemigo2 = new Auto_enemigo();
        addObject(auto_enemigo2,191,139);
        Auto_enemigo auto_enemigo3 = new Auto_enemigo();
        addObject(auto_enemigo3,710,216);
        Bandera bandera = new Bandera();
        addObject(bandera,396,216);
        Bandera bandera2 = new Bandera();
        addObject(bandera2,392,348);
        Bandera bandera3 = new Bandera();
        addObject(bandera3,397,535);
        Bandera bandera4 = new Bandera();
        addObject(bandera4,212,597);
        Bandera bandera5 = new Bandera();
        addObject(bandera5,95,368);
        Bandera bandera6 = new Bandera();
        addObject(bandera6,43,123);
        Bandera bandera7 = new Bandera();
        addObject(bandera7,615,500);
        Bandera bandera8 = new Bandera();
        addObject(bandera8,655,593);
        Bandera bandera9 = new Bandera();
        addObject(bandera9,736,162);
        Bandera bandera10 = new Bandera();
        addObject(bandera10,555,93);
        Bandera_especial bandera_especial = new Bandera_especial();
        addObject(bandera_especial,586,358);
        Bandera_especial bandera_especial2 = new Bandera_especial();
        addObject(bandera_especial2,181,256);
        Bandera_especial bandera_especial3 = new Bandera_especial();
        addObject(bandera_especial3,35,457);
    }
}
