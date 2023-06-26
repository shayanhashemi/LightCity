package org.example;

import org.example.models.User;


import java.util.Scanner;

public class Menu {
    private static Game game = new Game();
    private static Scanner scanner = new Scanner(System.in);
    private static Database database = new Database();

    public static void showMenu() {
        mainMenu();
        String next = scanner.next();
        if (next.equals("1")) {
            game.continueGame(loginMenu());
            UserMenu();

        } else if (next.equals("2")) {
            game.startGame(loginMenu());
            UserMenu();

        } else if (next.equals("3")) {
            joinServer();
            UserMenu();

        } else if (next.equals("4"))
            System.exit(0);
    }

    public static void mainMenu() {
//        show menu : sout ()
        System.out.println("***Welcome to light city***");
        System.out.println("1- Continue");
        System.out.println("2- Start New Game");
        System.out.println("3- Join Server");
        System.out.println("4- Exit");
    }
    public static void UserMenu(){
        System.out.println("UserMenu:");
        System.out.println("1- Go to");
        System.out.println("2- Process Location");
        System.out.println("3- Dashboard");
        System.out.println("4- Life");
        System.out.println("5- Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                goTo();
                break;
            case 2:
                processLocation();
                break;
            case 3:
                dashboard();
                break;
            case 4:
//                life();
                break;
            case 5:
                System.out.println("Exiting the program...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");

        }
    }
    private static void goTo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Go to:");
        System.out.print("Enter location or id or industry title: ");
        String input = scanner.nextLine();
       //nazanin

        System.out.println("Going to " + input);
    }
    private static void processLocation() {
        System.out.println("Process Location:");
        System.out.println("a. Show where is character: Property detail {position, title,...}");
        System.out.println("b. Show options according to Industry and Property ownership");
        String a= scanner.nextLine();
        switch (a){
            case "a"://nazanin
                break;
            case "b":
                //nazanin
                break;
        }
    }
    private static void dashboard() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Dashboard:");
        System.out.println("a. My job");
        System.out.println("b. Properties");
        System.out.println("c. Economy");
        System.out.println("5. Life");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                //nazanin
               myJob();
                break;
            case 2:
                //nazanin
               // properties();
                break;
            case 3:
                //nazaNIN
                //economy();
                break;

            case 4:
                //NAZANIN
               // life();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    private static void myJob() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("My job:");
        System.out.println("i. Find job");
        System.out.println("ii. Show Properties");
        System.out.println("iii. Sell");
        System.out.println("iv. Management");
        System.out.println("v. Found industry");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                //NAZANIN
                findJob();
                break;
            case 2:
                //NAZZANIN
                showProperties();
                break;
            case 3:
                //NAZANIN
                sell();
                break;
            case 4:
                //NAZANIN
                management();
                break;
            case 5:
//                foundIndustry();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    private static void findJob() {
        System.out.println("Finding a job...");

        // Perform the desired action
        // Add your code here
    }
    private static void showProperties() {
        System.out.println("Showing properties...");

        // Perform the desired action
        // Add your code here
    }
    private static void sell() {
        System.out.println("Selling...");

        // Perform the desired action
        // Add your code here
    }
    private static void management() {
        System.out.println("Managing...");

        // Perform the desired action
        // Add your code here
    }

    public static User loginMenu() {
//       get user info : username, password
        Scanner log = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = log.next();
        System.out.print("Enter your password: ");
        String password = log.next();
        User tempUser = new User(username, password);
        return database.loginGame(tempUser);
    }

    private static void joinServer() {
        System.out.print("Enter Server Ip Address :");
        String ip = scanner.next();
        System.out.print("Enter Server Port :");
        int port = scanner.nextInt();
        game.joinServer(ip, port);
    }

    public static void main(String[] args) {
        showMenu();
    }
}
