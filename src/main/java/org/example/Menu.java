package org.example;

import org.example.models.User;

import java.util.Scanner;

public class Menu {
    private static Game game = new Game();
    private static Scanner scanner = new Scanner(System.in);
    public static void showMenu(){
       mainMenu();
       String next = scanner.next();
       if (next.equals("1")) {
           game.continueGame(loginMenu());
       }else if(next.equals("2")){
           game.startGame(loginMenu());
       }else if (next.equals("3")){
           joinServer();
       }else if (next.equals("4"))
           System.exit(0);
    }
    public static void mainMenu(){
//        show menu : sout ()
        System.out.println("***Welcome to light city***");
        System.out.println("1- Continue");
        System.out.println("2- Start New Game");
        System.out.println("3- Join Server");
        System.out.println("4- Exit");

    }

    public static User loginMenu(){
//       get user info : username, password
        Scanner log=new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username =log.next();
        System.out.print("Enter your password: ");
        String password = log.next();
        return null;
    }

    private static void joinServer(){
        System.out.print("Enter Server Ip Address :");
        String ip = scanner.next();
        System.out.print("Enter Server Port :");
        int port = scanner.nextInt();
        game.joinServer(ip,port);
    }
    public static void main(String[] args) {
        showMenu();
    }
}
