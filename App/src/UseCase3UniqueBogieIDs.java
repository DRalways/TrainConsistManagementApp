import java.util.HashSet;
import java.util.Set;

/**
 * Use Case 3: Track Unique Bogie IDs
 * 
 * Demonstrates use of HashSet to ensure uniqueness
 * of bogie IDs in train consist.
 * 
 * @author Vaishnavi
 * @version 3.0
 */

class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App v3.0 ===\n");

        // Create HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display final set
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIDs);

        // Show total count
        System.out.println("\nTotal unique bogies: " + bogieIDs.size());
    }
}

