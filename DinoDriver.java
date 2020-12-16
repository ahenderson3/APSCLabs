
/**
 * Write a description of class DinoDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver
{
    public static void main(String[] args)
    {
        Dinosaur d1 = new Dinosaur();
        Dinosaur d2 = new Dinosaur("TRex");

        Dinosaur[] pop = new Dinosaur[10];

        for(int i = 0; i < pop.length; i++)
        {
            pop[i] = new Dinosaur("TRex");
        }
        
        for(int i = 0; i < pop.length; i++)
        {
            int rand = (int)(Math.random()*40);
            for (int j = 0; j< rand; j++)
            {
                pop[i].ageUp();
            }
        }

        
        System.out.println(pop[2].toString());
    }
}
