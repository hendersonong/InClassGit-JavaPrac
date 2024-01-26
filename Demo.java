import java.util.Scanner;

public class Demo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What would you like to eat today! " + "a steak or salad?");
        String input = keyboard.nextLine();

        while (!(input.equalsIgnoreCase("steak") || input.equalsIgnoreCase("salad")))
        {
            System.out.println("What would you like to eat today! " + "a steak or salad?");
            input = keyboard.nextLine();
        }
        
        if(input.equalsIgnoreCase("salad"))
        {
            Food salad = new Salad();
            salad.order();
        }
        else if(input.equalsIgnoreCase("steak"))
        {
            Food steak = new Steak();
            steak.order();
        }

        keyboard.close();
        
    }   




}
