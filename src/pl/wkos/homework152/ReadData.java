package pl.wkos.homework152;

import java.util.ArrayList;
import java.util.List;

public class ReadData {
    public static List<Computer> readComputers(){
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Dell", 1.8, 4));
        computers.add(null);
        computers.add(new Computer("Dell", 1.8, 6));
        computers.add(new Computer("Acer", 2.8, 8));
        computers.add(new Computer(null, 1.4, 10));
        computers.add(new Computer("Dell", 1.8, 6));
        computers.add(new Computer("Acer", null, 8));
        computers.add(new Computer("Dell", 1.4, null));
        return computers;
    }
}
