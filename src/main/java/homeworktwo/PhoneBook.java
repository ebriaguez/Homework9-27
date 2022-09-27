package homeworktwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook(HashMap<String, ArrayList<String>> phoneBook) {
        this.phoneBook = phoneBook;
        //or
        //this.phoneBook = null;
//        phoneBook = HashMap;
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) { //passing a name and phone number
        //create an array list that will hold the phone numbers
        ArrayList<String> phoneNumbers = new ArrayList<>();
        //store your phonenumber in phonenumbers list
        phoneNumbers.add(phoneNumber);
        //add name and phone number into phonebook
        phoneBook.put(name, phoneNumbers);
    }

    //Explanation
    //.addAll("Emilia", "000-000-000", "111-111-1111")
    public void addAll(String name, String... phoneNumbers) { //want to pass a name and phone number strings*
        //create an arraylist to store list of phone numbers
        ArrayList<String> phoneNumbersTwo = new ArrayList<>();
        //we need to add all phone numbers and names into phonebook
        //create a loop to loop through the phone numbers in order to store them in phonebook
        /* for (String placeHolder : phoneNumbers) {
            phoneNumbersTwo.add(placeHolder);
        } */
        phoneNumbersTwo.addAll(Arrays.asList(phoneNumbers));

        phoneBook.put(name, phoneNumbersTwo);
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {
        //check if the name is in the phonebook
        Boolean checkName = phoneBook.containsKey(name);
        return checkName;
    }

    public ArrayList<String> lookup(String name) {
        //look up the name and return the phone numbers
        return phoneBook.get(name);
    }

    public String reverseLookup(String phoneNumber) {
        //input phone # to get name String
        String getKey = " ";
        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet())
            if (entry.getValue().contains(phoneNumber)) {
                getKey = entry.getKey();
            }
            return getKey;
        }

        public String getAllContactNames() {
        //loop through phonebook to get names
            String getKeys = " ";
            for(String placeHolder : phoneBook.keySet()){
                getKeys += placeHolder;
            }
            return getKeys;
        }

        public HashMap<String, ArrayList<String>> getMap () {
            return phoneBook;
        }
    }