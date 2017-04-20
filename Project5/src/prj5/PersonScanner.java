package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class PersonScanner {
    private DoublyLinkedList<Person> peopleList;
    
    public PersonScanner() {
        peopleList = new DoublyLinkedList<Person>();
    }
    
    public PersonScanner(String fileName) throws FileNotFoundException {
        peopleList = new DoublyLinkedList<Person>();
        this.scanPeople(fileName);
    }
    
    public void scanPeople(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        // Skips Header
        if (scan.hasNextLine()) {
            scan.nextLine();
        }
        
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
    
    public DoublyLinkedList<Person> getPeopleList() {
        return peopleList;
    }
} 
