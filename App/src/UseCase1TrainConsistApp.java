import java.util.ArrayList;
import java.util.List;

/**
 * Use Case 1: Initialize Train and Display Consist Summary
 * 
 * Demonstrates application startup and initialization
 * of train consist using dynamic data structure.
 * 
 * @author Vaishnavi
 * @version 1.0
 */

class UseCase1TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===\n");

        // Initialize train consist (empty list of bogies)
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("\nSystem ready for operations...");
    }
}