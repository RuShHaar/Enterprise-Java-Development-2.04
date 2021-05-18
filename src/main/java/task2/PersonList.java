package task2;

import java.util.ArrayList;

public class PersonList {

    private ArrayList <String> personList = new ArrayList<>();
    private String name;

    public void addNameToList(String newName){
        personList.add(newName);
    }

    public String findByName(String search) throws wrongNameFormatException {
        if(!search.contains(" ")){
            throw new wrongNameFormatException("You have to input the name with the Format 'firstname lastname'");
        }
        boolean found = false;
        String result = null;
        String tempName = null;

        for(int i= 0; i < personList.size(); i++){

            if (search.equals(personList.get(i))){
                found = true;
                tempName = personList.get(i);
            }

        }
        if(found){
            String match = "Gefunden!";
            result = match;
        }
        else{
            String match = "Nicht gefunden!";
                    result = match;
        }
        if(tempName !=null) {
            return result + "Die Person " + tempName + " wurde in der Liste gefunden!";
        }
        else return result;
    }

}
