package pl.wkos.homework151;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Person> people = ReadData.readResultsFromConsole();
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Abacki", 1.5));
        people.add(new Person("Ala", "Babacki", 1.1));
        people.add(new Person("Ela", "Cabacki", 1.8));
        people.add(new Person("Ala", "Babacki", 1.8));
        people.add(new Person("Ela", "Cabacka", 1.8));
        people.add(new Person("Ola", "Dabacki", 1.7));
        System.out.println(people);
        PersonUtils.sort(people);
        System.out.println(people);
        WriteData.writeToTextFile("stats.csv", people);
    }
}
