import java.util.*;
/**
 * Write a description of class Course here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    public ArrayList<Module> modules;
    public String title;

    /**
     * Constructor for objects of class Course
     */
    public Course(String coursename)
    {
        title = coursename;
    }
    
    /**
     * Add modules to course.
     */
    public void addModule(Module newModule)
    {
        modules.add(newModule);
    }
    
}
