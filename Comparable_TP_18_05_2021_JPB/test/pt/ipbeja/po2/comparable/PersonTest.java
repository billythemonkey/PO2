package pt.ipbeja.po2.comparable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testCompare(){
        List<Person> personList = Arrays.asList(new Person("Andrei", LocalDate.of(1991, 9, 18)),
                new Person("Tiago", LocalDate.of(2000, 2, 13)),
                new Person("Artur", LocalDate.of(1999, 5, 2)),
                new Person("Guilherme", LocalDate.of(2001, 4, 30)));

        Set<Person> orderedSetOfPersons = new TreeSet<>(personList);

        for (Person p: orderedSetOfPersons) {
            System.out.println(p);
        }

        List<Person> orderedList = new ArrayList<>(orderedSetOfPersons);
        Comparator<Person> naturalOrderComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.compareTo(p2);
            }
        };

    }

}