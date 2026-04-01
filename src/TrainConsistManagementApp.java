import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {
    public class TrainConsistApp {

        public static void main(String[] args) {

            System.out.println("=== Train Consist Management App ===");

            // Create HashMap for Bogie -> Capacity
            Map<String, Integer> bogieCapacityMap = new HashMap<>();
            // Create List of Bogies
            List<Bogie> bogies = new ArrayList<>();

            // Insert bogie capacities
            bogieCapacityMap.put("Sleeper", 72);
            bogieCapacityMap.put("AC Chair", 78);
            bogieCapacityMap.put("First Class", 24);
            // Add Passenger Bogies
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 24));

            // Display bogie capacities
            System.out.println("\nBogie Capacity Details:");
            // Sort by Capacity (Ascending)
            bogies.sort(Comparator.comparingInt(b -> b.capacity));

            for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
                System.out.println("Bogie: " + entry.getKey() +
                        " | Capacity: " + entry.getValue());
                // Display Sorted Bogies
                System.out.println("\nBogies Sorted by Capacity (Ascending):");
                for (Bogie b : bogies) {
                    System.out.println(b);
                }

            }