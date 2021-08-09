package com.company;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr2){
        arr2[0]=0;
    }
}
