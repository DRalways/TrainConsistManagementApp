import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Use Case 5: Preserve Insertion Order of Bogies
 * 
 * Demonstrates how LinkedHashSet maintains insertion order
 * while preventing duplicate bogies in train formation.
 * 
 * @author Vaishnavi
 * @version 5.0
 */

class UseCase5LinkedHashSetFormation {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App v5.0 ===\n");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate → ignored

        // Display formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        // Display total bogies
        System.out.println("\nTotal Bogies: " + trainFormation.size());
    }
}