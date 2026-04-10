import java.util.*;
import java.util.stream.Collectors;

/**
 * Use Case 8: Filter Passenger Bogies Using Streams
 * 
 * Demonstrates filtering using Stream API and lambda expressions.
 * 
 * @author Vaishnavi
 * @version 8.0
 */

// -------------------- Bogie Class --------------------
class BogieUC8 {

    String name;
    int capacity;

    BogieUC8(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " → Capacity: " + capacity);
    }
}

// -------------------- Main --------------------
class UseCase8FilterBogiesStream {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App v8.0 ===\n");

        // Create list of bogies (reuse UC7 concept)
        List<BogieUC8> bogies = new ArrayList<>();

        bogies.add(new BogieUC8("Sleeper", 72));
        bogies.add(new BogieUC8("AC Chair", 56));
        bogies.add(new BogieUC8("First Class", 24));
        bogies.add(new BogieUC8("Luxury Coach", 80));

        // Filter bogies with capacity > 60
        List<BogieUC8> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("Bogies with Capacity > 60:\n");

        for (BogieUC8 b : filteredBogies) {
            b.display();
        }

        // Verify original list unchanged
        System.out.println("\nOriginal Bogie List (Unchanged):");
        for (BogieUC8 b : bogies) {
            b.display();
        }
    }
}
