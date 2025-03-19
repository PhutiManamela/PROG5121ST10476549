/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javapractical2_scannerclass;
import java.util.Scanner;//calling scanner to accept user input using GUI
/**
 *
 * @author RC_Student_lab
 */
public class JavaPractical2_ScannerClass {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);// Creating  a new Scanner object,this is an instance of the Scanner object, this
        System.out.print ("Please enter your name");//Asking for user input 
        String name = myScanner.nextLine();//Using the String data type to store the name
        System.out.println (name);
        myScanner.close();
       //eat();
    }
    public void eat(){//Creating a method called eat
        System.out.println( "I can eat");//printing the message 
    }


}





