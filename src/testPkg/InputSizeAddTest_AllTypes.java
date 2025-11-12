package testPkg;

import java.util.*;

public class InputSizeAddTest_AllTypes {
	
    public static void main(String[] args) {
        // input sizes to test
        int[] sizes = {100, 1000, 3000, 10000, 50000, 100000, 300000, 500000, 1000000};
        int repetitions = 5; 
        // run each test 5 times to average results

        System.out.printf("%-12s %-10s %-12s %-15s%n", "ListType", "DataType", "Size", "AvgAddTime(ns)");
        System.out.println("---------------------------------------------------------------");

        // run tests for different data types
        testDataType("Integer", sizes, repetitions);
        testDataType("Double", sizes, repetitions);
        testDataType("String", sizes, repetitions);
        testDataType("Character", sizes, repetitions);
    }

    // runs tests for one data type (e.g., Integer)
    
    private static void testDataType(String typeName, int[] sizes, int repetitions) {
        for (int size : sizes) {
            long arrayListAvg = 0;
            long linkedListAvg = 0;

            for (int r = 0; r < repetitions; r++) {
                // test ArrayList
                arrayListAvg += runTest(typeName, new ArrayList<>(), size);
                // test LinkedList
                linkedListAvg += runTest(typeName, new LinkedList<>(), size);
            }

            arrayListAvg /= repetitions;
            linkedListAvg /= repetitions;

            System.out.printf("%-12s %-10s %-12d %-15d%n", "ArrayList", typeName, size, arrayListAvg);
            System.out.printf("%-12s %-10s %-12d %-15d%n", "LinkedList", typeName, size, linkedListAvg);
        }
    }

    // runs a single timing test for one list and data type
    
    private static long runTest(String typeName, List<Object> list, int size) {
        long start = System.nanoTime();

        switch (typeName) {
            case "Integer":
                for (int i = 0; i < size; i++) list.add(i);
                break;
            case "Double":
                for (int i = 0; i < size; i++) list.add((double) i);
                break;
            case "String":
                for (int i = 0; i < size; i++) list.add("Item" + i);
                break;
            case "Character":
                for (int i = 0; i < size; i++) list.add((char) ('A' + (i % 26)));
                break;
        }

        long end = System.nanoTime();
        return end - start;
    }
}
