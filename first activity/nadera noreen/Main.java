package submissions;

/**
 * Name: Nadera Noreen
 * Section: Altruism 
 * Year: 4th 
 * 
 * 
 * */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grades = 0, total = 0, choice, i = 0;

        do{
            System.out.print("Do you want to enter grade?[1 - Yes/ 0 - No]: ");
            choice = scan.nextInt();
                if (choice == 1){
                System.out.print("Enter grade: ");
                grades = scan.nextInt();
                total += grades;
                i++;
            }

        }while(choice == 1);

        total = total / i;
        System.out.println("Total average: " + total);
    }
}