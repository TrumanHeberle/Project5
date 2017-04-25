package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A linked chain of Nodes to store data
 * Contains sentinel nodes
 * 
 * @author Truman Heberle trumanh
 * @version 4.15.2017
 * @param <T>
 *            The type of data stored in the list
 */
public class DoublyLinkedList<T> implements Iterable<T> {
    private int size;
    private Node head;
    private Node tail;


    /**
     * Creates new DoublyLinkedList
     */
    public DoublyLinkedList() {
        size = 0;
        head = new Node(null);
        tail = new Node(null);
        head.setNext(tail);
        tail.setPrevious(head);
    }


    /**
     * Prevents StackOverflowErros when creating a Node
     * 
     * @param bool
     *            Any boolean
     */
    private DoublyLinkedList(boolean bool) {
    }


    /**
     * Returns the size of the DoublyLinkedList
     * 
     * @return The size of the DoublyLinkedList
     */
    public int size() {
        return size;
    }


    /**
     * returns a list of a certain major
     * 
     * @return a new list
     * @param major
     *            the major
     */
    public DoublyLinkedList<Person> getChosenMajorList(MajorEnum major) {
        DoublyLinkedList<Person> result = new DoublyLinkedList<Person>();
        @SuppressWarnings("unchecked")
        Iterator<Person> iterator = (Iterator<Person>)this.iterator();
        while (iterator.hasNext()) {
            Person currentPerson = iterator.next();
            if (currentPerson.getMajor().equals(major)) {
                result.addToBack(currentPerson);
            }
        }
        return result;
    }


    /**
     * returns a list of a certain hobby
     * 
     * @return a new list
     * @param hobby
     *            the hobby
     */
    public DoublyLinkedList<Person> getChosenHobbyList(HobbyEnum hobby) {
        DoublyLinkedList<Person> result = new DoublyLinkedList<Person>();
        for (T person : this) {
            if (((Person)person).getHobby().equals(hobby)) {
                result.addToBack((Person)person);
            }
        }

        return result;
    }


    /**
     * returns a list of a certain region
     * 
     * @return a new list
     * @param region
     *            the region
     */
    public DoublyLinkedList<Person> getChosenRegionList(RegionEnum region) {
        DoublyLinkedList<Person> result = new DoublyLinkedList<Person>();
        for (T person : this) {
            if (((Person)person).getRegion().equals(region)) {
                result.addToBack((Person)person);
            }
        }

        return result;
    }


    /**
     * Creates a new Node with data and adds it to the back
     * of the DoublyLinkedList
     * 
     * @param data
     *            The data to be stored
     */
    public void addToBack(T data) {
        Node newNode = new Node(data);
        newNode.addAfter(tail.previous());
        size++;
    }


    /**
     * Creates a new Node with data and adds it at
     * a certain position in the DoublyLinkedList
     * 
     * @param index
     *            The position to add the Node to
     * @param data
     *            The data to be stored
     * @throws IndexOutOfBoundsException
     *             If the index is not valid
     */
    public void add(int index, T data) throws IndexOutOfBoundsException {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index is invalid");
        }

        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next();
        }
        Node newNode = new Node(data);
        newNode.addAfter(curr);
        size++;
    }


    /**
     * Returns the data of the first Node
     * 
     * @return The data of the first Node
     */
    public T getFront() {
        return head.next().data();
    }


    /**
     * Returns the data of the last Node
     * 
     * @return The data of the last Node
     */
    public T getBack() {
        return tail.previous().data();
    }


    /**
     * Returns the data of a specified Node
     * 
     * @param index
     *            The Node's index
     * @return The Node's data
     * @throws IndexOutOfBoundsException
     *             If the index is invalid
     */
    public T getEntry(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index is invalid");
        }

        Node curr = head.next();
        for (int i = 0; i < index; i++) {
            curr = curr.next();
        }
        return curr.data();
    }


    /**
     * Checks whether data is contained in the list
     * 
     * @param data
     *            The data to check for
     * @return Whether a Node contains the data
     */
    public boolean contains(T data) {
        Node curr = head.next();
        while (curr != tail) {
            if (curr.data().equals(data)) {
                return true;
            }
            curr = curr.next();
        }
        return false;
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }


    /**
     * Returns an object array of all the data in the list
     * 
     * @return The generic array of all the data in the list
     */
    public Object[] toArray() {
        Object[] arr = new Object[this.size];
        if (size != 0) {
            for (int i = 0; i < this.size; i++) {
                arr[i] = this.getEntry(i);
            }
        }
        return arr;
    }


    /**
     * Stores data in a Node
     * 
     * @author Truman Heberle trumanh
     * @version 4.15.2017
     * @param <T>
     *            The type of data stored in the Node
     */
    private class Node extends DoublyLinkedList<T> {
        private T data;
        private Node next;
        private Node prev;


        /**
         * Creates a new Node
         * 
         * @param nodeData
         *            The data to store
         */
        public Node(T nodeData) {
            super(false);
            this.setData(nodeData);
            next = null;
            prev = null;
        }


        /**
         * Sets the next Node
         * 
         * @param nextNode
         *            The next Node
         */
        public void setNext(Node nextNode) {
            next = nextNode;
        }


        /**
         * Sets the previous Node
         * 
         * @param prevNode
         *            The previous Node
         */
        public void setPrevious(Node prevNode) {
            prev = prevNode;
        }


        /**
         * Returns the next Node
         * 
         * @return The next Node
         */
        public Node next() {
            return next;
        }


        /**
         * Returns the previous Node
         * 
         * @return The previous Node
         */
        public Node previous() {
            return prev;
        }


        /**
         * Sets the data inside the Node
         * 
         * @param nodeData
         *            The data inside the Node
         */
        public void setData(T nodeData) {
            data = nodeData;
        }


        /**
         * Returns the data inside the Node
         * 
         * @return The data inside the Node
         */
        public T data() {
            return data;
        }


        /**
         * Adds this Node to a chain after a specified Node
         * 
         * @param currentNode
         *            the specified Node
         */
        @SuppressWarnings("unchecked")
        public void addAfter(Node currentNode) {
            this.setNext(currentNode.next());
            currentNode.next().setPrevious(this);
            currentNode.setNext(this);
            this.setPrevious(currentNode);
        }
    }


    /**
     * Allows iteration through the list
     * 
     * @author Truman Heberle trumanh
     * @version 4.16.2017
     * @param <T>
     *            The type of data in the list
     */
    private class ListIterator extends DoublyLinkedList<T>
        implements Iterator<T> {
        private DoublyLinkedList<T>.Node curr;


        /**
         * Creates a new Iterator
         */
        public ListIterator() {
            curr = head;
        }


        @Override
        public boolean hasNext() {
            return curr.next() != tail;
        }


        @Override
        public T next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException(
                    "No more elements to progress");
            }
            curr = curr.next();
            return curr.data();
        }

    }
}
