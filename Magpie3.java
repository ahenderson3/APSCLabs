/**
 * A program to carry on conversations with a human user.
 * This version:
 * <ul><li>
 * Uses advanced search for keywords
 * </li></ul>
 *
 * @author Laurie White
 * @version April 2012
 */
public class Magpie3
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement
     * the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (findKeyword(statement, "no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (findKeyword(statement, "mother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (findKeyword(statement, "ball") >= 0)
        {
            response = "Talk to me about sports.";
        }
        else if (findKeyword(statement, "grade") >= 0)
        {
            response = "How is school going?";
        }
        else if (findKeyword(statement, "class") >= 0)
        {
            response = "How is school going?";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     *
     * @param statement
     * the string to search
     * @param goal
     * the string to search for
     * @param startPos
     * the character of the string to begin the
     * search at
     * @return the index of the first occurrence of goal in
     * statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal,
    int startPos)
    {
        //trim removes white space before and after string

        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();
        int index = phrase.indexOf(goal);
       

        boolean front = false;
        boolean back = false;
       
        
        while(index > -1)  
        {

            //check front side
            if(index == 0)// if statement.substring(index-1, index).equals("  "));
            {
                front = true;
            }
            else
            
            {
                String firstLet = phrase.substring(index-1, index);
                if( firstLet.equals("  "))
                    front = true;
            }        

            //check the back side
            int lastIndex = goal.length() + index;
            //this must happen after testing to see if goal is last letter
            String lastLet = phrase.substring(lastIndex, lastIndex+1);
            if( lastLet.equals("  "))// if statement.substring(index-1, index).equals("  "));
                front = true;

            // Your code goes here

            if(front == true && back == true)
            {
                return index;  
            }
            index = phrase.indexOf(goal, index+1);

        }
        return -1;
    }

    private int findKeyword(String s, String g)
    {
        return findKeyword(s, g, 0);
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 8;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Wow!";
        }
        else if (whichResponse == 5)
        {
            response = "I wonder about that.";
        }
        else if (whichResponse == 6)
        {
            response = "That is crazy.";
        }
        else if (whichResponse == 7)
        {
            response = "How so?";
        }

        return response;
    }

}