// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String bogieId;
    String shape;
    String cargo;

    public GoodsBogie(String bogieId, String shape) {
        this.bogieId = bogieId;
        this.shape = shape;
    }

    // UC15: Safe Cargo Assignment using try-catch-finally
    public void assignCargo(String cargoType) {
        try {

            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe: Cannot assign Petroleum to Rectangular Bogie " + bogieId);
            }


            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully to Bogie " + bogieId);

        } catch (CargoSafetyException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed for Bogie " + bogieId);
        }
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("GB1", "Cylindrical");
        b1.assignCargo("Petroleum");


        GoodsBogie b2 = new GoodsBogie("GB2", "Rectangular");
        b2.assignCargo("Petroleum");


        GoodsBogie b3 = new GoodsBogie("GB3", "Rectangular");
        b3.assignCargo("Coal");
    }
}