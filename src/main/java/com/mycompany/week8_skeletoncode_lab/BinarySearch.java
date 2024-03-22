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
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter a number to search.");
        int key = scnr.nextInt();

        int result = runBinarySearchIteratively(arr, key, 0, arr.length);

        System.out.println(result);
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 

}
