import java.util.HashMap;
import java.util.Map;

/**
 * Use Case 6: Map Bogie to Capacity
 * 
 * Demonstrates how HashMap is used to associate
 * each bogie with its seating/load capacity.
 * 
 * @author Vaishnavi
 * @version 6.0
 */

class UseCase6BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App v6.0 ===\n");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogies with capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 78);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 100); // load capacity

        // Display all entries
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println(bogie + " → Capacity: " + capacity);
        }

        // Example lookup
        System.out.println("\nCapacity of Sleeper bogie: " + bogieCapacity.get("Sleeper"));
    }
}
