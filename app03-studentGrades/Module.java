
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
    public int credit;


    /**
     * Constructor for objects of class Module
     */
    public Module(String fullTitle, String codeNumber)
    {
        title = fullTitle;
        code = codeNumber;
        mark = 0;
        credit = 0;
    }
    
    /**
     * Add percentageMark
     */
    public void addMark(int percentageMark)
    {
        mark = percentageMark;
    }
    
     /**
     * Add credits to module
     */
    public void addCredits(int cred)
    {
        if(mark >= 40){
            credit = cred;
        }
        else
        {
            System.out.println("Your mark is lower than 40%, please correct it to finish module");
        }   
    }
    
    /**
     * Prints module's details
     */
    public void printModule()
    {
        System.out.println("Module title: " + title);
        System.out.println("Module code number: " + code);
        System.out.println("Students mark: " + mark + "%");
         if(credit == 15)
        {
            System.out.println("Module credits: " + credit);
            System.out.println("Module finished");
        }
        else
        {
            System.out.println("Module credits: " + credit);
            System.out.println("Module is not finished");
        }
    }
    
    
    /**
     * Get module mark.
     */
    public int getMark()
    {
        return mark;
    }
    
}
