package javaHW6;

import java.util.Arrays;

public class SortArrayAsc {
    //4. Check if an array is sorted in ascending order.

    public static void main(String[] args) {

        int [] arr={20,55,3,70,90,2,69};

        Arrays.sort(arr);

        System.out.println("After sorted in Asc order "+Arrays.toString(arr));
    }
}
