/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumbers;
import java.util.Random;

/**
 *
 * @author 30128198
 */
public class RandomNumbers {

    public static void main(String[] args) {
        Random randNum = new Random();
        int randInt;
        for(int i = 0;i<20;i++) {
            randInt = randNum.nextInt(1,21);
            System.out.print(randInt);
            if (i<19) {
                System.out.print(", ");
            }
            else {
                System.out.println(".");
            }
        }
    }
}
