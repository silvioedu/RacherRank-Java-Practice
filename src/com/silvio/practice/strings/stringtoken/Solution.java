package com.silvio.practice.strings.stringtoken;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        if (s.length() < 400000){
            if (s.length() == 0) {
                System.out.println(s.length());
                return;
            }

            String regex = "[A-Za-z !,?._'@]+";
            if(!s.matches(regex)) throw new IllegalArgumentException();

            String regex2 = "[ !,?._'@]+";
            String[] split = s.split(regex2);

            System.out.println(split.length);
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
            }
        }

        scan.close();
    }
}
