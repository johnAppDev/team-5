package testPkg;

public class InputSizeAddTest {

    public static void main(String[] args) {
        // Input sizes to test
        int[] sizes = {100, 1000, 3000, 10000, 50000, 100000, 300000, 500000, 1000000};
        int repetitions = 100; // run each test 100 times to average

        System.out.printf("%-18s %-12s %-15s%n", "ListType", "Size", "AvgAddTime(ns)");
        System.out.println("----------------------------------------------");

        for (int size : sizes) {
            // Test Java ArrayList
            long arrayListTotal = 0;
            for (int r = 0; r < repetitions; r++) {
            	java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
                long start = System.nanoTime();
                for (int i = 0; i < size; i++) arrayList.add(i);
                long end = System.nanoTime();
                arrayListTotal += (end - start);
            }
            long arrayListAvg = arrayListTotal / repetitions;
            
            // Test Custom ArrayList
            long customArrayListTotal = 0;
            for (int r = 0; r < repetitions; r++) {
            	arrayListPkg.ArrayList<Integer> customArrayList = new arrayListPkg.ArrayList<>();
                long start = System.nanoTime();
                for (int i = 0; i < size; i++) customArrayList.add(i);
                long end = System.nanoTime();
                customArrayListTotal += (end - start);
            }
            long customArrayListAvg = customArrayListTotal / repetitions;

            // Test Java LinkedList
            long linkedListTotal = 0;
            for (int r = 0; r < repetitions; r++) {
            	java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
                long start = System.nanoTime();
                for (int i = 0; i < size; i++) linkedList.add(i);
                long end = System.nanoTime();
                linkedListTotal += (end - start);
            }
            long linkedListAvg = linkedListTotal / repetitions;
            
            // Test Custom LinkedList
            long customLinkedListTotal = 0;
            for (int r = 0; r < repetitions; r++) {
            	linkedListPkg.LinkedList<Integer> customLinkedList = new linkedListPkg.LinkedList<>();
                long start = System.nanoTime();
                for (int i = 0; i < size; i++) customLinkedList.add(i);
                long end = System.nanoTime();
                customLinkedListTotal += (end - start);
            }
            long customLinkedListAvg = customLinkedListTotal / repetitions;

            // Print results
            System.out.printf("%-18s %-12d %-15d%n", "Java ArrayList", size, arrayListAvg);
            System.out.printf("%-18s %-12d %-15d%n", "Custom ArrayList", size, customArrayListAvg);
            System.out.printf("%-18s %-12d %-15d%n", "Java LinkedList", size, linkedListAvg);
            System.out.printf("%-18s %-12d %-15d%n", "Custom LinkedList", size, customLinkedListAvg);
        }
    }
}
