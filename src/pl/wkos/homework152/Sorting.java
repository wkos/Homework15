package pl.wkos.homework152;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sorting {
    public static List<Computer> ascSorting(List<Computer> computers) {
        System.out.println("Po czym sortujemy? [nazwa, cpu, ram]");
        Scanner scanner = new Scanner(System.in);
        String sortMethod = scanner.nextLine();
        switch (sortMethod) {
            case "nazwa":
                Collections.sort(computers);
                break;
            case "cpu":
                CPUSpeedComparator cpuSpeedComparator = new CPUSpeedComparator();
                Collections.sort(computers, cpuSpeedComparator);
                break;
            case "ram":
                MemoryComparator memoryComparator = new MemoryComparator();
                Collections.sort(computers, memoryComparator);
                break;
        }
        return computers;
    }
}
