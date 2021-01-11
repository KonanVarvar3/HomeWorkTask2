package com.homework2.linkedlist;

public class Node<E> {

    private E element;
    private Node nextNode;

    public Node(E element){
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNextNode(E element ) {
        nextNode = new Node(element);
    }

    public void setNextNode(Node nextNode ) {
        this.nextNode = nextNode;
    }
}
