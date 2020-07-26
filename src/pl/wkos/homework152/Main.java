package pl.wkos.homework152;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Computer> computers = ReadData.readComputers();
        List<Computer> sortedComputers;

        sortedComputers = Sorting.ascSorting(computers);

        System.out.println(sortedComputers);
    }


}
