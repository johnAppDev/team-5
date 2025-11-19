package testPkg;

public class ArrayListPerformanceTest {

    public static void main(String[] args) {
        int n = 100; // number of elements; adjust as needed
        System.out.println("Testing add/remove performance with " + n + " elements...\n");
        long start;
        long end;

        // ---------------------------------------------------------------------
        // Java's built-in ArrayList
        // ---------------------------------------------------------------------
        java.util.ArrayList<Integer> javaList = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) javaList.add(i);
        System.out.println("Java's built-in ArrayList");

        // --- Remove operations ---
        start = System.nanoTime();
        javaList.remove(javaList.size() - 1);
        end = System.nanoTime();
        System.out.println("java.util.ArrayList remove from end:          " + (end - start) + " ns");

        javaList.clear();
        for (int i = 0; i < n; i++) javaList.add(i);
        start = System.nanoTime();
        javaList.remove(n / 2);
        end = System.nanoTime();
        System.out.println("java.util.ArrayList remove from middle:       " + (end - start) + " ns");

        javaList.clear();
        for (int i = 0; i < n; i++) javaList.add(i);
        start = System.nanoTime();
        javaList.remove(0);
        end = System.nanoTime();
        System.out.println("java.util.ArrayList remove from beginning:    " + (end - start) + " ns");

        // --- Add operations ---
        javaList.clear();
        for (int i = 0; i < n; i++) javaList.add(i);
        start = System.nanoTime();
        javaList.add(javaList.size(), 999);
        end = System.nanoTime();
        System.out.println("java.util.ArrayList add to end:               " + (end - start) + " ns");

        javaList.clear();
        for (int i = 0; i < n; i++) javaList.add(i);
        start = System.nanoTime();
        javaList.add(n / 2, 999);
        end = System.nanoTime();
        System.out.println("java.util.ArrayList add to middle:            " + (end - start) + " ns");

        javaList.clear();
        for (int i = 0; i < n; i++) javaList.add(i);
        start = System.nanoTime();
        javaList.add(0, 999);
        end = System.nanoTime();
        System.out.println("java.util.ArrayList add to beginning:         " + (end - start) + " ns\n");


        // ---------------------------------------------------------------------
        // Custom ArrayList
        // ---------------------------------------------------------------------
        arrayListPkg.ArrayList<Integer> customJavaList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customJavaList.add(i);
        System.out.println("Custom ArrayList");

        // --- Remove operations ---
        start = System.nanoTime();
        customJavaList.remove(customJavaList.size() - 1);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList remove from end:       " + (end - start) + " ns");

        customJavaList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customJavaList.add(i);
        start = System.nanoTime();
        customJavaList.remove(n / 2);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList remove from middle:    " + (end - start) + " ns");

        customJavaList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customJavaList.add(i);
        start = System.nanoTime();
        customJavaList.remove(0);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList remove from beginning: " + (end - start) + " ns");

        // --- Add operations ---
        customJavaList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customJavaList.add(i);
        start = System.nanoTime();
        customJavaList.add(customJavaList.size(), 999);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList add to end:            " + (end - start) + " ns");

        customJavaList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customJavaList.add(i);
        start = System.nanoTime();
        customJavaList.add(n / 2, 999);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList add to middle:         " + (end - start) + " ns");

        customJavaList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customJavaList.add(i);
        start = System.nanoTime();
        customJavaList.add(0, 999);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList add to beginning:      " + (end - start) + " ns");
        
        // ---------------------------------------------------------------------
        // Java's built-in LinkedList
        // ---------------------------------------------------------------------
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        for (int i = 0; i < n; i++) linkedList.add(i);
        System.out.println("\nJava's built-in LinkedList");

        // --- Remove operations ---
        start = System.nanoTime();
        linkedList.remove(linkedList.size() - 1);
        end = System.nanoTime();
        System.out.println("java.util.LinkedList remove from end:          " + (end - start) + " ns");

        linkedList.clear();
        for (int i = 0; i < n; i++) linkedList.add(i);
        start = System.nanoTime();
        linkedList.remove(n / 2);
        end = System.nanoTime();
        System.out.println("java.util.LinkedList remove from middle:       " + (end - start) + " ns");

        linkedList.clear();
        for (int i = 0; i < n; i++) linkedList.add(i);
        start = System.nanoTime();
        linkedList.remove(0);
        end = System.nanoTime();
        System.out.println("java.util.LinkedList remove from beginning:    " + (end - start) + " ns");

        // --- Add operations ---
        linkedList.clear();
        for (int i = 0; i < n; i++) linkedList.add(i);
        start = System.nanoTime();
        linkedList.add(linkedList.size(), 999);
        end = System.nanoTime();
        System.out.println("java.util.LinkedList add to end:               " + (end - start) + " ns");

        linkedList.clear();
        for (int i = 0; i < n; i++) linkedList.add(i);
        start = System.nanoTime();
        linkedList.add(n / 2, 999);
        end = System.nanoTime();
        System.out.println("java.util.LinkedList add to middle:            " + (end - start) + " ns");

        linkedList.clear();
        for (int i = 0; i < n; i++) linkedList.add(i);
        start = System.nanoTime();
        linkedList.add(0, 999);
        end = System.nanoTime();
        System.out.println("java.util.LinkedList add to beginning:         " + (end - start) + " ns\n");


        // ---------------------------------------------------------------------
        // Custom LinkedList
        // ---------------------------------------------------------------------
        linkedListPkg.LinkedList<Integer> customLinkedList = new linkedListPkg.LinkedList<Integer>();
        for (int i = 0; i < n; i++) customLinkedList.add(i);
        System.out.println("Custom LinkedList");

        // --- Remove operations ---
        start = System.nanoTime();
        customLinkedList.remove(customLinkedList.size() - 1);
        end = System.nanoTime();
        System.out.println("linkedListPkg.LinkedList remove from end:       " + (end - start) + " ns");

        customLinkedList = new linkedListPkg.LinkedList<Integer>();
        for (int i = 0; i < n; i++) customLinkedList.add(i);
        start = System.nanoTime();
        customLinkedList.remove(n / 2);
        end = System.nanoTime();
        System.out.println("linkedListPkg.LinkedList remove from middle:    " + (end - start) + " ns");

        customLinkedList = new linkedListPkg.LinkedList<Integer>();
        for (int i = 0; i < n; i++) customLinkedList.add(i);
        start = System.nanoTime();
        customLinkedList.remove(0);
        end = System.nanoTime();
        System.out.println("linkedListPkg.LinkedList remove from beginning: " + (end - start) + " ns");

        // --- Add operations ---
        customLinkedList = new linkedListPkg.LinkedList<Integer>();
        for (int i = 0; i < n; i++) customLinkedList.add(i);
        start = System.nanoTime();
        customLinkedList.add(customLinkedList.size(), 999);
        end = System.nanoTime();
        System.out.println("linkedListPkg.LinkedList add to end:            " + (end - start) + " ns");

        customLinkedList = new linkedListPkg.LinkedList<Integer>();
        for (int i = 0; i < n; i++) customLinkedList.add(i);
        start = System.nanoTime();
        customLinkedList.add(n / 2, 999);
        end = System.nanoTime();
        System.out.println("linkedListPkg.LinkedList add to middle:         " + (end - start) + " ns");

        customLinkedList = new linkedListPkg.LinkedList<Integer>();
        for (int i = 0; i < n; i++) customLinkedList.add(i);
        start = System.nanoTime();
        customLinkedList.add(0, 999);
        end = System.nanoTime();
        System.out.println("linkedListPkg.LinkedList add to beginning:      " + (end - start) + " ns");
    }
}
