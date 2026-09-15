/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.*;
/**
 *
 * @author Student
 */
public class PoePart1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Login login = new Login();
        boolean running = true;
        
        System.out.println("==========  WELCOME!!   =========");
        System.out.println("==========  MENU!!      =========");
        
        while(running){
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            String choice = input.nextLine();
            
            switch(choice){
                case "1":
                    registerMenu(input, login);
                    break;
                case "2":
                    loginMenu(input, login);
                    break;
                case "3":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid Option, please choose 1,2 or 3.");
            }
        }
        
        input.close();
        
    } 
    
    private static void registerMenu(Scanner input, Login login){
        System.out.println("======== USER REGISTRATION ==========");
        
        System.out.print("Enter a username: ");
        String userName = input.nextLine();
        
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        
        System.out.print("Enter a South African cell phone number e.g: +27723456789. ");
        String cellPhoneNumber = input.nextLine();
        
        System.out.print("Enter your name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        String registrationMessage = login.registerUser(userName, password, cellPhoneNumber, firstName, lastName);
        
        System.out.println(registrationMessage);
    }
    
    private static void loginMenu(Scanner input, Login login){
        if(!login.isRegistered()){
            System.out.println("No registered user found. Please register first.");
            return;
        }
        
        System.out.println("========= USER LOGIN ============");
        
        boolean loogedIn = false;
        
        while(!loogedIn){
                 System.out.print("Enter your username: ");
        String userName = input.nextLine();
        
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        
        String loginMessage = login.returnLoginStatus(userName, password);
        
        System.out.println(loginMessage);
        
        if(!loogedIn){
            System.out.print("Try again?(y/n)");
            String retry = input.nextLine();
            
            if(!retry.equalsIgnoreCase("y")){
                break;
            }
        }
        }
        
    }
}
