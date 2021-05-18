package task2;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonListTest {

    @Test
    void wrongFormat() {

        ArrayList<String> testList1 = new ArrayList<>();
        testList1.add("Manfred Huber");
        testList1.add("Super Mario");
        testList1.add("Lady Gaga");

        PersonList testPerson = new PersonList();

        assertThrows(wrongNameFormatException.class, ()-> testPerson.findByName("HaraldJuhnke"));
    }

    @Test
    void nameIsInList(){

        ArrayList<String> testList1 = new ArrayList<>();
        testList1.add("Manfred Huber");

        PersonList testPerson = new PersonList();

        assertEquals("Manfred Huber", testList1.get(0));

    }

    @Test
    void findTheName() throws wrongNameFormatException {

        ArrayList<String> testList1 = new ArrayList<>();
        testList1.add("Manfred Huber");

        PersonList testPerson = new PersonList();

        assertEquals("Nicht gefunden!", testPerson.findByName("Irgendwer Rodrigez"));
}
}