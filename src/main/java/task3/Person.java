package task3;

import java.util.Objects;

public class Person implements Cloneable {

    private int id;
    private String name;
    private int age;
    private String occupation;
    private java.lang.Object Object;
    private java.lang.Cloneable cloneable;

    public Person(int id, String name, int age, String occupation) throws underAgeException {
        this.id = id;
        this.name = name;
        setAge(age);
        this.occupation = occupation;
    }

    //Clone-Methode
    public Object clone() throws CloneNotSupportedException{
        this.id = getId() +1 ;
        return super.clone();
    }

    //Override equals-Methode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(occupation, person.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, occupation);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws underAgeException {

            if (age >= 0) {
                this.age = age;
            }
            else{
            throw new underAgeException("You tried to fill in a negative age!");



        }

    }
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
