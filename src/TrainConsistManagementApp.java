import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistApp {
    public class TrainConsistManagementApp {

        public static void main(String[] args) {

            System.out.println("=== Train Consist Management App ===");

            List<Bogie> bogies = new ArrayList<>();

            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 24));

            bogies.sort(Comparator.comparingInt(b -> b.capacity));
            List<Bogie> filteredBogies = bogies.stream()
                    .filter(b -> b.capacity > 60)
                    .collect(Collectors.toList());

            System.out.println("\nFiltered Bogies (Capacity > 60):");
            for (Bogie b : filteredBogies) {
                System.out.println(b);
            }

            System.out.println("\nBogies Sorted by Capacity (Ascending):");
            // Show original list (to prove it is unchanged)
            System.out.println("\nOriginal Bogie List (Unchanged):");
            for (Bogie b : bogies) {
                System.out.println(b);
            }

        }