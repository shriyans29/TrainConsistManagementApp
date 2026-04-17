public class CargoSafetyTest {
    public static void main(String[] args) {
        // Test Case 1: Safe assignment
        GoodsBogie bogie1 = new GoodsBogie("B1", "Cylindrical");
        bogie1.assignCargo("Coal");

        // Test Case 2: Unsafe assignment (Rectangular + Petroleum)
        GoodsBogie bogie2 = new GoodsBogie("B2", "Rectangular");
        bogie2.assignCargo("Petroleum");
    }
}
