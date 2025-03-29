package I_Collection;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //  Creating a HashMap (Unordered)
        Map<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put(101, "Alice");
        hashMap.put(102, "Bob");
        hashMap.put(103, "Charlie");
        hashMap.put(104, "David");

        System.out.println("HashMap: " + hashMap); // {101=Alice, 102=Bob, 103=Charlie, 104=David}

        // Retrieving values
        System.out.println("Value for key 102: " + hashMap.get(102)); // Bob

        //  Checking if a key exists
        System.out.println("Contains key 105? " + hashMap.containsKey(105)); // false
        System.out.println("Contains value 'Charlie'? " + hashMap.containsValue("Charlie")); // true

        /* Iterating using foreach
            Disadvantages:
            Cannot Modify the Map During Iteration .Throws ConcurrentModificationException if elements are modified inside forEach().
            Less Flexible for Complex Operations.You cannot break/continue loops easily inside a lambda.
         */
        System.out.println("\nIterating using forEach:");
       // hashMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        /* Iterating using entrySet
           Disadvantages: Slightly Slower in Concurrent Environments.Less optimized for parallel execution compared to forEach().
         */
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
           // System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //  Removing an entry
        hashMap.remove(103);
        System.out.println("\nAfter removing key 103: " + hashMap);

        // Using merge() to update a value
        hashMap.merge(102, "Updated", (oldValue, newValue) -> oldValue + " & " + newValue);
        System.out.println("\nAfter merge operation on key 102: " + hashMap);

        // Using merge() to insert a new key if absent
        hashMap.merge(105, "NewUser", (oldValue, newValue) -> oldValue + " & " + newValue);
        System.out.println("After merge operation on new key 105: " + hashMap);

        // Using compute() to update an existing key
        hashMap.compute(101, (key, value) -> value.toUpperCase());
        System.out.println("\nAfter compute() on key 101: " + hashMap);

        //  Using compute() to add a new key dynamically
        hashMap.computeIfAbsent(106, key -> "GeneratedValue");
        System.out.println("After computeIfAbsent() for key 106: " + hashMap);

        // Using compute() to modify an existing key conditionally
        hashMap.computeIfPresent(104, (key, value) -> value + " Modified");
        System.out.println("After computeIfPresent() for key 104: " + hashMap);

        //  Using TreeMap (Sorted by keys)
        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap (Sorted by Key): " + treeMap);

        //  Using LinkedHashMap (Maintains Insertion Order)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);
    }
}