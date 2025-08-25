/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lottery;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 30128198
 */
public class Lottery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randRange = 10;
        int userNum, winningNum;
        
        System.out.print("Enter a number between 1 and " + randRange + ": ");
        userNum = sc.nextInt();
        winningNum = rand.nextInt(randRange)+1;
//        winningNum = rand.nextInt(1,randRange+1);
        
        System.out.println("Your number: " + userNum);
        System.out.println("Winning number: " + winningNum);
        if (userNum == winningNum) {
            System.out.println("Ding ding ding!");
        }
        
        sc.close();
    }
}
