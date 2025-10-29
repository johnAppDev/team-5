package arrayListPkg;

public class Test {
	public static void main (String [] args) {
		
		// integer
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println("Integer list: " + intList);
        System.out.println("Get index 1: " + intList.get(1));
        intList.remove(0);
        System.out.println("After removing index 0: " + intList);
        System.out.println("Size: " + intList.size());

        // string 
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Cherry");
        System.out.println("\nString list: " + strList);
        System.out.println("Get index 2: " + strList.get(2));
        strList.remove(1);
        System.out.println("After removing index 1: " + strList);
        System.out.println("Size: " + strList.size());
    }
}
