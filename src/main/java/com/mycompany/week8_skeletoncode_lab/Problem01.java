/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author MoaathAlrajab and Ken Kohlhof
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
        int sum = 0;
        for(int i = 2; i <= n; i++){
            for(int j = 2; j <= i; j++){
                if(j==i){
                    sum+=i;
                    break;
                }
                else if(i % j==0) {
                    break;
                }
            }
        }
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time
        return sum;
    }

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter an upper bound.");

        int upperBound= scnr.nextInt();

        Long sum = getSumOfPrimes(upperBound);

        System.out.println(sum);
    }
    
}
