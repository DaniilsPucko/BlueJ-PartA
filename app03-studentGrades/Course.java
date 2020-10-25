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
    public ArrayList<Module> modules;
    public String title;
    private int capacity;
    public int grade;
    public int finalgrade;
    public String mark;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String fullTitle)
    {
        title = fullTitle;
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
    
    /**
     * Calculates grade sum
     */
    public void grade(Module module)
    {
        grade = grade + module.getMark();
    }
    
    /**
     * Converts final grade to letter
     */
    public void finalGrade()
    {
        finalgrade = grade / 4;
        if(finalgrade <= 39)
        {
            mark = "F";
        }
        else if(finalgrade<=49)
             {
                 mark = "D";
             }
             else if(finalgrade<=59)
                  {
                      mark = "C";
                  }
                  else if(finalgrade<=69)
                       {
                           mark = "B";
                       }
                       else
                       {
                           mark = "A";
                       }
    }
    
    /**
     * Prints info about course and its modules.
     */
    public void printCourse()
    {
        System.out.println("Course title: " + title);
        for(Module module : modules) 
        {
            module.printModule();
        }
        System.out.println("Course final grade: " + mark);
    }
}
