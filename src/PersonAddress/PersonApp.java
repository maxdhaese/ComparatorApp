package PersonAddress;

import java.util.Comparator;

public class PersonApp {
    public static void main(String[] args) {
        Address address1 = new Address(9340, "Melle", "KoekoekStraat", 70);
        Person person1 = new Person(28, "Max", "D'Haese", address1);
        Address address2 = new Address(9000, "Gent", "TrabotStraat", 58);
        Person person2 = new Person(29, "Tom", "Geerts", address2);
        NameComperator nameComparator = new NameComperator();
        AgeComparator ageComparator = new AgeComparator();
        ZipCodeComperator zipCodeComperator = new ZipCodeComperator();

        showPersonThatCameFirstAfterComparing(person1,person2,nameComparator);
        


    }

    public static void showPersonThatCameFirstAfterComparing(Person person1, Person person2,Comparator<Person>comparator){
        if (comparator.compare(person1,person2) == 0){
            System.out.println(person1);

        }else if (comparator.compare(person1,person2) > 1){
            System.out.println(person1);
        }else
            System.out.println(person2);
    }



}
