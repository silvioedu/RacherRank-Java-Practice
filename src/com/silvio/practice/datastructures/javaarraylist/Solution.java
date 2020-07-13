package com.silvio.practice.datastructures.javaarraylist;

import java.util.*;

public class Solution {

    final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        receiveAndProcessQuery(receiveArrays());
    }

    public static ArrayList[] receiveArrays() {
        final int n = in.nextInt();
        int d;

        ArrayList[] set = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            d = in.nextInt();

            set[i] = new ArrayList();
            for (int j = 0; j < d; j++) {
                set[i].add(in.nextInt());
            }
        }
        return set;
    }

    private static void receiveAndProcessQuery(ArrayList[] set) {
        final int q = in.nextInt();
        int x, y;

        for (int i = 0; i < q; i++) {
            x = in.nextInt();
            y = in.nextInt();
            try {
                System.out.println(set[--x].get(--y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }


}