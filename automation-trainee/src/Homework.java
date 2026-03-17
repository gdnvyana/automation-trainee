import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        System.out.println("Homework number 1");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print(userName + ", please enter your score: ");
        int score = scanner.nextInt();
        scanner.nextLine();

        while (score < 0 || score > 100) {
            System.out.print(userName + ", incorrect value, please, enter your score again: ");
            score = scanner.nextInt();
            scanner.nextLine();
        }

        if (score >= 90) {
            System.out.println(userName + ", your grade is A!");
        } else if (score >= 80) {
            System.out.println(userName + ", your grade is B!");
        } else if (score >= 70) {
            System.out.println(userName + ", your grade is C!");
        } else if (score >= 60) {
            System.out.println(userName + ", your grade is D!");
        } else if (score >= 50) {
            System.out.println(userName + ", your grade is E!");
        } else System.out.println(userName + ", your grade is F!");

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Homework number 2");
        System.out.println();

        String userInput;

        while (true) {
            System.out.println(userName + ", please enter something or 'exit' for output:");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println(userName + "Goodbye!");
                break;
            }

            System.out.println("You entered: " + userInput);
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Homework number 3");


        System.out.println(userName + ", please enter your number: ");
        int x = scanner.nextInt();
        int sum;

        if (x >= 0) {
            sum = x * (x + 1) / 2;
        } else {
            sum = -((-x) * (-x + 1) / 2);
        }

        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
    }
}