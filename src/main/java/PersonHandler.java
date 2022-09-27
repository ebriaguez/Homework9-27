import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray){
        this.personArray = personArray;
    }

    //WHILE LOOP - repeatedly looping through the block of code until the boolean condition is met
    //COUNTER - keeps track of numbers

    public String whileLoop() {
        // assume there is a `counter`
        // create a `counter`
        // while `counter` is less than length of array
        // begin loop
        // append `stringRepresentation` to `result` variable
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // end loop

        int counter = 0;
        String result = " ";

        while (counter < personArray.length){
            result += personArray[counter].toString();
//            Person personPlaceholder = personArray[counter];
//            result += personPlaceholder.toString();
            counter++;
        }

        return result;
    }




    public String forLoop() {
        String result = " ";
        for(int counter = 0; counter < personArray.length; counter++){
            result += personArray[counter].toString();
        }
        // identify initial value
        // identify terminal condition
        // identify increment
        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        return result;
    }

    public String forEachLoop() {
        String result = " ";
        for(Person namePlaceholder : personArray){
            result += namePlaceholder.toString();
        }
        // identify array's type
        // identify array's variable-name
        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        return result;
    }
    public Person[] getPersonArray() {
        return personArray;
    }
}

