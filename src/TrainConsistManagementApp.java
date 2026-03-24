public static void main(String[] args){

    System.out.println("====================================");
    System.out.println("UC4 - Maintain Ordered Bogie Consist");
    System.out.println("====================================");

    List<String> passengerBogies = new LinkedList<>();

    passengerBogies.add("Engine");
    passengerBogies.add("Sleeper");
    passengerBogies.add("AC");
    passengerBogies.add("Cargo");
    passengerBogies.add("Guard");

    System.out.println("\n\nInitial Train Consist:\n" + passengerBogies);

    passengerBogies.add(2,"Pantry");
    System.out.println("\nAfter Inserting 'Pantry car' at position 2:\n" + passengerBogies);

    passengerBogies.removeFirst();
    passengerBogies.removeLast();
    System.out.println("\nAfter Removing First and Last Bogie:\n" + passengerBogies);

    System.out.println("\nUC4 ordered consist operations completed...");
}
