package testPkg;

import java.util.List;

public class InputSizeAddTest_AllTypes {
	
    public static void main(String[] args) {
        int repetitions = 100; // run each test 1000 times to average results

        System.out.printf("%-18s %-10s %-15s%n", "ListType", "DataType", "AvgAddTime(ns)");
        System.out.println("---------------------------------------------------------------");

        // run tests for different data types
        testDataType("Integer", repetitions);
        testDataType("Double", repetitions);
        testDataType("String", repetitions);
        testDataType("Character", repetitions);
    }

    // runs tests for one data type (e.g., Integer)
    
    private static void testDataType(String typeName, int repetitions) {
    	long arrayListAvg = 0;
        long customArrayListAvg = 0;
        long linkedListAvg = 0;
        long customLinkedListAvg = 0;

        for (int r = 0; r < repetitions; r++) {
        	// test Java ArrayList
            arrayListAvg += runTest(typeName, new java.util.ArrayList<>());
            // test Custom ArrayList
            customArrayListAvg += runTest(typeName, new arrayListPkg.ArrayList<>());
            // test Java LinkedList
            linkedListAvg += runTest(typeName, new java.util.LinkedList<>());
            // test Custom LinkedList
            customLinkedListAvg += runTest(typeName, new linkedListPkg.LinkedList<>());
        }

        arrayListAvg /= repetitions;
        customArrayListAvg /= repetitions;
        linkedListAvg /= repetitions;
        customLinkedListAvg /= repetitions;

        System.out.printf("%-18s %-10s %-15d%n", "Java ArrayList", typeName, arrayListAvg);
        System.out.printf("%-18s %-10s %-15d%n", "Custom ArrayList", typeName, customArrayListAvg);
        System.out.printf("%-18s %-10s %-15d%n", "Java LinkedList", typeName, linkedListAvg);
        System.out.printf("%-18s %-10s %-15d%n", "Custom LinkedList", typeName, customLinkedListAvg);
    }

    // runs a single timing test for one list and data type
    
    private static long runTest(String typeName, arrayListPkg.ArrayList<Object> list) {
        long start = System.nanoTime();

        switch (typeName) {
            case "Integer":
                list.add(0);
                break;
            case "Double":
                list.add(0.0);
                break;
            case "String":
                list.add("zero");
                break;
            case "Character":
                list.add('o');
                break;
        }

        long end = System.nanoTime();
        return end - start;
    }
    
    private static long runTest(String typeName, linkedListPkg.LinkedList<Object> list) {
        long start = System.nanoTime();

        switch (typeName) {
            case "Integer":
                list.add(0);
                break;
            case "Double":
                list.add(0.0);
                break;
            case "String":
                list.add("zero");
                break;
            case "Character":
                list.add('o');
                break;
        }

        long end = System.nanoTime();
        return end - start;
    }
    
    private static long runTest(String typeName, List<Object> list) {
        long start = System.nanoTime();

        switch (typeName) {
            case "Integer":
                list.add(0);
                break;
            case "Double":
                list.add(0.0);
                break;
            case "String":
                list.add("zero");
                break;
            case "Character":
                list.add('o');
                break;
        }

        long end = System.nanoTime();
        return end - start;
    }
}
