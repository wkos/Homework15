package pl.wkos.homework152;

import java.util.Comparator;

public class MemoryComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        if (o1 == null && o2 == null)
            return 0;
        else if (o1 == null)
            return -1;
        else if (o2 == null)
            return 1;
        else {
            if (o1.getMemory() != null && o2.getMemory() != null)
                return Integer.compare(o1.getMemory(), o2.getMemory());
            else if (o1.getMemory() == null && o2.getMemory() != null)
                return -1;
            else if (o1.getMemory() != null && o2.getMemory() == null)
                return 1;
            else
                return 0;
        }
    }
}
