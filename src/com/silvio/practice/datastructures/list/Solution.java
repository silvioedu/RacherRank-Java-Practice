package com.silvio.practice.datastructures.list;

import java.util.Scanner;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            list.add(value);
        }
        
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scan.next();
            int index = scan.nextInt();
            if (action.equals("Insert")) {
                int value = scan.nextInt();
                list.add(index, value);
            } else { // "Delete"
                list.remove(index);
            }
        }
        scan.close();
        
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
