/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;
import java.util.Scanner;

/**
 * Asymptotic analysis of linear search method
 *
 * The time complexity for the search method is O(n) since the worst case scenario is that the
 * method will have to iterate through all the elements.
 *
 * @author MoaathAlrajab and Ken Kohlhof
 */
public class LinearSearch {

    public static int search(int arr[], int x)
    {
        int n = arr.length; //Sets variable for arr length
        for(int i = 0; i < n;i++){ //Iterates n times in worst case scenario
            if(arr[i] == x) { //If found returns index
                return i;
            }
        }
        return -1; //If not found returns -1

        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
    }
    public static void main(String args[]){
        int arr[] = {4, 8, 12, 16, 20, 24, 28, 32}; //array for testing

        Scanner scnr = new Scanner(System.in); //Instantiates the scanner object
        System.out.println("Please enter a number to search."); //Prompts for user input

        int x = scnr.nextInt(); //Sets x to next int inputted by the user.

        int searchResult = search(arr, x); //Sets searchResults as the return value from method call search

        //If condition that returns message if the number was found in the array or not and if found what index.
        if (searchResult == -1){
            System.out.println(x + " is not present in the array.");
        }
        else{
            System.out.println(x + " is located at index " + searchResult + ".");
        }

    }
    
}
