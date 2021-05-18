package task4;

import java.io.FileWriter;
import java.io.IOException;

public class Person {

    private int id;
    private String name;
    private int age;
    private String occupation;

    public Person(int id, String name, int age, String occupation) throws underAgeException {
        this.id = id;
        this.name = name;
        setAge(age);
        this.occupation = occupation;
    }

    //Filewriter and toString-Methode

    @Override
    public String toString() {
        try {
            FileWriter fw = new FileWriter("person.txt");

            fw.write("Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", occupation='" + occupation + '\'' +
                    '}');
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Infos were written into person.txt";
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
        } else {
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
