import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("\n\nWelcome to my Largest of Three program!!\n\n");

        // Varieble Decloration Section
        String userName;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;


        // create a scanner object
        Scanner scanner = new Scanner(System.in);

        // prompt the user for username
        System.out.println("\n Please enter your name:");
        userName = scanner.nextLine();

        // output username

        System.out.println("\n The username is: " + userName);

        // get the ints from the user.
        System.out.println("Enter a random number: ");
        num1 = scanner.nextInt();
        //output num1
        System.out.println("\n You entered: " + num1 + " for the first number.");

        System.out.println("Now enter your age: ");
        num2 = scanner.nextInt();
        //output num2
        System.out.println("\n You entered: " + num2 + " for your age.");

        System.out.println("Finally, enter your favorite number: ");
        num3 = scanner.nextInt();
        //output num3
        System.out.println("\n You entered: " + num3 + " for your favorite number.");

        System.out.println("\n Your username is " + userName + ", then for the numbers you entered: " + num1 + " for a random number, for your age you entered " + num2 + ", and finally " + num3 + " for your favorite number.");

        // this is a statement to find the largest int.

        if (num1 > num2 & num1 > num3) {
            largest = num1;

        }
        if (num2 > num1 & num2 > num3) {
            largest = num2;

        }
        if (num3 > num1 & num3 > num2) {
            largest = num3;
        }

        // output largest
        System.out.println("\n The largest of " + num1 + " and " + num2 + " and " + num3 + " is " + largest);


    }
}