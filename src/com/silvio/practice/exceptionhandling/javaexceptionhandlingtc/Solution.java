package com.silvio.practice.exceptionhandling.javaexceptionhandlingtc;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y == 0) throw  new ArithmeticException("/ by zero");
            System.out.println(x/y);
        } catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        } catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}