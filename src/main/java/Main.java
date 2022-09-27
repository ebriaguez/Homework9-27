import homeworktwo.PhoneBook;

public class Main {
    public static void main(String[] args) {
        Person personOne = new Person("Emilia", "B");
        Person personTwo = new Person("Kai", "Bai");
        Person personThree = new Person("Jared", "B");

        Person[] arrayNames = {personOne, personTwo,personThree};

        PersonHandler placeHolder = new PersonHandler(arrayNames);

//        System.out.println(placeHolder.whileLoop());
//        System.out.println(placeHolder.forLoop());
//        System.out.println(placeHolder.forEachLoop());

        PhoneBook phonePeople = new PhoneBook();
//        phonePeople.add("Emilia", "111-111-1111");

//        phonePeople.addAll("Kai", "222-222-2222");
//        phonePeople.remove("Kai");
//        System.out.println(phonePeople.hasEntry("Tristan"));
//        System.out.println(phonePeople.lookup("Ems"));
//        System.out.println(phonePeople.reverseLookup("123-456-7890"));
//        System.out.println(phonePeople.getAllContactNames());

    }
}
