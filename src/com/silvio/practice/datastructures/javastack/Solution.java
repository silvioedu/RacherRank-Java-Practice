package com.silvio.practice.datastructures.javastack;

import java.util.*;

class Solution{

    private static final Scanner in = new Scanner(System.in);

    private static boolean isbalanced(String string){
        while(string.length() != (string = string.replaceAll("\\(\\)|\\[]|\\{}", "")).length());
        return (string.isEmpty());
    }

    public static void main(String[] args){
        Stack<String> stack = new Stack<>();

        while (in.hasNext()) {
            stack.push(in.next());
            System.out.println(isbalanced(stack.get(0)));
            stack.pop();
        }
    }
}



