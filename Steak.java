import java.util.Scanner;

public class Steak extends Food
{
    
   public void order()
   {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("A steak will cost you $15" + " Please choose your steak type, either ribeye or hanger");
        String input = keyboard.nextLine();

        while(!(input.equalsIgnoreCase("ribeye") || input.equalsIgnoreCase("hanger")))
        {
            System.out.println("A steak will cost you $15" + " Please choose your steak type, either ribeye or hanger");
            input = keyboard.nextLine();
        }

        if(input.equalsIgnoreCase("ribeye"))
        {
            System.out.println("Here is your ribeye steak" + " Thank you, come again!");
        }
        else if(input.equalsIgnoreCase("hanger"))
        {
            System.out.println("Here is your hanger steak" + " Thank you, come again!");
        }
        
        keyboard.close();
   }
}
