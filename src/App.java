import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\n************************************");
        System.out.println("Enter the money you have in 'Euro': ");
        System.out.println("************************************");
        int money =Integer.parseInt(in.nextLine());

        while (money > 0) {
            System.out.println("\n********************************");
            System.out.println("Are you ready to play? (yes/no): ");
            System.out.println("********************************");

            String inputYesNo = in.nextLine().toLowerCase();

            // Conditional Statement asking the player to play the game
            if (!inputYesNo.equals("yes")) 
		    {
            // Banner message if players quits the game
            System.out.println("Thank you for playing!");
		    System.out.println("You got " + money + " euro left in your pocket. Bye!");
               
            break;
            }

            // Money bank decrementing each time a player plays the game
            money = money - 1;

            int number_1 = rand.nextInt(10) + 1;
            int number_2 = rand.nextInt(10) + 1;
            int number_3 = rand.nextInt(10) + 1;

            // Printing the random numbers
            System.out.println("\nHere are your numbers:");
	        System.out.println(number_1 + " " + number_2 + " " + number_3);

           
            int enteredNumber = 0;
            if (number_1 == 7) enteredNumber++;
            if (number_2 == 7) enteredNumber++;
            if (number_3 == 7) enteredNumber++;

            // Conditional Statements upon winning the game

            if (enteredNumber == 1) {
                System.out.println("\nYou won! You've guessed one (7)! Total earnings, 3 euro!");
                money = money + 3;
            } else if (enteredNumber == 2) {
                System.out.println("\nYou won! You've guessed two (7s)! Total earnings, 5 euro!");
                money = money + 5;
            } else if (enteredNumber == 3) {
                System.out.println("\nYou won! You've guessed three (7s)! Total earnings, 10 euro!");
                money = money + 10;
            } else {
                System.out.println("\nSorry, you lost the game!");
            }

            System.out.println("\nYour total earnings: " + money + " euro");
        }

        if (money <= 0) {
            System.out.println("\nYou have no money left. Please top up to play again!");
        }

    }
}

