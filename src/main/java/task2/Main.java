package task2;

public class Main {

    public static void main(String[] args) throws wrongNameFormatException {

        PersonList list1 = new PersonList();
        list1.addNameToList("Hans Meiser");
        list1.addNameToList("Hans Meier");
        list1.addNameToList("Super Mario");

        System.out.println(list1.findByName("Hans Meier"));
        System.out.println(list1.findByName("Manfred Irgendwas"));
        System.out.println(list1.findByName("Super Mario"));

    }

}
