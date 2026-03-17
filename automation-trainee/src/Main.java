import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi! I'm a task tracker.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println(userName + ", Welcome to the task tracker!");

        String[][] tasksArray = new String[10][3];
        int taskNumbering = 0;

        int userChoice;

        do {
            System.out.println("\n" + userName + ", select one of the menu options:");
            System.out.println("1 - Enter a task");
            System.out.println("2 - Display information about tasks");
            System.out.println("0 - Exit");
            System.out.print("Enter your choice: ");

            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    if (taskNumbering < tasksArray.length) {
                        System.out.println("\n--- Entering a new task ---");

                        System.out.print("Let's go! Enter the name of your task: ");
                        tasksArray[taskNumbering][0] = scanner.nextLine();

                        System.out.print("Now describe your task: ");
                        tasksArray[taskNumbering][1] = scanner.nextLine();

                        System.out.print("What is the priority of your task (Please enter a number between 1 and 10): ");
                        tasksArray[taskNumbering][2] = scanner.nextLine();

                        System.out.println(userName + ", Great job! Your task has been successfully added.");
                        taskNumbering++;
                    } else {
                        System.out.println("The task archive is full! Cannot add more tasks.");
                    }
                    break;

                case 2:
                    if (taskNumbering > 0) {
                        System.out.println("\nInformation about your tasks");
                        for (int i = 0; i < taskNumbering; i++) {
                            System.out.println("\nTask number " + (i + 1));
                            System.out.println("  Name: " + tasksArray[i][0]);
                            System.out.println("  Description: " + tasksArray[i][1]);
                            System.out.println("  Priority: " + tasksArray[i][2]);
                        }
                        System.out.println("\nAll tasks: " + taskNumbering);
                    } else {
                        System.out.println("\nNo tasks added yet.");
                    }
                    break;

                case 0:
                    System.out.println("\nGoodbye, " + userName + "! See you soon!");
                    break;

                default:
                    System.out.println("\nError! Please choose 1, 2, or 0.");
            }

        } while (userChoice != 0);

        scanner.close();
    }
}