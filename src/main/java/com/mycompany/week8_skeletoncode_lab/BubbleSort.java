/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 * Time complexity analysis for bubbleSort and print method.
 *
 * The bubbleSort method has a time complexity of O(n^2). This is because in the worst case scenario the
 * algorithm could make n-1 passes through the element while also comparing and swapping elements.
 *
 * The print method has a time complexity of O(n). This is because the function iterates through the entire
 * array once to print each of its elements.
 *
 * @author MoaathAlrajab and Ken Kohlhof
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        boolean hasSwapped; //boolean statement to keep track of if elements swapped
        for (outer = size - 1; outer > 0; outer--) { // counting down
            hasSwapped = false;
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if(a[inner] > a[inner + 1]){
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                    hasSwapped = true;
                }
                //ToDo 3: complete this algorithm, test it, provide its time complexity
            }
            if(hasSwapped == false){
                break;
            }
        }
    }

    //Print method to print array once sorted
    public static void print(int array[], int size){
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]){
        int array[] = {18, 36, 9, 27, 81, 54, 45, 63, 72, 90}; //Testing array
        int size = array.length; //Size variable set to the length of the array
        bubbleSort(array,size); //Method call to bubbleSort
        System.out.println("The sorted array is: "); //Message to user stating the sorted array is...
        print(array,size); //Call to print method
    }
    
}
