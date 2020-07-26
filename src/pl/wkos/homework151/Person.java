package pl.wkos.homework151;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private Double result;

    public Person(String firstName, String lastName, Double result) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.result = result;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + result;
    }

    @Override
    public int compareTo(Person p) {
        if (this.result < p.result)
            return -1;
        else if (this.result > p.result)
            return 1;
        else
            return this.lastName.compareTo(p.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getResult() {
        return result;
    }
}
