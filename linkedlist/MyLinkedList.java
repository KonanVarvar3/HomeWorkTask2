package com.homework2.linkedlist;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;


public class MyLinkedList<E> implements ILinkedList<E> {

    private Node head;
    private int size;

    @Override
    public void add(E element) {

        if (head == null) {
            head = new Node(element);
            size = 1;
            return;
        }

        Node current = head;

        while (true) {
            if (current.getNextNode() == null) {

                current.setNextNode(element);
                size++;
                return;
            }
            current = current.getNextNode();
        }
    }

    @Override
    public void add(int index, E element) throws IncorrectIndexException {

        if ((head == null && index > 1) || (head != null && index > size + 1) || index < 1) {
            throw new IncorrectIndexException("Index must be from 1 to size+1 (inclusive). Current index: "
                    + index + ", size of list: " + size);
        }

        if (head == null || index == size + 1) {
            add(element);
            return;
        }

        Node current = head;
        Node previous = current;
        int counter = 1;

        while (true) {
            if (counter == index) {

                previous.setNextNode(element);
                previous = previous.getNextNode();
                previous.setNextNode(current);
                size++;
                return;
            }
            previous = current;
            current = current.getNextNode();
            counter++;
        }
    }

    @Override
    public void clear() throws EmptyListException {

        if (head == null) {
            throw new EmptyListException("List is empty");
        }

        Node current = head;
        Node previous = current;

        while (true) {
            previous = current;
            current = current.getNextNode();

            if (current.getNextNode() == null) {
                previous.setNextNode(null);
                current = head;
            }
            if (current == head) {
                head = null;
                return;
            }
        }
    }

    private void CheckedIndexAndHead(int index) throws IncorrectIndexException {

        if ((head == null && index > 1) || (head != null && index > size) || index < 1) {
            throw new IncorrectIndexException("Index must be from 1 to size+1 (inclusive). Current index: "
                    + index + ", size of list: " + size);
        }
    }

    @Override
    public E get(int index) throws IncorrectIndexException {

        CheckedIndexAndHead(index);

        Node current = head;
        int counter = 1;

        while (true) {
            if (counter == index) {
                return (E) current.getElement();
            }

            current = current.getNextNode();
            counter++;
        }
    }

    @Override
    public int indexOf(E element) {

        if (head == null) {
            return -1;
        }

        Node current = head;
        int counter = 1;

        while (current.getNextNode() != null) {

            if (element == current.getElement()) {
                return counter;
            }
            current = current.getNextNode();
            counter++;
        }

        return -1;
    }

    @Override
    public E remove(int index) throws IncorrectIndexException {

        CheckedIndexAndHead(index);

        Node current = head;

        if (index == 1) {
            head = head.getNextNode();
            size--;
            return (E) current.getElement();
        }

        Node previous = current;
        int counter = 1;

        while (true) {
            if (counter == index) {

                if (current.getNextNode() == null) {
                    previous.setNextNode(null);
                } else {
                    previous.setNextNode(current.getNextNode());
                }
                size--;
                return (E) current.getElement();
            }
            previous = current;
            current = current.getNextNode();
            counter++;
        }
    }

    @Override
    public E set(int index, E element) throws IncorrectIndexException {

        CheckedIndexAndHead(index);

        Node current = head;

        if (index == 1) {
            head = new Node(element);
            head.setNextNode(current.getNextNode());
            return (E) current.getElement();
        }

        Node previous = head.getNextNode();
        int counter = 1;

        while (true) {

            if (counter == index) {

                previous.setNextNode(element);
                previous = previous.getNextNode();
                previous.setNextNode(current.getNextNode());
                return (E) current.getElement();
            }
            previous = current;
            current = current.getNextNode();
            counter++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public <E> E[] toArray(E[] array) {
        if(array.length<size){
            array = (E[])Array.newInstance(array.getClass().getComponentType(), size);
        }

        Object [] newArray = array;
        Node current = head;

        for(int i=0;i<size;i++){
            newArray[i] =current.getElement();
            current= current.getNextNode();
        }

        if(array.length>size){
            array[size]=null;
        }
        return array;
    }

    @Override
    public String toString() {
        String str = "[";

        if (head == null) {
            return "List is empty!";
        }

        Node current = head;

        while (true) {
            str = str.concat(String.valueOf(current.getElement()));

            if (current.getNextNode() == null) {
                str = str.concat("]");
                break;
            }
            str = str.concat(", ");

            current = current.getNextNode();
        }

        return str;
    }

    @Override
    public Iterator<E> iterator() {

        Iterator<E> iter = new Iterator<E>() {

            Node current = head;
            int counter = 1;

            @Override
            public boolean hasNext() {
                return counter < size + 1;
            }

            @Override
            public E next() {
                if (head == null || !hasNext()) {
                    throw new NoSuchElementException("Iteration has no more elements");
                }
                counter++;
                Node previous = current;
                current = current.getNextNode();

                return (E) previous.getElement();
            }
        };

        return iter;
    }
}
































