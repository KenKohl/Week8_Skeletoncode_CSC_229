/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab and Ken Kohlhof
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        boolean hasSwapped;
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

    public static void print(int array[], int size){
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]){
        int array[] = {18, 36, 9, 27, 81, 54, 45, 63, 72, 90};
        int size = array.length;
        bubbleSort(array,size);
        System.out.println("The sorted array is: ");
        print(array,size);
    }
    
}
