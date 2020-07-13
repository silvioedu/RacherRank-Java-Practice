package com.silvio.practice.bignumber.javabigdecimal;

import java.math.BigDecimal;
import java.util.*;

class Solution{
    public static void main(String []args){
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n+2];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, (o1, o2) -> {
            if (o1 == null | o2 == null) return 0;

            BigDecimal bgo1 = new BigDecimal(o1);
            BigDecimal bgo2 = new BigDecimal(o2);
            return bgo2.compareTo(bgo1);
        });

        //Output
        for(int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }
    }
}