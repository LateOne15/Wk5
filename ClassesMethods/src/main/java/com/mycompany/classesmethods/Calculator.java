/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classesmethods;

/**
 *
 * @author 30128198
 */
public class Calculator {
    //fields
    private double tax = 0.05;
    public double tip = 0.15;
    public double originalPrice = 10;
    
    //default constructor
    public Calculator() {
        
    }
    
    //replace tip constructor
    public Calculator(double tip){
        this.tip = tip;
    }
    
    //method without price
    public double findTotal(){
        double total = originalPrice*(1+tax+tip);
        return total;
    }
    
    //method with price
    public double findTotal(double price){
        double total = price*(1+tax+tip);
        return total;
    }
    
    //experiment method, both price and tip as arguments
    public double findTotal(double price, double newTip){
        double total = price*(1+tax+newTip);
        return total;
    }

    public double getTax() { //getter made with alt+insert, remember that
        return tax;
    }
}

