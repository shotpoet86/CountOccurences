/*Programmer: Austin Parker     Date: Oct. 22, 2020
 * Assignment: 21.6 CountOccurrence
 * Description: This program will allow the user to enter as many numbers as they choose.
 * When the user is done entering numbers, the last number they enter will be zero. The program
 * will then calculate and display the entered number or numbers with the most occurrences.
 * If there are not matches, a list of numbers input will display rather than occurrences. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Count Occurrence! \n");
        System.out.println("--- To use program you will input a number then press enter.");
        System.out.println("--- Continue entering numbers pressing enter after each until you are ready to calculate.");
        System.out.println("--- Press \"0\"(zero) to calculate your numbers");
        System.out.println("\nInput \"Y\" and Enter to Start program or \"N\" and Enter to exit program");

        /*scanner declaration and var storage of result*/
        Scanner userInput = new Scanner(System.in);
        String startApp = userInput.nextLine().toLowerCase();

        /*determines whether to startApp or terminate program*/
        if (startApp.equals("y")) {
            System.out.println("Start entering your numbers:");
            Scanner inputNumbers = new Scanner(System.in);
            /*arrays to store input numbers and frequency*/
            ArrayList<Integer> numberArray = new ArrayList<Integer>();
            ArrayList<Integer> numberFrequency = new ArrayList<Integer>();

            /*while loop allows user input until receiving zero*/
            while (true) {
                int userIntegers = inputNumbers.nextInt();
                if (userIntegers == 0)
                    break;
                numberArray.add(userIntegers);
                numberFrequency.add(Collections.frequency(numberArray, userIntegers));
            }

            /*var for finding max frequency*/
            int maxCount = Collections.max(numberFrequency);
            /*displays numbers with max occurrence*/
            System.out.println("Number or number(s) most frequently occurring in count listed below : ");
            for (int i = 0; i < numberFrequency.size(); i++) {
                if (numberFrequency.get(i) == maxCount) {
                    System.out.print(numberArray.get(i) + "  ");
                }
            }
        } else {
            /*message displayed if user terminates program early*/
            System.out.println("Thanks for looking at my program!");
            System.exit(0);
        }
    }/*end of main*/
}/*end of class*/

