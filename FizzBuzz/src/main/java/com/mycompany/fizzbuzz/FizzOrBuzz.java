/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fizzbuzz;

/**
 *
 * @author 30128198
 */
public class FizzOrBuzz {
    
    public static void Run(int min, int max) {
        int j=0;
        int k=0;
        int l=0;
        
        for(int i = min; i<max+1; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.print("FizzBuzz");
                j++;
                k++;
                l++;
            }
            else if (i%3 == 0 && i%5 != 0) {
                System.out.print("Fizz");
                j++;
            }
            else if (i%3 != 0 && i%5 == 0) {
                System.out.print("Buzz");
                k++;
            }
            else {
                System.out.print(i);
            }
            
            if (i==max) {
                System.out.println("");
            }
            else if (i%20 == 0) {
                System.out.println(",");
            }
            else {
                System.out.print(", ");
            }
        }
        System.out.println("Fizzes = "+j+", Buzzes = "+k+", FizzBuzzes = "+l);
    }
    
    public static String RunString(int min, int max) {
        String msg = "";
        int j=0;
        int k=0;
        int l=0;
        
        for(int i = min; i<max+1; i++) {
            if (i%3 == 0 && i%5 == 0) {
                msg+="FizzBuzz";
                j++;
                k++;
                l++;
            }
            else if (i%3 == 0 && i%5 != 0) {
                msg+="Fizz";
                j++;
            }
            else if (i%3 != 0 && i%5 == 0) {
                msg+="Buzz";
                k++;
            }
            else {
                msg+=i;
            }
            
            if (i==max) {
                msg+="\n";
            }
            else if (i%20 == 0) {
                msg+=",\n";
            }
            else {
                msg+=", ";
            }
        }
        msg+="Fizzes = "+j+", Buzzes = "+k+", FizzBuzzes = "+l;
        return msg;
    }
}
