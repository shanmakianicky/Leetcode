package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SJB on 7/7/17.
 */
// Time Limit Exceeded
// Arrays.sort();
public class Array_Partition_I {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String array = s.nextLine();
        String b = array.substring(1,array.length()-1);
        String[] a = b.split(",");
        int[] arrays = new int[a.length];
        for (int i = 0; i < a.length; i++){
            arrays[i] = Integer.parseInt(a[i]);
        }

        System.out.println(arrayPartition(arrays));
    }

    public static int arrayPartition(int[] integers){
        int n = integers.length;
        /*
        for (int i = 1; i < n; i++){
            for (int j = i-1; j >= 0; j--){
                if (integers[j+1] < integers[j]){
                    int temp = integers[j];
                    integers[j] = integers[j+1];
                    integers[j+1] = temp;
                }
            }
        }
        */
        Arrays.sort(integers);
        int sum = 0;
        for (int i = 0; i < n; i+=2){
            sum = sum + integers[i];
        }
        return sum;
    }
}

