/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classesmethods;

/**
 *
 * @author 30128198
 */
public class ClassesMethods {

    public static void main(String[] args) {
        int person1 = 15;
        double tip2 = 0.3;
        Calculator calc1 = new Calculator();   
        Calculator calc2 = new Calculator(tip2);
        Calculator calc3 = new StaffCalculator();
        
        System.out.println("Tax: "+calc1.getTax()); //demonstrates getter for private
        
        System.out.println("Tip1: "+calc1.tip);
        System.out.println("Total1: "+calc1.findTotal(person1));
        
        System.out.println("Tip2: "+calc2.tip);
        System.out.println("Total2: "+calc2.findTotal());
        
        System.out.println("Tip3: "+calc3.tip);
        System.out.println("Total3: "+calc3.findTotal(calc3.originalPrice,calc3.tip));
        
        double total=calc1.findTotal(person1)+calc2.findTotal()+calc3.findTotal();
        System.out.println("Total of all tables: "+total);
    }
}
