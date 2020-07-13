package com.silvio.practice.datastructures.javamap;

//Complete this code or write your own from scratch
import java.util.*;

class Solution{

    final static Scanner in = new Scanner(System.in);

    public static void main(String[] arg) {
        int n = in.nextInt();
        in.nextLine();

        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(in.nextLine(),in.nextInt());
            in.nextLine();
        }

        while(in.hasNext()) {
            String s = in.nextLine();
            if (map.containsKey(s))  System.out.println(s+"="+map.get(s));
            else  System.out.println("Not found");
        }
    }
}



