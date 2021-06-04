package pt.ipbeja.po2.comparable;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Person implements Comparable{

    String name;
    LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && birthdate.equals(person.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate);
    }

    @Override
    public int compareTo(Object o) {
        return o.hashCode();
    }
}
