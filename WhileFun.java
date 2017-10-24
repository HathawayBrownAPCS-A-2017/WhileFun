import java.util.Scanner;

public class WhileFun

{
    Scanner keyboard;
    
    public void task1 ()
    {
        System.out.print ("Enter a number (zero to quit): ");
        int n = keyboard.nextInt();
        while ( /*  ----put something here ----  */  )
        {
            System.out.println ("Something");
            System.out.print ("Enter a number (zero to quit): ");
            n = keyboard.nextInt();
        }  
        System.out.println ("Something involving Goodbye!");
    }
    
    public void task2 ()
    {
        System.out.print ("Enter a number (negative to quit): ");
        double x = keyboard.nextDouble();
        while ( /*  ----put something here ----  */  )
        {
            System.out.println ("Something");
            System.out.print ("Enter a number (negative to quit): ");
            x = keyboard.nextDouble();
        }  
        System.out.println ("Something involving Goodbye!");
   }
     
    public void task3 ()
    {
    }
    
    public void task4 ()
    {
    }
   
    public static void main (String [] args)
    {
        WhileFun wf = new WhileFun();
        
        wf.keyboard = new Scanner (System.in);
        
        wf.task1();
        // wf.task2();
        // wf.task3();
        // wf.task4();
        
        wf.keyboard.close();
    }
}