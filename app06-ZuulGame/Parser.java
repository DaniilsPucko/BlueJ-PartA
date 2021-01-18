import java.util.Scanner;

/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This parser reads user input and tries to interpret it as an "Adventure"
 * command. Every time it is called it reads a line from the terminal and
 * tries to interpret the line as a two-word command. It returns the command
 * as an object of class Command.
 *
 * The parser has a set of known command words. It checks user input against
 * the known commands, and if the input is not one of the known commands, it
 * returns a command object that is marked as an unknown command.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 * 
 * @modified by Daniils Pucko
 * @version 18.01.2021
 */
public class Parser 
{

    private Scanner reader;         // source of command input

    /**
     * Create a parser to read from the terminal window.
     */
    public Parser() 
    {
        reader = new Scanner(System.in);
    }
    
    public String[] getCommand()
    {
        while(true){
            System.out.print("> ");
            String inputLine = reader.nextLine();
            String[] command = inputLine.split(" ");
            for(CommandWord command1 : CommandWord.values())
            {
                if(command[0].equalsIgnoreCase(command1.name())){
                    return command;
                }
            }
            System.out.println(command[0] + "is unknown command");
            }
    }


}
