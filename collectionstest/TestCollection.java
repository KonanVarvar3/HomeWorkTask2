package com.homework2.collectionstest;

import com.homework2.linkedlist.IncorrectIndexException;
import com.homework2.linkedlist.MyLinkedList;

import java.util.*;

public class TestCollection {

    //Test MyLinkedList vs Java LinkedList

    private MyLinkedList<Integer> myList = new MyLinkedList<>();
    private LinkedList<Integer> list = new LinkedList<>();

    private long countTime(long startTime){
        long finishTime = System.nanoTime();
        return finishTime - startTime;
    }

    //10000: my list add time =  0,1 (second) / java list = 0,001 (second)
    //100000: my list add time =  10,5 (second) / java list = 0,004 (second)
    public void addMyLinkedListVsJavaLinkedList(){

        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            myList.add(i);
        }
        System.out.println("Time of my list = " + countTime(startTime));

        long startTime2 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        System.out.println("Time of LinkedList = " + countTime(startTime2));
    }

    //10000: my list addLast time =  0,00002 (second) / java list = 0,000001 (second)
    //100000: my list addLast time =  0,0004 (second) / java list = 0,000004 (second)

    //10000: my list addMiddle time =  0,00026 (second) / java list = 0,00008 (second)
    //100000: my list addMiddle time =  0,0026 (second) / java list = 0,00062 (second)
    public void addElemMyLinkedListVsJavaLinkedList() throws IncorrectIndexException {

        long startTime = System.nanoTime();
        myList.add(50000,3);
        System.out.println("Time of my list = " + countTime(startTime));

        long startTime2 = System.nanoTime();
        list.add(50000,3);
        System.out.println("Time of LinkedList = " + countTime(startTime2));
    }

    //10000: my list getElem time =  0,00046 (second) / java list = 0,00001 (second)
    //100000: my list getElem time =  0,0033 (second) / java list = 0,00001 (second)

    //10000: my list getMiddle time =  0,00023 (second) / java list = 0,00007 (second)
    //100000: my list getMiddle time = 0,002  (second) / java list = 0,0006 (second)
    public void getElemMyLinkedListVsJavaLinkedList() throws IncorrectIndexException {

        long startTime = System.nanoTime();
        myList.get(50000);
        System.out.println("Time of my list = " + countTime(startTime));

        long startTime2 = System.nanoTime();
        list.get(50000);
        System.out.println("Time of LinkedList = " + countTime(startTime2));
    }

    //10000: my list remove time =  0,0005 (second) / java list = 0,00001 (second)
    //100000: my list remove time =  0,004 (second) / java list = 0,00001 (second)
    public void removeElemMyLinkedListVsJavaLinkedList() throws IncorrectIndexException {

        long startTime = System.nanoTime();
        myList.remove(9999);
        System.out.println("Time of my list = " + countTime(startTime));

        long startTime2 = System.nanoTime();
        list.remove(9999);
        System.out.println("Time of LinkedList = " + countTime(startTime2));
    }

    ///////////////////////////////////////////////////////////////////////////////
    //Test ArrayList vs LinkedList

    private LinkedList<Integer> linkedList = new LinkedList<>();
    private ArrayList<Integer> arrayList = new ArrayList<>();

    //10000: LinkedList add time = 0,0016  (second) / ArrayList = 0,0022 (second)
    //100000: LinkedList add time = 0,0035  (second) / ArrayList = 0,0085 (second)
    public void addLinkedListVsArrayList(){

        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        System.out.println("Time of ArrayList = " + countTime(startTime));

        long startTime2 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        System.out.println("Time of LinkedList = " + countTime(startTime2));
    }

    //10000: LinkedList addLast time = 0,000008  (second) / ArrayList = 0,00006 (second)
    //100000: LinkedList addLast time = 0,0000084  (second) / ArrayList = 0,000065 (second)

    //10000: LinkedList addMiddle time = 0,00008  (second) / ArrayList = 0,00008 (second)
    //100000: LinkedList addMiddle time = 0,0006  (second) / ArrayList = 0,0001 (second)

    public void addIndexLinkedListVsArrayList(){

        long startTime = System.nanoTime();
        arrayList.add(100000,3);
        System.out.println("Time of ArrayList = " + countTime(startTime));

        long startTime2 = System.nanoTime();
        linkedList.add(100000,3);
        System.out.println("Time of LinkedList = " + countTime(startTime2));
    }

    //10000: LinkedList setMiddle time = 0,00007  (second) / ArrayList = 0,000008 (second)
    //100000: LinkedList setMiddle time =  0,0006 (second) / ArrayList = 0,00006 (second)

    public void setLinkedListVsArrayList(){

        long startTime = System.nanoTime();
        arrayList.set(50000,3);
        System.out.println("Time of ArrayList = " + countTime(startTime));

        long startTime2 = System.nanoTime();
        linkedList.set(50000,3);
        System.out.println("Time of LinkedList = " + countTime(startTime2));
    }

    //10000: LinkedList getLast time =  0,00001 (second) / ArrayList = 0,000005 (second)
    //100000: LinkedList getLast time = 0,00001  (second) / ArrayList = 0,000017 (second)

    //10000: LinkedList getMiddle time =  0,00008 (second) / ArrayList = 0,000005 (second)
    //100000: LinkedList getMiddle time =  0,0006 (second) / ArrayList = 0,000015 (second)

    public void getLinkedListVsArrayList(){

        long startTime = System.nanoTime();
        arrayList.get(50000);
        System.out.println("Time of ArrayList = " + countTime(startTime));

        long startTime2 = System.nanoTime();
        linkedList.get(50000);
        System.out.println("Time of LinkedList = " + countTime(startTime2));
    }

    //10000: LinkedList removeMiddle time = 0,0001  (second) / ArrayList = 0,001 (second)
    //100000: LinkedList removeMiddle time = 0,0006  (second) / ArrayList = 0,001 (second)

    public void removeMiddleLinkedListVsArrayList(){

        long startTime = System.nanoTime();
        arrayList.remove(50000);
        System.out.println("Time of ArrayList = " + countTime(startTime));

        long startTime2 = System.nanoTime();
        linkedList.remove(50000);
        System.out.println("Time of LinkedList = " + countTime(startTime2));
    }

    ////////////////////////////////////////
    //HashSet, LinkedHashSet, TreeSet

    private TreeSet<Integer> treeSet = new TreeSet<>();
    private HashSet<Integer> hashSet = new HashSet<>();
    private LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

    //10000: TreeSet add time =  0,009 (second) / HashSet = 0,004 (second) / LinkedHashSet = 0,004 (second)
    //100000: TreeSet add time =  0,03 (second) / HashSet = 0,014 (second) / LinkedHashSet = 0,012 (second)
    public void addTreeVsHashVsLinkedHash(){

        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            treeSet.add(i);
        }
        System.out.println("Time of TreeSet = " + countTime(startTime));

        long startTime2 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);
        }
        System.out.println("Time of HashSet = " + countTime(startTime2));

        long startTime3 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedHashSet.add(i);
        }
        System.out.println("Time of LinkedHashSet = " + countTime(startTime3));
    }

    //10000: TreeSet remove time = 0,00006  (second) / HashSet = 0,00002 (second) / LinkedHashSet = 0,000006 (second)
    //100000: TreeSet remove time = 0,0001  (second) / HashSet = 0,00002 (second) / LinkedHashSet = 0,000007 (second)

    public void removeTreeVsHashVsLinkedHash(){

        long startTime = System.nanoTime();
        treeSet.remove(50000);
        System.out.println("Time of TreeSet = " + countTime(startTime));

        long startTime2 = System.nanoTime();
        hashSet.remove(50000);
        System.out.println("Time of HashSet = " + countTime(startTime2));

        long startTime3 = System.nanoTime();
        linkedHashSet.remove(50000);
        System.out.println("Time of LinkedHashSet = " + countTime(startTime3));
    }

    //10000: TreeSet search time = 0,00005  (second) / HashSet = 0,00002 (second) / LinkedHashSet = 0,000005 (second)
    //100000: TreeSet search time = 0,00007 (second) / HashSet = 0,00003 (second) / LinkedHashSet = 0,000005 (second)

    public void searchTreeVsHashVsLinkedHash(){

        long startTime = System.nanoTime();
        treeSet.contains(50000);
        System.out.println("Time of TreeSet = " + countTime(startTime));

        long startTime2 = System.nanoTime();
        hashSet.contains(50000);
        System.out.println("Time of HashSet = " + countTime(startTime2));

        long startTime3 = System.nanoTime();
        linkedHashSet.contains(50000);
        System.out.println("Time of LinkedHashSet = " + countTime(startTime3));
    }


    ///////////////////////////////////////////
    //HashMap, LinkedHashMap, TreeMap

    private HashMap<Integer, Integer> hashMap = new HashMap<>();
    private LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<Integer, Integer> treeMap = new TreeMap<>();

    //10000: HashMap add time = 0,004 (second) / LinkedHashMap = 0,005 (second) / TreeMap = 0,008 (second)
    //100000: HashMap add time = 0,02 (second) / LinkedHashMap = 0,01 (second) / TreeMap = 0,03 (second)

    public void putHashMapVsLinkedHashMapVsTreeMap(){

        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            hashMap.put(i,i);
        }
        System.out.println("Time of HashMap = " + countTime(startTime));

        long startTime2 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedHashMap.put(i,i);
        }
        System.out.println("Time of LinkedHashMap = " + countTime(startTime2));

        long startTime3 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            treeMap.put(i,i);
        }
        System.out.println("Time of TreeMap = " + countTime(startTime3));
    }

    //10000: HashMap search time = 0,00002  (second) / LinkedHashMap = 0,000006 (second) / TreeMap = 0,00005 (second)
    //100000: HashMap search time =  0,000015 (second) / LinkedHashMap = 0,000007 (second) / TreeMap = 0,00006 (second)

    public void searchHashMapVsLinkedHashMapVsTreeMap(){

        long startTime = System.nanoTime();
        hashMap.get(50000);
        System.out.println("Time of HashMap = " + countTime(startTime));

        long startTime2 = System.nanoTime();
        linkedHashMap.get(50000);
        System.out.println("Time of LinkedHashMap = " + countTime(startTime2));

        long startTime3 = System.nanoTime();
        treeMap.get(50000);
        System.out.println("Time of TreeMap = " + countTime(startTime3));
    }

    //10000: HashMap add time = 0,00003 (second) / LinkedHashMap = 0,000008 (second) / TreeMap = 0,00007 (second)
    //100000: HashMap add time =  0,00003 (second) / LinkedHashMap = 0,000008 (second) / TreeMap = 0,00008 (second)

    public void removeHashMapVsLinkedHashMapVsTreeMap(){

        long startTime = System.nanoTime();
        hashMap.remove(50000);
        System.out.println("Time of HashMap = " + countTime(startTime));

        long startTime2 = System.nanoTime();
        linkedHashMap.remove(50000);
        System.out.println("Time of LinkedHashMap = " + countTime(startTime2));

        long startTime3 = System.nanoTime();
        treeMap.remove(50000);
        System.out.println("Time of TreeMap = " + countTime(startTime3));
    }
}


























