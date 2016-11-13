package com.example.andresarango.algorithmnovthirteenth;

/**
 * Created by andresarango on 11/13/16.
 */

public class BinarySearch {
    public int binarySearch(int[] array, int target) {
        int min = 0;
        int max = array.length - 1;
        if((target < array[min]) || (target > array[max])) {
            return -1;
        }

        return search(array, target, max, min);
    };

    private int search(int[] array, int target, int max, int min){
        int guess = (max - min) / 2;

        if(array[guess] == target){
            return guess;
        }else if(guess == 0){
           return -1;
        } else if(array[guess] > target){
            max = guess;
        }else{
            min = guess;
        }
        return search(array,target,max,min);
    }
}
