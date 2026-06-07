package org.example;

import jdk.jfr.Frequency;

import java.io.*;
import java.util.*;

public class Main {
        static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
            System.out.println("Frequency of each element:");
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
}
