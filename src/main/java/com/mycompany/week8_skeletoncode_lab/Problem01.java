/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;
import java.util.Scanner;
import java.lang.Math;
/**
 * Time And Space Analysis of getSumOfPrimes Method
 *
 * The time complexity of the method is O(n^2) because there are two nested loops.
 * The space complexity of the method is O(1) because only a constant amount of memory is used
 * to store the variable sum.
 *
 * @author MoaathAlrajab and Ken Kohlhof
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
        int sum = 0; // Sum variable initialized
        for(int i = 2; i <= n; i++){ //Outer loop that checks numbers from 2 to n
            for(int j = 2; j <= i; j++){ //inner loop that tests if number is divisible by any number other than itself.
                if(j==i){ //if j and i are the same number add the number to sum.
                    sum+=i;
                    break;
                }
                else if(i % j==0) { //if i divided by j gives a remainder of 0 break out of the loop since the number is not prime.
                    break;
                }
            }
        }
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time
        return sum; //Return sum
    }

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in); //Instantiate the scanner object

        System.out.println("Please enter an upper bound."); //Asks for user input for an upper bound of numbers to check

        int upperBound= scnr.nextInt(); //Set upperBound variable equal to the input.

        Long sum = getSumOfPrimes(upperBound); //Sets sum variable to the return value of method call getSumOfPrimes

        System.out.println(sum); //Prints sum
    }
    
}
