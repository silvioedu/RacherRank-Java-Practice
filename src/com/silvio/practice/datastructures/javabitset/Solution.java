package com.silvio.practice.datastructures.javabitset;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Solution {

    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int size = in.nextInt();

        BitSet[] bitSets = new BitSet[]{new BitSet(size), new BitSet(size)};

        Map<String, BiConsumer<Integer,Integer>> ops = new HashMap<>();
        ops.put("AND", (index1, index2) -> bitSets[index1-1].and(bitSets[index2-1]));
        ops.put("OR", (index1, index2) -> bitSets[index1-1].or(bitSets[index2-1]));
        ops.put("XOR", (index1, index2) -> bitSets[index1-1].xor(bitSets[index2-1]));
        ops.put("SET", (index1, index2) -> bitSets[index1-1].set(index2));
        ops.put("FLIP", (index1, index2) -> bitSets[index1-1].flip(index2));

        int nOperations = in.nextInt();
        for (int i = 0; i < nOperations; i++){
            ops.get(in.next()).accept(in.nextInt(), in.nextInt());
            System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
        }
    }
}