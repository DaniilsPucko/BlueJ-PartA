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
    
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String fullTitle, String fullCode)
    {
        title = fullTitle;
        code = fullCode;
        modules = new ArrayList<Module>();
    }

    /**
     * Add module to course
     */
    public void addModule(Module newModule)
    {
        modules.add(newModule);
    }
}
