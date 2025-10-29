package testPkg;

import linkedListPkg.LinkedList; 
import arrayListPkg.ArrayList;

public class TestLists {
	
	public static void main(String[] args) {
		
		System.out.println("=== Testing ArrayList ===");
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.printList(); // [10, 20, 30]
		System.out.println("Removed: " + arrList.remove(1)); // removes 20
		arrList.printList(); // [10, 30]
		System.out.println("Size: " + arrList.size()); // 2

		System.out.println("\n=== Testing LinkedList ===");
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("Hello");
		linkList.add("World");
		linkList.add("!");
		linkList.printList(); // [Hello, World, !]
		System.out.println("Removed: " + linkList.remove(1)); // removes "World"
		linkList.printList(); // [Hello, !]
		System.out.println("Size: " + linkList.size()); // 2
	    }
	}
