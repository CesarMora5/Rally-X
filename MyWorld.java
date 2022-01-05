import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    Lifes lifes= new Lifes();
    Gasolina gasolina=new Gasolina();
    public Auto auto= new Auto();
    public MyWorld()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(768, 670, 1);
        //Crear auto
        Greenfoot.playSound("Game.mp3");
         prepare();
    }
    public Counter getCounter()
    {
        return counter;
    }
    public Lifes getLifes()
    {
        return lifes;
    }
    public Gasolina getGasolina()
    {
        return gasolina;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Auto_enemigo auto_enemigo;
        auto_enemigo=new Auto_enemigo();
        Ar_ab ar_ab = new Ar_ab();
        addObject(ar_ab,384,19);
        Ar_ab ar_ab2 = new Ar_ab();
        addObject(ar_ab2,383,667);
        addObject(counter,81,20);
        addObject(gasolina,585,17);
        addObject(lifes,284,20);
        addObject(auto,407,605);
        auto.setRotation(180);
        addObject(auto_enemigo,493,593);
        auto_enemigo.setRotation(180);
        Bandera bandera = new Bandera();
        addObject(bandera,439,525);
        Bandera bandera2 = new Bandera();
        addObject(bandera2,306,546);
        Bandera bandera3 = new Bandera();
        addObject(bandera3,151,505);
        Bandera bandera4 = new Bandera();
        addObject(bandera4,301,410);
        Bandera bandera5 = new Bandera();
        addObject(bandera5,392,277);
        Bandera bandera6 = new Bandera();
        addObject(bandera6,557,95);
        Bandera bandera7 = new Bandera();
        addObject(bandera7,258,118);
        Bandera bandera8 = new Bandera();
        addObject(bandera8,77,173);
        Bandera bandera9 = new Bandera();
        addObject(bandera9,57,625);
        Bandera bandera10 = new Bandera();
        addObject(bandera10,723,422);
        Bandera_especial bandera_especial = new Bandera_especial();
        addObject(bandera_especial,595,265);
        Bandera_especial bandera_especial2 = new Bandera_especial();
        addObject(bandera_especial2,586,626);
        Bandera_especial bandera_especial3 = new Bandera_especial();
        addObject(bandera_especial3,149,292);
        Roca roca = new Roca();
        addObject(roca,372,553);
        Roca roca2 = new Roca();
        addObject(roca2,397,351);
        Roca roca3 = new Roca();
        addObject(roca3,688,510);
        M15 m15 = new M15();
        addObject(m15,598,134);
        M15 m152 = new M15();
        addObject(m152,688,135);
        M15 m153 = new M15();
        addObject(m153,79,90);
        M15 m154 = new M15();
        addObject(m154,643,473);
        M15 m155 = new M15();
        addObject(m155,350,315);
        M15 m156 = new M15();
        addObject(m156,395,180);
        M36 m36 = new M36();
        addObject(m36,655,631);
        removeObject(ar_ab2);
        M29 m29 = new M29();
        addObject(m29,530,395);
        M29 m292 = new M29();
        addObject(m292,644,394);
        removeObject(m292);
        M34 m34 = new M34();
        addObject(m34,656,394);
        removeObject(m34);

        addObject(m34,656,395);
        M34 m342 = new M34();
        addObject(m342,497,76);
        M48 m48 = new M48();
        addObject(m48,395,122);
        M48 m482 = new M48();
        addObject(m482,395,102);
        M52 m52 = new M52();
        addObject(m52,350,225);
        M72 m72 = new M72();
        addObject(m72,440,281);
        M72 m722 = new M72();
        addObject(m722,440,281);
        removeObject(m722);
        M64 m64 = new M64();
        addObject(m64,113,146);
        M64 m642 = new M64();
        addObject(m642,181,190);
        M64 m643 = new M64();
        addObject(m643,226,393);
        M64 m644 = new M64();
        addObject(m644,137,575);
        M66 m66 = new M66();
        addObject(m66,104,439);
        M10 m10 = new M10();
        addObject(m10,292,89);
        M92 m92 = new M92();
        addObject(m92,33,247);
        M92 m922 = new M92();
        addObject(m922,34,610);
        M92 m923 = new M92();
        addObject(m923,34,625);
        M89 m89 = new M89();
        addObject(m89,736,316);
        M89 m892 = new M89();
        addObject(m892,736,578);
        M89 m893 = new M89();
        addObject(m893,738,541);
        M86 m86 = new M86();
        addObject(m86,260,146);
        M80 m80 = new M80();
        addObject(m80,337,575);
        removeObject(m80);
        M85 m85 = new M85();
        addObject(m85,315,575);
        M85 m852 = new M85();
        addObject(m852,295,574);
        removeObject(m852);
        removeObject(m85);
        M875 m875 = new M875();
        addObject(m875,348,575);
        M875 m8752 = new M875();
        addObject(m8752,302,576);
        M875 m8753 = new M875();
        addObject(m8753,263,575);
        M80 m802 = new M80();
        addObject(m802,245,440);
        M805 m805 = new M805();
        addObject(m805,497,168);
        M78 m78 = new M78();
        addObject(m78,644,78);
        M78 m782 = new M78();
        addObject(m782,643,191);
        M78 m783 = new M78();
        addObject(m783,305,574);
        M66 m662 = new M66();
        addObject(m662,420,53);
        M695 m695 = new M695();
        addObject(m695,598,236);
        M69 m69 = new M69();
        addObject(m69,689,294);
        M69 m692 = new M69();
        addObject(m692,508,294);
        M69 m693 = new M69();
        addObject(m693,283,317);
        M69 m694 = new M69();
        addObject(m694,283,250);
        M69 m696 = new M69();
        addObject(m696,238,247);
        M69 m697 = new M69();
        addObject(m697,238,291);
        M69 m698 = new M69();
        addObject(m698,125,296);
        M69 m699 = new M69();
        addObject(m699,126,335);
        M69 m6910 = new M69();
        addObject(m6910,80,272);
        M69 m6911 = new M69();
        addObject(m6911,78,290);
        removeObject(m6911);
        addObject(m6911,80,290);
        Muralla_4 muralla_4 = new Muralla_4();
        addObject(muralla_4,452,598);
        Muralla_4 muralla_42 = new Muralla_4();
        addObject(muralla_42,543,529);
        Muralla12 muralla12 = new Muralla12();
        addObject(muralla12,494,631);
        Muralla12 muralla122 = new Muralla12();
        addObject(muralla122,541,632);
        removeObject(muralla122);
        removeObject(muralla12);
        M29 m293 = new M29();
        addObject(m293,440,301);
        M29 m294 = new M29();
        addObject(m294,440,259);
        M32 m32 = new M32();
        addObject(m32,168,236);
        M32 m322 = new M32();
        addObject(m322,148,236);
        M32 m323 = new M32();
        addObject(m323,192,396);
        M32 m324 = new M32();
        addObject(m324,224,395);
        removeObject(m323);
        removeObject(m643);
        addObject(m323,193,395);
        M32 m325 = new M32();
        addObject(m325,257,395);
        M32 m326 = new M32();
        addObject(m326,259,395);
        M32 m327 = new M32();
        addObject(m327,192,349);
        M32 m328 = new M32();
        addObject(m328,214,349);
        removeObject(m328);
        removeObject(m327);
        M36 m362 = new M36();
        addObject(m362,476,496);
        M36 m363 = new M36();
        addObject(m363,517,631);
        M52 m522 = new M52();
        addObject(m522,349,405);
        M59 m59 = new M59();
        addObject(m59,429,394);
        M62 m62 = new M62();
        addObject(m62,350,316);
        M36 m364 = new M36();
        addObject(m364,339,631);
        M36 m365 = new M36();
        addObject(m365,273,632);
        removeObject(m365);
        addObject(m365,272,631);
        M36 m366 = new M36();
        addObject(m366,157,631);
        M36 m367 = new M36();
        addObject(m367,115,631);
        M36 m368 = new M36();
        addObject(m368,589,315);
        M36 m369 = new M36();
        addObject(m369,608,315);
        M36 m3610 = new M36();
        addObject(m3610,182,89);
        M36 m3611 = new M36();
        addObject(m3611,202,89);
        M29 m295 = new M29();
        addObject(m295,78,506);
        M29 m296 = new M29();
        addObject(m296,102,507);
        removeObject(m296);
        addObject(m296,102,507);
        removeObject(m296);
        addObject(m296,108,507);
        removeObject(m296);
        removeObject(m295);
        M34 m343 = new M34();
        addObject(m343,91,505);
        removeObject(m293);
        removeObject(m294);
        removeObject(m366);
        removeObject(m367);
        M54 m54 = new M54();
        addObject(m54,135,631);
        removeObject(m364);
        removeObject(m365);
        M55 m55 = new M55();
        addObject(m55,305,631);
        M10 m102 = new M10();
        addObject(m102,180,543);
        M10 m103 = new M10();
        addObject(m103,179,470);
        removeObject(m102);
        addObject(m102,181,541);
        removeObject(m103);
        addObject(m103,181,470);
        M10 m104 = new M10();
        addObject(m104,180,451);
        removeObject(m104);
        addObject(m104,181,452);
        M10 m105 = new M10();
        addObject(m105,68,406);
        M10 m106 = new M10();
        addObject(m106,180,293);
        M10 m107 = new M10();
        addObject(m107,67,337);
        M78 m784 = new M78();
        addObject(m784,305,485);
        M62 m622 = new M62();
        addObject(m622,350,516);
        M29 m297 = new M29();
        addObject(m297,643,552);
        M48 m483 = new M48();
        addObject(m483,687,576);
        Muralla1 muralla1 = new Muralla1();
        addObject(muralla1,724,485);
        removeObject(m326);
        removeObject(m323);
        removeObject(m325);
        removeObject(m324);
        M85 m853 = new M85();
        addObject(m853,227,394);
        removeObject(m104);
        removeObject(m802);
        M85 m854 = new M85();
        addObject(m854,226,439);
        M86 m862 = new M86();
        addObject(m862,104,439);
        removeObject(m862);
        removeObject(m66);
        addObject(m862,102,439);
        M43 m43 = new M43();
        addObject(m43,170,553);
        M43 m432 = new M43();
        addObject(m432,187,553);
        M43 m433 = new M43();
        addObject(m433,194,552);
        removeObject(m433);
        removeObject(m43);
        removeObject(m432);
        removeObject(m102);
        addObject(m102,181,544);
        M875 m8754 = new M875();
        addObject(m8754,168,575);
        M92 m924 = new M92();
        addObject(m924,509,325);
        M63 m63 = new M63();
        addObject(m63,259,545);
        Ar_ab ar_ab3 = new Ar_ab();
        addObject(ar_ab3,386,667);
        Lado_iz lado_iz = new Lado_iz();
        addObject(lado_iz,757,666);
        Lado_iz lado_iz2 = new Lado_iz();
        addObject(lado_iz2,11,511);
        M10 m108 = new M10();
        addObject(m108,68,427);
        M2 m2 = new M2();
        addObject(m2,518,487);
        M2 m22 = new M2();
        addObject(m22,519,502);
        M17 m17 = new M17();
        addObject(m17,495,496);
        M24 m24 = new M24();
        addObject(m24,688,351);
        M80 m803 = new M80();
        addObject(m803,203,348);
        removeObject(m803);
        M875 m8755 = new M875();
        addObject(m8755,195,349);
        M875 m8756 = new M875();
        addObject(m8756,161,440);
        removeObject(roca3);
        removeObject(bandera_especial2);
        removeObject(bandera10);
        removeObject(bandera_especial);
        removeObject(bandera2);
        removeObject(roca);
        removeObject(bandera);
        removeObject(bandera9);
        removeObject(bandera3);
        removeObject(bandera4);
        removeObject(bandera_especial3);
        removeObject(bandera8);
        removeObject(bandera7);
        removeObject(bandera5);
        removeObject(roca2);
        removeObject(bandera6);
        M32 m329 = new M32();
        addObject(m329,665,576);
        M32 m3210 = new M32();
        addObject(m3210,662,236);
        M32 m3211 = new M32();
        addObject(m3211,167,237);
        m36.setLocation(658,619);
        removeObject(m297);

        addObject(m297,642,551);
        m36.setLocation(652,633);
        m297.setLocation(643,561);
        m363.setLocation(524,621);
        m63.setLocation(266,537);
        m698.setLocation(122,295);
        m642.setLocation(240,188);
        m36.setLocation(669,623);
        m483.setLocation(684,570);
        removeObject(m363);

        addObject(m363,519,632);
        removeObject(m36);

        addObject(m36,656,632);
        removeObject(m297);
  
        addObject(m297,643,551);
        removeObject(m63);

        addObject(m63,260,542);
        M64 m645 = new M64();
        addObject(m645,181,190);
    }
}





