import java.util.*;

/**
 * Use Case 7: Sort Bogies by Capacity
 * 
 * Demonstrates sorting of custom objects using Comparator
 * and lambda expressions based on business logic.
 * 
 * @author Vaishnavi
 * @version 7.0
 */

// -------------------- Bogie Class --------------------
class BogieUC7 {

    String name;
    int capacity;

    BogieUC7(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " → Capacity: " + capacity);
    }
}

// -------------------- Main --------------------
class UseCase7SortBogiesByCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App v7.0 ===\n");

        // Create list of bogies
        List<BogieUC7> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new BogieUC7("Sleeper", 72));
        bogies.add(new BogieUC7("AC Chair", 56));
        bogies.add(new BogieUC7("First Class", 24));

        // Sort bogies by capacity (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Bogies Sorted by Capacity (Ascending):\n");

        for (BogieUC7 b : bogies) {
            b.display();
        }

        // Optional: Descending order
        bogies.sort(Comparator.comparingInt((BogieUC7 b) -> b.capacity).reversed());

        System.out.println("\nBogies Sorted by Capacity (Descending):\n");

        for (BogieUC7 b : bogies) {
            b.display();
        }
    }
}
