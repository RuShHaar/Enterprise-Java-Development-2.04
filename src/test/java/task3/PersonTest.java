package task3;

import org.junit.jupiter.api.Test;
import task1.Person;
import task1.underAgeException;


import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements Cloneable {

//    @Test
//
//
//    void testClone() throws underAgeException {
//        Person test1 = new Person(100, "TestUser", 25, "Tester");
//
//        Person test2 = (Person)test1.clone();
//
//        assertEquals(test1, test2 );
//
//    }



    @Test
    void setAge() throws task1.underAgeException {

        task1.Person test1 = new task1.Person(123, "Tester", 10, "Clerk");

        assertThrows(task1.underAgeException.class, () -> test1.setAge(-3));
    }

    @Test
    void setAgeCreateObject() throws task1.underAgeException {

        assertThrows(underAgeException.class, () -> new Person(123, "Tester", -12, "Clerk"));


    }
}