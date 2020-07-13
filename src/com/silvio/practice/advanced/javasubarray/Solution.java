package com.silvio.practice.advanced.javasubarray;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++)  a[i] = s.nextInt();

        int negative = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int sum = 0;
                for(int k = i; k <= j; k++) sum = sum + a[k];
                if(sum < 0) negative++;
            }
        }

        System.out.println(negative);
        s.close();
    }
}