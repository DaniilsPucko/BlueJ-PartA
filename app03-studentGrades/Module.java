
/**
 * Write a description of class Module here.
 * 
 * @author (Daniils Pucko) 
 * @version (24.10.2020)
 */
public class Module
{
    public String title;
    public String code;
    public int mark;

    /**
     * Constructor for objects of class Module
     */
    public Module(String fullTitle, String codeNumber)
    {
        title = fullTitle;
        code = codeNumber;
        mark = 0;
    }
    
    /**
     * Add percentageMark
     */
    public void addMark(int percentageMark)
    {
        mark = percentageMark;
    }
    
    /**
     * Prints module's details
     */
    public void printModule()
    {
        System.out.println("Module title: " + title);
        System.out.println("Module code number: " + code);
        System.out.println("Students mark: " + mark);
    }
    
    /**
     * Get module mark.
     */
    public int getMark()
    {
        return mark;
    }
    
}
