package testPkg;

public class ArrayListPerformanceTest {

    public static void main(String[] args) {
        int n = 100; // number of elements; adjust as needed
        System.out.println("Testing add/remove performance with " + n + " elements...\n");

        // ---------------------------------------------------------------------
        // Java's built-in ArrayList
        // ---------------------------------------------------------------------
        java.util.ArrayList<Integer> javaList = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) javaList.add(i);

        long start;
        long end;

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
        arrayListPkg.ArrayList<Integer> customList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customList.add(i);

        // --- Remove operations ---
        start = System.nanoTime();
        customList.remove(customList.size() - 1);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList remove from end:       " + (end - start) + " ns");

        customList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customList.add(i);
        start = System.nanoTime();
        customList.remove(n / 2);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList remove from middle:    " + (end - start) + " ns");

        customList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customList.add(i);
        start = System.nanoTime();
        customList.remove(0);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList remove from beginning: " + (end - start) + " ns");

        // --- Add operations ---
        customList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customList.add(i);
        start = System.nanoTime();
        customList.add(customList.size(), 999);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList add to end:            " + (end - start) + " ns");

        customList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customList.add(i);
        start = System.nanoTime();
        customList.add(n / 2, 999);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList add to middle:         " + (end - start) + " ns");

        customList = new arrayListPkg.ArrayList<Integer>();
        for (int i = 0; i < n; i++) customList.add(i);
        start = System.nanoTime();
        customList.add(0, 999);
        end = System.nanoTime();
        System.out.println("arrayListPkg.ArrayList add to beginning:      " + (end - start) + " ns");
    }
}
