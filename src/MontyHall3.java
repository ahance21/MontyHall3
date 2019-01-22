import java.util.Random;
import java.util.Scanner;

public class MontyHall3 {

	public static void main(String[] args) 
	
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int carDoor = rand.nextInt(3) + 1;
		int win = 0;
		System.out.print("Please enter the number of times you would like to roll ");
		String rollStr = keyboard.nextLine();
		int roll = Integer.parseInt(rollStr);
		System.out.print("What door would you like to choose? ");
		String doorchoiceStr = keyboard.nextLine();
		int doorchoice = Integer.parseInt(doorchoiceStr);
		{
		if (roll < 10 || roll > 10000)
		System.out.print("Enter a nuber between 10 and 10000 ");
		}
	    if (roll >= 10 || roll <= 10000)
		System.out.print("Would you like to switch doors? ");
        String doorswitch = keyboard.nextLine();
        {
        if (doorswitch.equals("no"))
        for(int i =0; i < roll; i++)
        while (doorchoice == carDoor)
        win++;
        
        System.out.print("You won " + win);
        
        
        } 
        
        {
        if (doorswitch.equals("yes"))
        System.out.print("What door would you like to switch to? ");
        String doorStr = keyboard.nextLine();
        int door = Integer.parseInt(doorStr);
        
        if (door == 1)
        {
        for (int i =0; i < roll; i++)
        while (door == carDoor)
        win++;
        
        System.out.print("You won " + win);
        }
        else if (door == 2)
        {
        for (int i =0; i < roll; i++)
        while (door == carDoor)
        win++;
        
        System.out.print("You won " + win);
        }
        else if (door == 3)
        {
        for (int i =0; i < roll; i++)
        while (door == carDoor)
        win++;
        
        System.out.print("You won " + win);
        }
        }
	}
}
