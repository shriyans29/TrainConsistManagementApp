public class BogieSortTest {
    public static void main(String[] args) {
        String[] bogieNames = {"Cylindrical", "Rectangular", "Triangular", "Hexagonal"};

        System.out.println("Original Bogie Names:");
        for (String name : bogieNames) {
            System.out.println(name);
        }

        // Sort using Arrays.sort
        Arrays.sort(bogieNames);

        System.out.println("Sorted Bogie Names:");
        for (String name : bogieNames) {
            System.out.println(name);
        }
    }
}
