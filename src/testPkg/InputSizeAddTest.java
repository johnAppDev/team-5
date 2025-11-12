package testPkg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InputSizeAddTest {

    public static void main(String[] args) {
        // Input sizes to test
        int[] sizes = {100, 1000, 3000, 10000, 50000, 100000, 300000, 500000, 1000000};
        int repetitions = 5; // run each test 5 times to average

        System.out.println("Java implementations");
        System.out.printf("%-12s %-12s %-15s%n", "ListType", "Size", "AvgAddTime(ns)");
        System.out.println("------------------------------------------");

        for (int size : sizes) {
            // Test ArrayList
            long arrayListTotal = 0;
            for (int r = 0; r < repetitions; r++) {
                List<Integer> arrayList = new ArrayList<>();
                long start = System.nanoTime();
                for (int i = 0; i < size; i++) arrayList.add(i);
                long end = System.nanoTime();
                arrayListTotal += (end - start);
            }
            long arrayListAvg = arrayListTotal / repetitions;

            // Test LinkedList
            long linkedListTotal = 0;
            for (int r = 0; r < repetitions; r++) {
                List<Integer> linkedList = new LinkedList<>();
                long start = System.nanoTime();
                for (int i = 0; i < size; i++) linkedList.add(i);
                long end = System.nanoTime();
                linkedListTotal += (end - start);
            }
            long linkedListAvg = linkedListTotal / repetitions;

            // Print results
            System.out.printf("%-12s %-12d %-15d%n", "ArrayList", size, arrayListAvg);
            System.out.printf("%-12s %-12d %-15d%n", "LinkedList", size, linkedListAvg);
            
            
            arrayListPkg.ArrayList<Integer> costumList = new arrayListPkg.ArrayList<Integer>();
            System.out.println(" Costum implementations");
            System.out.printf("%-12s %-12s %-15s%n", "ListType", "Size", "AvgAddTime(ns)");
            System.out.println("------------------------------------------");

            for (int size1 : sizes) {
                // Test ArrayList
                long arrayListTotal1 = 0;
                for (int r = 0; r < repetitions; r++) {
                    List<Integer> arrayList = new ArrayList<>();
                    long start = System.nanoTime();
                    for (int i = 0; i < size1; i++) arrayList.add(i);
                    long end = System.nanoTime();
                    arrayListTotal1 += (end - start);
                }
                long arrayListAvg1 = arrayListTotal1 / repetitions;

                // Test LinkedList
                long linkedListTotal1 = 0;
                for (int r = 0; r < repetitions; r++) {
                    List<Integer> linkedList = new LinkedList<>();
                    long start = System.nanoTime();
                    for (int i = 0; i < size1; i++) linkedList.add(i);
                    long end = System.nanoTime();
                    linkedListTotal1 += (end - start);
                }
                long linkedListAvg1 = linkedListTotal1 / repetitions;

                // Print results
                System.out.printf("%-12s %-12d %-15d%n", "ArrayList", size1, arrayListAvg1);
                System.out.printf("%-12s %-12d %-15d%n", "LinkedList", size1, linkedListAvg1);
        }
        
    }
    }
}
