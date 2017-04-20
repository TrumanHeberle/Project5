package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Scans a file of people's data and adds them to a list
 * 
 * @author trumanh
 * @version 4.19.2017
 */
public class PersonScanner {
    private DoublyLinkedList<Person> peopleList;


    /**
     * Creates a new PersonScanner
     */
    public PersonScanner() {
        peopleList = new DoublyLinkedList<Person>();
    }


    /**
     * Creates a new PersonScanner and assigns a peopleList
     * 
     * @param fileName
     *            The file which contains the people data
     * @throws FileNotFoundException
     *             If the file can't be found
     */
    public PersonScanner(String fileName) throws FileNotFoundException {
        peopleList = new DoublyLinkedList<Person>();
        this.scanPeople(fileName);
    }


    /**
     * Scans a person file and adds people to a DoublyLinkedList
     * 
     * @param fileName
     *            The file which contains the people data
     * @throws FileNotFoundException
     *             If the file can't be found
     */
    public void scanPeople(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        // Skips Header
        scan.nextLine();

        // Searches through list
        while (scan.hasNextLine()) {
            String[] values = scan.nextLine().split(",");
            for (int i = 0; i < values.length; i++) {
                values[i] = values[i].trim();
            }

            int id = Integer.parseInt(values[0]);
            String date = values[1];
            String major = values[2];
            String region = values[3];
            String hobby = values[4];
            String[] answers = Arrays.copyOfRange(values, 4, values.length);

            Person person = new Person(id, date, hobby, major, region, answers);
            peopleList.addToBack(person);
        }
        scan.close();
    }


    /**
     * Returns the list of people
     * 
     * @return The list of people
     */
    public DoublyLinkedList<Person> getPeopleList() {
        return peopleList;
    }
}
