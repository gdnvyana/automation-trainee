import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        System.out.println("Homework number 1");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        int score;
        do {
            System.out.print(userName + ", please enter your score (0-100): ");
            score = scanner.nextInt();
            scanner.nextLine();

            if (score < 0 || score > 100) {
                System.out.println(userName + ", incorrect value! Score must be between 0 and 100.");
            }
        } while (score < 0 || score > 100);

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
        } else {
            System.out.println(userName + ", your grade is F!");
        }


        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Homework number 2");
        System.out.println();

        String userInput;

        do {
            System.out.println(userName + ", please enter something or 'exit' for output:");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println(userName + "Goodbye!");
            } else {
                System.out.println("You entered: " + userInput);
                System.out.println();
            }
        } while (!userInput.equalsIgnoreCase("exit"));
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Homework number 3");


        System.out.print(userName + ", please enter your number: ");
        int x = scanner.nextInt();

        int sum = Math.abs(x) * (Math.abs(x) + 1) / 2;
        int result = (x >= 0) ? sum : -sum;

        System.out.printf("The sum of all numbers from 0 to %d is %d", x, result);
    }
}