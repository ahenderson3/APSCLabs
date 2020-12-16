
/**
 * Write a description of class Dinosaur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dinosaur
{
    // instance variables - replace the example below with your own
    private int age;
    private String type;
    private String gender;
    private int health;

    /**
     * Constructor for objects of class Dinosaur
     */
    public Dinosaur()
    {
        this.type = "Dino";
        this.age = 0;
        // initialise instance variables

        this.health = 10;
    }

    /**
     * Explicit constructor for the Dino class
     */
    public Dinosaur(String t)
    {
        this.type = t;
    }

    /********* Getters ********/
    //getters return private instance data
    public String getType()
    {
        return this.type;
    }

    public String getGender()
    {
        return this.gender;
    }

    public int getAge()
    {
        return this.age;
    }

    public int getHealth()
    {
        return this.health;
    }

    /********* Setters ********/
    public void setType(String t)
    {
        this.type = t;
    }

    boolean dinoEquals;

    public boolean equals(Dinosaur d)
    {
        if (d1.equals(d2))
        {
            this.dinoEquals = true; 
            ageUp();
        }
    }

    public void ageUp()
    {
        this.age++;
        if(this.age<10)

            this.health = this.health +10;

        else if (this.age >=25 && this.age <=30)
            this.health-=5;    
        else
            this.health-=10;

    }

    /**
     * return this Dino as a string
     */
    public String toString()
    {
        String answer = this.type + this.age + "  " + "   " +this.health;
        return answer;
    }
}
