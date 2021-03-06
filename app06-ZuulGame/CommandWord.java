/**
 * Representations for all the valid command words for the game
 * along with a string in a particular language.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 * 
 * @modified by Daniils Pucko
 * @version 16.01.2021
 */
public enum CommandWord
{
    // A value for each command word along with its
    // corresponding user interface string.
    Go(1), Give(2), Take(3), Quit(4), Help(5);
    
    private final int id;
    
    /**
     * Gives id the commandword.
     */
    // The command string.
    private CommandWord(int id)
    {
        this.id = id;
    }
    
    /**
     * Returns the id of the commandword.
     */
    public int getValue()
    {
        return id;
    }
}
