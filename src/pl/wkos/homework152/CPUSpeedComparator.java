package pl.wkos.homework152;

import java.util.Comparator;

public class CPUSpeedComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        if (o1 == null && o2 == null)
            return 0;
        else if (o1 == null)
            return -1;
        else if (o2 == null)
            return 1;
        else {
            if (o1.getCpuSpeed() != null && o2.getCpuSpeed() != null)
                return Double.compare(o1.getCpuSpeed(), o2.getCpuSpeed());
            else if (o1.getCpuSpeed() == null && o2.getCpuSpeed() != null)
                return -1;
            else if (o1.getCpuSpeed() != null && o2.getCpuSpeed() == null)
                return 1;
            else
                return 0;
        }
    }
}
