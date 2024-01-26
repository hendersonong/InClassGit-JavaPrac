import java.util.Scanner;

public class Salad extends Food
{

    public void order()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("A salad will cost you $5" + " Our option of sauce is ranch or french");
        String input = keyboard.nextLine();

        while(!(input.equalsIgnoreCase("ranch") || input.equalsIgnoreCase("french")))
        {
            System.out.println("A salad will cost you $5" + " Our option of sauces are ranch or french");
            input = keyboard.nextLine();
        }

        if(input.equalsIgnoreCase("ranch"))
        {
            System.out.println("Here is your salad with ranch dressing" + " Thank you, come again!");
        }
        else if(input.equalsIgnoreCase("french"))
        {
            System.out.println("Here is your salad with french dressing" + " Thank you, come again!");
        }
        
        keyboard.close();
    }



    
}
