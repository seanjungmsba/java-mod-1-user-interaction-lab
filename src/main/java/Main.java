import java.util.Scanner;


// Ask the user to enter their age and display a greeting to them based on whether they are younger or older than 18. Take care to handle the case where they are exactly 18.
// Display an extra special message to them if they are younger than 10.
public class Main {
    public static void main(String[] args) {
        // your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("You cannot be less than 0 year old!");
            System.exit(1);
        }
        

        if (age >= 18) {
            System.out.println("Your age is more than 18. I expect you to act your age.");
        } else if (age < 18 && age >= 10) {
            System.out.println("Your age is between 10 and 18, so you must be in a school.");
        } else {
            System.out.println("You are less than 9 years old? Hello Kido!");
        }


    }
}
