package exercise1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Experiments {

	public static void main(String[] args) {
        int capacity = 10000; // Initial capacity of the hash map
        int maxElements = 10000;    // Maximum number of elements to insert
        Random rand = new Random();

        // while loop which increases the load factor and tests ChainHashMAp
        double loadFactor = 0.1;
        while (loadFactor <= 0.9) {
            //create a ChainHashMap
            ChainHashMap<Integer, Integer> map = new ChainHashMap<>(capacity, 109345121);
            map.adjustMaxLoad(loadFactor);	//adjust the load factor
            
            System.out.printf("LOAD FACTOR: %.2f\nMAXIMUM LOAD: %.1f\n", loadFactor,map.capacity * map.maxLoadFactor);
            
            long startTime = System.currentTimeMillis();
            //insert random integers into the map
            for (int i = 0; i < maxElements; i++) {
                int key = rand.nextInt(maxElements); // Generate a random key
                map.put(key, i); // Insert into the map
            }
            long endTime = System.currentTimeMillis();

            // elapsed time for insertion
            long elapsedTime = endTime - startTime;
            System.out.printf("Inserted %d elements in %d milliseconds.\n----------------\n", maxElements, elapsedTime);

            //increase load factor
            loadFactor += 0.1;
        }
    }
}
