import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoxCritter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoxCritter extends Actor
{
    private int stepCounter;
    private int sideSize;
    
    public BoxCritter()
    {
        this.stepCounter = 0;
        this.sideSize = 15;
    }
    
    /**
     * Act - do whatever the BoxCritter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.move(3);
        this.stepCounter = this.stepCounter + 1;
        if( this.stepCounter == this.sideSize)
        {
            this.turn(90);
            this.stepCounter = 0;
        }
        System.out.println(this.stepCounter);
    }    
   
    
}
