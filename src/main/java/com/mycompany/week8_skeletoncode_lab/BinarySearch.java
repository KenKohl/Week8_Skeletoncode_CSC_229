/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;
import java.util.Scanner;

/**
 * Time and Space Analysis for runBinarySearchIteratively method
 *
 * In this method the time complexity is O(log n). This is because in each iteration the size we end up
 * searching is reduced by half.
 *
 * The Space complexity in this method is O(1) since algorithm uses a constant amount of space to keep track of
 * things like low, high, and mid.
 *
 * @author MoaathAlrajab and Ken Kohlhof
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; //Testing array
        Scanner scnr = new Scanner(System.in); //Instantiate Scanner object

        System.out.println("Please enter a number to search."); //Prompts user for input of number to search
        int key = scnr.nextInt(); //Sets key variable as next integer input from user

        //Sets result variable as return value from method call
        int result = runBinarySearchIteratively(arr, key, 0, arr.length-1);

        if(result== Integer.MAX_VALUE){ //If number is not found in array prints message letting user know
            System.out.println("The number " + key + " is not in the array.");
        }
        else{ //If key is found prints message letting user know the number was found at which index.
            System.out.println("The number " + key + " is at index " + result + ".");
        }
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 

}
