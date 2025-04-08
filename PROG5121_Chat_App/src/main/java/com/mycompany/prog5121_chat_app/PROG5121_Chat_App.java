/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121_chat_app;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class PROG5121_Chat_App {

    //Variable to store registered user 
   
    static String storedUsername;
    static String storedPassword;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
    //User Registration
    System.out.println("====Registration===");
    
    //Username
    System.out.print("Enter Username(must contain '-' and be no longer than 5 characters ):");
    String username = input.nextLine();
    while (!isValidUsername (username)){
       System.out.print("Invalid. Try again:");
       username = input.nextLine();
    }
    
    //Users Password
    System.out.print("Enter a strong password (min 8characters,A-Z,a-z,numbers abd symbol:");
    String password = input.nextLine();
    
    //Cellphone number (Regex from ChatGPT)
    System.out.print("Enter your cellphone number here (e.g +2793434533):");
    String cell = input.nextLine();
    while (!isValidCell(cell)){
        System.out.print("Invalid number. Please Try again:");
        cell=input.nextLine();
    }
    
    //Storing Users Details
    storedUsername = username;
    storedPassword = password;
    
    System.out.println("\nRegistration successful!\n");
    
    //User Login
    System.out.println("===Login===");
    System.out.print("Enter username:");
    String loginUser = input.nextLine();
    System.out.print("Enter password:");
    String loginPass = input.nextLine();

    if (loginUser.equals(storedUsername)&&
            loginPass.equals(storedPassword) ){
        System.out.println("Login successful.welcome"+"!");
    }else
    {
        System.out.println("Login failed. Please check your username or password.");
                }
    }
    
    //Validation methods
    public static boolean isValidUsername(String username){
        return username.contains("_")&&
                username.length()<=5;
    }
    public static boolean isValidPassword(String password){
        //Password must contain uppercase,lowercase,digit,special character and be 8 characters long
        String pattern="^(?=.*[a-z])(?=.[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return Pattern.matches(pattern,password);
    }
    
    public static boolean isValidCell(String cell){
        //Attributed to ChatGPT for providing regex for south african numbers(+27 and 9 digits)
        String pattern="\\+27\\d{9}$";
        return Pattern.matches(pattern, cell);
    }
}
