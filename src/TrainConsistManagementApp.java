public static void main(String[] args){

    System.out.println("========================================");
    System.out.println("UC5 - Preserve Insertion Order of Bogies");
    System.out.println("========================================");

    Set<String> formation = new LinkedHashSet<>();

    formation.add("Engine");
    formation.add("Sleeper");
    formation.add("Cargo");
    formation.add("Guard");
    formation.add("Sleeper");
    System.out.println("\n\nFinal train formation:\n" + formation);

    System.out.println("\nNote:\nLinkedHashSet preserved insertion order and removes duplicates automatically.");
    System.out.println("\nUC5 formation setup completer...");

}