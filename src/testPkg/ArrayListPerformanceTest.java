package testPkg;

public class ArrayListPerformanceTest {

    private static final int N = 10;           // number of elements
    private static final int ITERATIONS = 1000; // how many times each test runs

    public static void main(String[] args) {
        System.out.println("Testing performance with " + N + " elements");
        System.out.println("Averaged over " + ITERATIONS + " iterations\n");

        testJavaArrayList();
        testCustomArrayList();
        testJavaLinkedList();
        testCustomLinkedList();
    }

    // ---------------------------- Helpers ----------------------------
    private static void fillList(java.util.List<Integer> list, int n) {
        list.clear();
        for (int i = 0; i < n; i++) list.add(i);
    }

    private static arrayListPkg.ArrayList<Integer> fillCustomArray(arrayListPkg.ArrayList<Integer> list, int n) {
        list = new arrayListPkg.ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);
        return list;
    }

    private static linkedListPkg.LinkedList<Integer> fillCustomLinked(linkedListPkg.LinkedList<Integer> list, int n) {
        list = new linkedListPkg.LinkedList<>();
        for (int i = 0; i < n; i++) list.add(i);
        return list;
    }

    private static void printAvg(String label, long total) {
        System.out.printf("%-45s %10d ns%n", label, total / ITERATIONS);
    }

    // ---------------------------- Java ArrayList ----------------------------
    private static void testJavaArrayList() {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        long start, end, total;

        // Remove end
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.remove(list.size() - 1);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("ArrayList remove end:", total);

        // Remove middle
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.remove(N / 2);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("ArrayList remove middle:", total);

        // Remove beginning
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.remove(0);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("ArrayList remove beginning:", total);

        // Add end
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.add(list.size(), 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("ArrayList add end:", total);

        // Add middle
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.add(N / 2, 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("ArrayList add middle:", total);

        // Add beginning
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.add(0, 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("ArrayList add beginning:", total);
    }

    // ---------------------------- Custom ArrayList ----------------------------
    private static void testCustomArrayList() {
        arrayListPkg.ArrayList<Integer> list = new arrayListPkg.ArrayList<>();
        long start, end, total;

        // Remove end
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
        	list = fillCustomArray(list, N);
            start = System.nanoTime();
            list.remove(list.size() - 1);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom ArrayList remove end:", total);

        // Remove middle
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
        	list = fillCustomArray(list, N);
            start = System.nanoTime();
            list.remove(N / 2);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom ArrayList remove middle:", total);

        // Remove beginning
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
        	list = fillCustomArray(list, N);
            start = System.nanoTime();
            list.remove(0);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom ArrayList remove beginning:", total);

        // Add end
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
        	list = fillCustomArray(list, N);
            start = System.nanoTime();
            list.add(list.size(), 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom ArrayList add end:", total);

        // Add middle
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            list = fillCustomArray(list, N);
            start = System.nanoTime();
            list.add(N / 2, 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom ArrayList add middle:", total);

        // Add beginning
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            list = fillCustomArray(list, N);
            start = System.nanoTime();
            list.add(0, 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom ArrayList add beginning:", total);
    }

    // ---------------------------- Java LinkedList ----------------------------
    private static void testJavaLinkedList() {
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        long start, end, total;

        // Remove end
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.remove(list.size() - 1);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("LinkedList remove end:", total);

        // Remove middle
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.remove(N / 2);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("LinkedList remove middle:", total);

        // Remove beginning
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.remove(0);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("LinkedList remove beginning:", total);

        // Add end
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.add(list.size(), 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("LinkedList add end:", total);

        // Add middle
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.add(N / 2, 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("LinkedList add middle:", total);

        // Add beginning
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            fillList(list, N);
            start = System.nanoTime();
            list.add(0, 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("LinkedList add beginning:", total);
    }

    // ---------------------------- Custom LinkedList ----------------------------
    private static void testCustomLinkedList() {
        linkedListPkg.LinkedList<Integer> list = new linkedListPkg.LinkedList<>();
        long start, end, total;

        // Remove end
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            list = fillCustomLinked(list, N);
            start = System.nanoTime();
            list.remove(list.size() - 1);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom LinkedList remove end:", total);

        // Remove middle
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            list = fillCustomLinked(list, N);
            start = System.nanoTime();
            list.remove(N / 2);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom LinkedList remove middle:", total);

        // Remove beginning
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            list = fillCustomLinked(list, N);
            start = System.nanoTime();
            list.remove(0);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom LinkedList remove beginning:", total);

        // Add end
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            list = fillCustomLinked(list, N);
            start = System.nanoTime();
            list.add(list.size(), 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom LinkedList add end:", total);

        // Add middle
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            list = fillCustomLinked(list, N);
            start = System.nanoTime();
            list.add(N / 2, 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom LinkedList add middle:", total);

        // Add beginning
        total = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            list = fillCustomLinked(list, N);
            start = System.nanoTime();
            list.add(0, 999);
            end = System.nanoTime();
            total += (end - start);
        }
        printAvg("Custom LinkedList add beginning:", total);
    }
}
