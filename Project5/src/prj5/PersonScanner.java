package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonScanner {
    private DoublyLinkedList<Person> peopleList;
    
    public PersonScanner(String fileName) throws FileNotFoundException {
        peopleList = new DoublyLinkedList<Person>();
        this.scanPeople(fileName);
    }
    
    public void scanPeople(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        scan.useDelimiter(",");
        
        while (scan.hasNext()) {
            Scanner line = new Scanner(scan.nextLine());
            
            int identification = line.next();
            String date = line.next();
            String hobby =  = line.next();
            String major = line.next();
            String region =  = line.next();
            
            String[] ans = new String[]();
            int x = 0;
            while (line.hasNext())
            {
                ans[x] = line.next();
                x++;
            }
            
            Person per = new Person(identification, date, hobby, major, region, ans);
            peopleList.addToBack(per);
        }
        scan.close();
        return peopleList;
    }
}
