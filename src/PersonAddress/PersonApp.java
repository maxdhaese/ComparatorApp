package PersonAddress;

import java.util.Comparator;

public class PersonApp {
    public static void main(String[] args) {
        Address address1 = new Address(9340,"Melle","KoekoekStraat",70);
        Person person1 = new Person(28,"Max","D'Haese",address1);
        Address address2 = new Address(9000,"Gent","TrabotStraat",58);
        Person person2 = new Person(29,"Tom","Geerts",address2);
        NameComperator nameComparator = new NameComperator();
        AgeComparator ageComparator = new AgeComparator();
    }




    
}
