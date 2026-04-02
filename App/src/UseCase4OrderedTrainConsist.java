import java.util.LinkedList;

/**
 * Use Case 4: Maintain Ordered Bogie IDs
 * 
 * Demonstrates LinkedList to maintain physical order
 * of train consist with efficient insertion and deletion.
 * 
 * @author Vaishnavi
 * @version 4.0
 */

class UseCase4OrderedTrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App v4.0 ===\n");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
    }
}
