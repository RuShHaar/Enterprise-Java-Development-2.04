package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void setAge() throws underAgeException {
        
        Person test1 = new Person(123, "Tester", 10, "Clerk");

       assertThrows(underAgeException.class, () -> test1.setAge(-3));
    }

    @Test
    void setAgeCreateObject() throws underAgeException {

        assertThrows(underAgeException.class, () -> new Person(123, "Tester", -12, "Clerk"));


    }
}