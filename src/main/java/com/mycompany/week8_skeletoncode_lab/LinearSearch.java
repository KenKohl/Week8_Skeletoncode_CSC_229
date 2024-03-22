/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab and Ken Kohlhof
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for(int i = 0; i < n;i++){
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
    }
    public static void main(String args[]){
        int arr[] = {4, 8, 12, 16, 20, 24, 28, 32};

        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter a number to search.");

        int x = scnr.nextInt();

        int searchResult = search(arr, x);

        if (searchResult == -1){
            System.out.println(x + " is not present in the array.");
        }
        else{
            System.out.println(x + " is located at index " + searchResult + ".");
        }

    }
    
}
