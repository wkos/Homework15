package pl.wkos.homework151;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadData {
    private static final String ASC = "asc";
    private static final String DSC = "dsc";

    public static List<Person> readResultsFromConsole() {
        List<Person> people = new ArrayList<>();
        Person person;
        System.out.println("Podaj wynik kolejnego gracza lub wpisz stop");
        while ((person = readOneResult()) != null) {
            people.add(person);
            System.out.println("Podaj wynik kolejnego gracza lub wpisz stop");
        }
        return people;
    }

    public static Person readOneResult() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.equals("stop")) return null;
        String[] data = line.split(" ");
        double result = Double.parseDouble(data[2]);
        return new Person(data[0], data[1], result);
    }

    public static String readSortOrder() {
        System.out.println("Jak posortować wyniki malejąco (DSC), rosnąco (ASC)?");
        Scanner scanner = new Scanner(System.in);
        String line;
        while (!((line = scanner.nextLine().toLowerCase()).equals(ASC) || line.equals(DSC)))
            System.out.println("Podaj właściwy sposób sortowania - ASC (rosnąco), DSC (malejąco):");
        return line;
    }
}
