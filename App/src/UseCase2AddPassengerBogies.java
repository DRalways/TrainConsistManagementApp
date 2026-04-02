import java.util.ArrayList;
import java.util.List;

/**
 * Use Case 2: Add Passenger Bogies to Train
 * 
 * Demonstrates dynamic insertion, deletion, and search
 * using ArrayList operations.
 * 
 * @author Vaishnavi
 * @version 2.0
 */

class UseCase2AddPassengerBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App v2.0 ===\n");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        // Add passenger bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display bogies after addition
        System.out.println("After adding bogies:");
        System.out.println(trainConsist);

        // Remove a bogie
        trainConsist.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(trainConsist);

        // Check if Sleeper exists
        boolean exists = trainConsist.contains("Sleeper");

        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}