package com.homework2.linkedlist;

import java.lang.Iterable;

public interface ILinkedList<E> extends Iterable {

    void add(E element);

    void add(int index, E element) throws IncorrectIndexException;

    void clear() throws EmptyListException;

    E get(int index) throws IncorrectIndexException;

    int indexOf(E element);

    E remove(int index) throws IncorrectIndexException;

    E set(int index, E element) throws IncorrectIndexException;

    int size();

    <E> E[] toArray(E[] array);

    String toString();
}
