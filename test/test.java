public class BinarySearchValidationTest {
    public static void main(String[] args) {
        // Test Case 1: Valid search with existing bogies
        String[] bogieIDs = {"B1", "B2", "B3", "B4"};
        String searchKey1 = "B3";
        boolean found1 = TrainConsistManagementApp.binarySearchWithValidation(bogieIDs, searchKey1);
        System.out.println("Searching for " + searchKey1 + ": " + (found1 ? "Found" : "Not Found"));

        // Test Case 2: Valid search with non-existing bogie
        String searchKey2 = "B5";
        boolean found2 = TrainConsistManagementApp.binarySearchWithValidation(bogieIDs, searchKey2);
        System.out.println("Searching for " + searchKey2 + ": " + (found2 ? "Found" : "Not Found"));

        // Test Case 3: Invalid case (empty array)
        try {
            String[] emptyBogieIDs = {};
            TrainConsistManagementApp.binarySearchWithValidation(emptyBogieIDs, "B1");
        } catch (IllegalStateException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
