package PersonAddress;

import java.util.Comparator;

public class ZipCodeComperator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAddress().getZipCode(), person2.getAddress().getZipCode());
    }
}
