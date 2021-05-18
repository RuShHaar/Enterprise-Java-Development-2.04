package task3;

public class Main {

    public static void main(String[] args) throws underAgeException, CloneNotSupportedException {


            Person person1 = new Person(123, "Paul", 3, "Clerk");

            Person person2 = (Person)person1.clone();

            System.out.println(person2.getId());

        System.out.println(person1.equals(person2));

        }

    }


