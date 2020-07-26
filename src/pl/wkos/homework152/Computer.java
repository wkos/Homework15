package pl.wkos.homework152;

public class Computer implements Comparable<Computer>{
    private String name;
    private Double cpuSpeed;
    private Integer memory;

    public Computer(String name, Double cpuSpeed, Integer memory) {
        this.name = name;
        this.cpuSpeed = cpuSpeed;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "\n" + name + ", " + cpuSpeed + ", " + memory;
    }

    @Override
    public int compareTo(Computer o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public Double getCpuSpeed() {
        return cpuSpeed;
    }

    public Integer getMemory() {
        return memory;
    }
}
