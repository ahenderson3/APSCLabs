import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int stepCounter = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Critter c = new Critter();
        this.addObject(c, 50, 200);
    }

    public void act()
    {
        this.stepCounter++;
        if(this.stepCounter % 50 == 0)
        {
            Dot d = new Dot();

            this.addObject(d, 75, 160);
        }
    }
    
  
}
