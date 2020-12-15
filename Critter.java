import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Animal. This is the base class for all animals. In addition to the standard Actor
 * methods, it provides methods to check for being at the edge of the world, as well as
 * seeing and eating other classes.
 * 
 * @author Aidan Henderson
 * @version 2.0
 */
public class Critter extends Actor
{
    /**
     * Move forward in the current direction.
     */
    public void act()
    {
        pressKey();
        if (this.isAtEdge() == true)
        {
            this.turn(180);
            System.out.println(this.toString()+ "   " + this.getX());
            
            
        }
    }

   
    /**
     * Move the actor with arrow keys
     */
    public void pressKey()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+ 5,getY());
        }    
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+5);
        }
   }
}
