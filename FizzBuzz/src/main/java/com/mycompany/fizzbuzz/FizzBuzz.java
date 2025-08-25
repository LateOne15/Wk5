/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fizzbuzz;

/**
 *
 * @author 30128198
 */
public class FizzBuzz {

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        FizzOrBuzz.Run(min,max);
        System.out.println(FizzOrBuzz.RunString(min,max));
    }
}
