package testPkg;
import linkedListPkg.LinkedList;

import java.io.FileWriter;
import java.util.Scanner;

import arrayListPkg.ArrayList;

public class testSizeConstraints {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to test arraylist or Linked List? A for arrayList; L for linked list");
		String res = sc.nextLine();
		if(res.startsWith("A") || res.startsWith("a")) {
			ArrayListTest();
		}else if (res.startsWith("L") || res.startsWith("l")) {
			LinkedListTest();
		}
	}
	public static void LinkedListTest() {
		System.out.println("Testing Linked List Size Constraints");
		LinkedList<Integer> array = new LinkedList<Integer>();
		long count = 0;
		long startTime = System.nanoTime();
		long prevTime = startTime;
		try {
			FileWriter fw = new FileWriter("linkedTest.txt", false);
			while(true) {
				fw.write("Adding " + count + " at a rate of " + 2.0/(System.nanoTime() - prevTime) + " per nanosecond\n");
				System.out.println("Adding " + count + " at a rate of " + 2.0/(System.nanoTime() - prevTime) + " per nanosecond");
				array.add((int)count);
				count++;
			}
		}catch(Exception e) {
			long totalTime = System.nanoTime()- startTime;
			System.out.println("Count :"+ count + "in " + totalTime);
		}
	}
	public static void ArrayListTest() {
		System.out.println("Testing Array List Size Constraints");
		ArrayList<Integer> linked = new ArrayList<Integer>();
		long count = 0;
		long startTime = System.nanoTime();
		long prevTime = startTime;
		try {
			FileWriter fw = new FileWriter("arrayList.txt", false);
			while(true) {
				fw.write("Adding " + count + " at a rate of " + 2.0/(System.nanoTime() - prevTime) + " per nanosecond\n");
				System.out.println("Adding " + count + " at a rate of " + 2.0/(System.nanoTime() - prevTime) + " per nanosecond");
				linked.add((int)count);
				count++;
			}
		}catch(Exception e) {
			e.printStackTrace();
			long totalTime = System.nanoTime()- startTime;
			System.out.println("Count :"+ count + "in " + totalTime);
		}
	}
}
