import java.util.*;
/**
 * Write a description of class Course here.
 * 
 * @author (Daniils Pucko) 
 * @version (24.10.2020)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private int x;
    public ArrayList<Module> modules;
    private String title;
    private String code;
    private int capacity;
    
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String fullTitle, String fullCode)
    {
        title = fullTitle;
        code = fullCode;
        modules = new ArrayList<Module>();
        capacity = 4;
    }

    /**
     * Add module to course
     */
    public void addModule(Module newModule)
    {
         if(modules.size() == capacity) 
        {
            System.out.println("The Course is full, you cannot add more modules.");
        }
         else
        {
            modules.add(newModule);
        }
    }
}
