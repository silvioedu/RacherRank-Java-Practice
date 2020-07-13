package com.silvio.practice.strings.tagcontentextractor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{

    public static void main(String[] args){

        final Scanner s = new Scanner(System.in);
        final Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");

        Matcher matcher;

        int n = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= n; i++) {
            boolean matchFound = false;
            matcher = pattern.matcher(s.nextLine());

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }

            if (!matchFound) System.out.println("None");
        }
    }
}



