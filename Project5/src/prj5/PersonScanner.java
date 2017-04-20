package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author AshlynUser
 * @version 2017.04.19
 */
public class PersonScanner {
    private DoublyLinkedList<Person> peopleList;


    /**
     * the scanner constructor
     */
    public PersonScanner() {
        peopleList = new DoublyLinkedList<Person>();
    }


    /**
     * constructor with a parameter
     * 
     * @param fileName
     * @throws FileNotFoundException
     */
    public PersonScanner(String fileName) throws FileNotFoundException {
        peopleList = new DoublyLinkedList<Person>();
        scanPeople(fileName);
    }


    /**
     * scans the file of people
     * 
     * @param fileName
     * @return
     * @throws FileNotFoundException
     */
    public DoublyLinkedList<Person> scanPeople(String fileName)
        throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        // Skips Header
        if (scan.hasNextLine()) {
            scan.nextLine();
        }

        // Searches through list
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.endsWith(",")) {
                line = line + "n/a";
            }
            String[] values = line.split(" *, *");
            // for (int i = 0; i < values.length; i++) {
            // values[i] = values[i].trim();
            // }
            Person person = new Person();
            person.setId(Integer.parseInt(values[0]));
            person.setDate(values[1]);
            if (values[2].contains("CMDA") || values[2].contains("Computer")
                || values[2].contains("Engineering") || values[2].contains(
                    "Other")) {
                person.setMajor(values[2]);
            }
            else {
                person = null;
            }
            if (values[3].contains("Southeast") || values[3].contains(
                "Northeast") || values[3].contains("Outside") || values[3]
                    .contains("Rest")) {
                person.setRegion(values[3]);
            }
            else {
                person = null;
            }
            if (values[4].contains("sports") || values[4].contains("music")
                || values[4].contains("art") || values[4].contains("read")) {
                person.setHobby(values[4]);
            }
            else {
                person = null;
            }
            // String[] answers = Arrays.copyOfRange(values, 4, values.length);
            String[] answers = new String[values.length - 5];
            for (int i = 0; i <= values.length - 6; i++) {
                answers[i] = values[i + 5];
                if (answers[i].equals("")) {
                    answers[i] = "n/a";
                }
            }
            if (person != null) {
                person.setAnswers(answers);
                peopleList.addToBack(person);
            }
            // return peopleList;

        }

        scan.close();
        return peopleList;
        // scan.close();
    }


    /**
     * returns the list of people
     * 
     * @return
     */
    public DoublyLinkedList<Person> getPeopleList() {
        return peopleList;
    }
}
