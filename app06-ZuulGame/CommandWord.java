/**
 * Representations for all the valid command words for the game
 * along with a string in a particular language.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public enum CommandWord
{
    // A value for each command word along with its
    // corresponding user interface string.
    Go(1), Drop(2), Give(3), Take(4), Quit(5), Unknown(6), Help(7);
    
    private final int id;
    
    private CommandWord(int id)
        {
            this.id = id;
        }
        
    public int getValue()
    {
        return id;
    }
}
