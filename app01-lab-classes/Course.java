
/**
 * Write a description of class Course here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String code;
    private String title;
  

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseTitle, String codeNumber)
    {
    title = courseTitle;
    code = codeNumber;
    }
    
    /**
     * prints courses code number and title
     */
    public void print()
    {
     System.out.println("Course title: " + title + ", Course code number: " + code);  
    }


}
