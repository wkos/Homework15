package pl.wkos.homework151;

import pl.wkos.homework151.Person;
import pl.wkos.homework151.ReadData;

import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void sort(List<Person> lista) {
        String sortOrder = ReadData.readSortOrder();
        if (sortOrder.equals("asc"))
            Collections.sort(lista);
        else if (sortOrder.equals("dsc")) {
            Collections.sort(lista);
            Collections.reverse(lista);
        }
    }
}
