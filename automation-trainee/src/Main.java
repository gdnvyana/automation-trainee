import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Выводим приветственное сообщение.
        System.out.println("Hi! I'm a task tracker.");

//        Создаем Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

//        Просим пользователя ввести имя + вывод приветственного сообщения.
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println(userName + ", Welcome to the task tracker!");

//        Просим пользователя ввести название задачи и сохраняем результат в переменной
        System.out.print("Let's go! Enter the name of your task: ");
        String taskName = scanner.nextLine();

//        Просим пользователя ввести описание задачи и сохраняем результат в переменной
        System.out.print("Now describe your task: ");
        String taskDescribe = scanner.nextLine();

//        Просим пользователя ввести приоритет задачи (от 1 до 10) и сохраняем результат в переменной
        System.out.print("What is the priority of your task (Please enter a number between 1 and 10): ");
        int taskPriority = scanner.nextInt();

//        Выводим сообщение о подтверждении
        System.out.println(userName + ", Great job! Information about your first task has been successfully added.");

//        Выводим информацию о задаче (название, описание, приоритет)
        System.out.println("Information about your task: ");
        System.out.println("Name: " + taskName);
        System.out.println("Description: " + taskDescribe);
        System.out.println("Priority: " + taskPriority);

        scanner.close();
    }
}