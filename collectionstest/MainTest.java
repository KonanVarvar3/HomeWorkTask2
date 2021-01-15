package com.homework2.test;

import com.homework2.linkedlist.IncorrectIndexException;

public class MainTest {
    public static void main(String[] args) throws IncorrectIndexException {
        TestCollection test = new TestCollection();

        System.out.println("Test MyLinkedList vs Java LinkedList");
        System.out.println("10000 elements\n");

        test.addMyLinkedListVsJavaLinkedList(10000);
        test.addPosMyLinkedListVsJavaLinkedList(5000);
        test.getElemMyLinkedListVsJavaLinkedList(5000);
        test.removeElemMyLinkedListVsJavaLinkedList(5000);

        System.out.println("100000 elements\n");

        test.addMyLinkedListVsJavaLinkedList(100000);
        test.addPosMyLinkedListVsJavaLinkedList(50000);
        test.getElemMyLinkedListVsJavaLinkedList(50000);
        test.removeElemMyLinkedListVsJavaLinkedList(50000);

        System.out.println("\nTest ArrayList vs LinkedList");
        System.out.println("10000 elements\n");

        test.addLinkedListVsArrayList(10000);
        test.addPosLinkedListVsArrayList(5000);
        test.addPosLinkedListVsArrayList(9999);
        test.getLinkedListVsArrayList(5000);
        test.getLinkedListVsArrayList(9999);
        test.setLinkedListVsArrayList(5000);
        test.setLinkedListVsArrayList(9999);
        test.removeLinkedListVsArrayList(5000);
        test.removeLinkedListVsArrayList(9999);

        System.out.println("100000 elements\n");

        test.addLinkedListVsArrayList(100000);
        test.addPosLinkedListVsArrayList(50000);
        test.addPosLinkedListVsArrayList(99999);
        test.getLinkedListVsArrayList(50000);
        test.getLinkedListVsArrayList(99999);
        test.setLinkedListVsArrayList(50000);
        test.setLinkedListVsArrayList(99999);
        test.removeLinkedListVsArrayList(50000);
        test.removeLinkedListVsArrayList(99999);

        System.out.println("\nHashSet, LinkedHashSet, TreeSet");
        System.out.println("10000 elements\n");

        test.addTreeVsHashVsLinkedHash(10000);
        test.removeTreeVsHashVsLinkedHash(5000);
        test.removeTreeVsHashVsLinkedHash(9999);
        test.searchTreeVsHashVsLinkedHash(5000);
        test.searchTreeVsHashVsLinkedHash(9999);

        System.out.println("100000 elements\n");

        test.addTreeVsHashVsLinkedHash(100000);
        test.removeTreeVsHashVsLinkedHash(50000);
        test.removeTreeVsHashVsLinkedHash(99999);
        test.searchTreeVsHashVsLinkedHash(50000);
        test.searchTreeVsHashVsLinkedHash(99999);

        //HashMap, LinkedHashMap, TreeMap
        System.out.println("\nHashMap, LinkedHashMap, TreeMap");
        System.out.println("10000 elements\n");

        test.putHashMapVsLinkedHashMapVsTreeMap(10000);
        test.removeHashMapVsLinkedHashMapVsTreeMap(5000);
        test.removeHashMapVsLinkedHashMapVsTreeMap(9999);
        test.getHashMapVsLinkedHashMapVsTreeMap(5000);
        test.getHashMapVsLinkedHashMapVsTreeMap(9999);

        System.out.println("100000 elements\n");

        test.putHashMapVsLinkedHashMapVsTreeMap(100000);
        test.removeHashMapVsLinkedHashMapVsTreeMap(50000);
        test.removeHashMapVsLinkedHashMapVsTreeMap(99999);
        test.getHashMapVsLinkedHashMapVsTreeMap(50000);
        test.getHashMapVsLinkedHashMapVsTreeMap(99999);
    }
}
