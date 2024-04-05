package exercise2;

import java.util.Comparator;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SortedTableMap<Integer, String> map = new SortedTableMap<>();

        map.put(5, "A");
        map.put(2, "B");
        map.put(8, "C");
        map.put(10, "D");
        map.put(12, "E");

        int key = 5;
        System.out.println("Map contains key " + key + ": " + map.containKey(key));
        key = 2;
        System.out.println("Map contains key " + key + ": " + map.containKey(key));
        key = 1;
        System.out.println("Map contains key " + key + ": " + map.containKey(key));
        key = 12;
        System.out.println("Map contains key " + key + ": " + map.containKey(key));
        key = 0;
        System.out.println("Map contains key " + key + ": " + map.containKey(key));
	}

}
