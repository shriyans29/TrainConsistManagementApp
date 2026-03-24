public static void main(String[] args){

    System.out.println("===================================");
    System.out.println("UC2 - Add Passenger Bogies to Train");
    System.out.println("===================================");

    List<String> passengerBogies = new ArrayList<>();

    passengerBogies.add("Sleeper");
    passengerBogies.add("AC Chair");
    passengerBogies.add("First Class");

    System.out.println("\n\nafter adding bogies:");
    System.out.println(("Passenger Bogies : " + passengerBogies));

    passengerBogies.remove("\nAC Chair");
    System.out.println("after removing AC Chair:");
    System.out.println(("Passenger Bogies : " + passengerBogies));

    System.out.println("\nchecking if 'Sleeper' exists:");
    System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

    System.out.println("\nFinal Train Passesnger Consist:");
    System.out.println( passengerBogies);

}