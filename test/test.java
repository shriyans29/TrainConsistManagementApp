public class LinearSearchTest {
    public static void main(String[] args) {
        String[] bogieIDs = {"B1", "B2", "B3", "B4"};

        // Test Case 1: Bogie ID exists
        String searchKey1 = "B3";
        boolean found1 = TrainConsistManagementApp.linearSearch(bogieIDs, searchKey1);
        System.out.println("Searching for " + searchKey1 + ": " + (found1 ? "Found" : "Not Found"));

        // Test Case 2: Bogie ID does not exist
        String searchKey2 = "B5";
        boolean found2 = TrainConsistManagementApp.linearSearch(bogieIDs, searchKey2);
        System.out.println("Searching for " + searchKey2 + ": " + (found2 ? "Found" : "Not Found"));
    }
}
