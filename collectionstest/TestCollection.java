package com.homework2.test;

import com.homework2.linkedlist.IncorrectIndexException;
import com.homework2.linkedlist.MyLinkedList;

import java.util.*;

public class TestCollection {

    //                                Results
    /////////////////////////////////////////////////////////////////////////////////
    //Test MyLinkedList vs Java LinkedList

    //10000: my list add time =  0,1 (second) / java list = 0,001 (second)
    //100000: my list add time =  10,5 (second) / java list = 0,004 (second)

    //10000: my list addLast time =  0,00002 (second) / java list = 0,000001 (second)
    //100000: my list addLast time =  0,0004 (second) / java list = 0,000004 (second)

    //10000: my list addMiddle time =  0,00026 (second) / java list = 0,00008 (second)
    //100000: my list addMiddle time =  0,0026 (second) / java list = 0,00062 (second)

    //10000: my list getLast time =  0,00046 (second) / java list = 0,00001 (second)
    //100000: my list getLast time =  0,0033 (second) / java list = 0,00001 (second)

    //10000: my list getMiddle time =  0,00023 (second) / java list = 0,00007 (second)
    //100000: my list getMiddle time = 0,002  (second) / java list = 0,0006 (second)

    //10000: my list setMiddle time =  0,0003 (second) / java list = 0,002 (second)
    //100000: my list setMiddle time = 0,00007  (second) / java list = 0,0007 (second)

    //10000: my list remove last time =  0,0005 (second) / java list = 0,00001 (second)
    //100000: my list remove last time =  0,004 (second) / java list = 0,00001 (second)

    //10000: my list remove middle time =  0,00025 (second) / java list = 0,00009 (second)
    //100000: my list remove middle time =  0,0026 (second) / java list = 0,0006 (second)

    ///////////////////////////////////////////////////////////////////////////////
    //Test ArrayList vs LinkedList

    //10000: LinkedList add time = 0,0016  (second) / ArrayList = 0,0022 (second)
    //100000: LinkedList add time = 0,0035  (second) / ArrayList = 0,0085 (second)

    //10000: LinkedList addLast time = 0,000008  (second) / ArrayList = 0,00006 (second)
    //100000: LinkedList addLast time = 0,0000084  (second) / ArrayList = 0,000065 (second)

    //10000: LinkedList addMiddle time = 0,00008  (second) / ArrayList = 0,00008 (second)
    //100000: LinkedList addMiddle time = 0,0006  (second) / ArrayList = 0,0001 (second)

    //10000: LinkedList setMiddle time = 0,00007  (second) / ArrayList = 0,000008 (second)
    //100000: LinkedList setMiddle time =  0,0006 (second) / ArrayList = 0,00006 (second)

    //10000: LinkedList getLast time =  0,00001 (second) / ArrayList = 0,000005 (second)
    //100000: LinkedList getLast time = 0,00001  (second) / ArrayList = 0,000017 (second)

    //10000: LinkedList getMiddle time =  0,00008 (second) / ArrayList = 0,000005 (second)
    //100000: LinkedList getMiddle time =  0,0006 (second) / ArrayList = 0,000015 (second)

    //10000: LinkedList removeMiddle time = 0,0001  (second) / ArrayList = 0,001 (second)
    //100000: LinkedList removeMiddle time = 0,0006  (second) / ArrayList = 0,001 (second)

    //////////////////////////////////////////////////////////////////////////////////////
    //HashSet, LinkedHashSet, TreeSet

    //10000: TreeSet add time =  0,009 (second) / HashSet = 0,004 (second) / LinkedHashSet = 0,004 (second)
    //100000: TreeSet add time =  0,03 (second) / HashSet = 0,014 (second) / LinkedHashSet = 0,012 (second)

    //10000: TreeSet remove time = 0,00006  (second) / HashSet = 0,00002 (second) / LinkedHashSet = 0,000006 (second)
    //100000: TreeSet remove time = 0,0001  (second) / HashSet = 0,00002 (second) / LinkedHashSet = 0,000007 (second)

    //10000: TreeSet search time = 0,00005  (second) / HashSet = 0,00002 (second) / LinkedHashSet = 0,000005 (second)
    //100000: TreeSet search time = 0,00007 (second) / HashSet = 0,00003 (second) / LinkedHashSet = 0,000005 (second)

    ////////////////////////////////////////////////////////////////////////////////////////
    //HashMap, LinkedHashMap, TreeMap

    //10000: HashMap add time = 0,004 (second) / LinkedHashMap = 0,005 (second) / TreeMap = 0,008 (second)
    //100000: HashMap add time = 0,02 (second) / LinkedHashMap = 0,01 (second) / TreeMap = 0,03 (second)

    //10000: HashMap search time = 0,00002  (second) / LinkedHashMap = 0,000006 (second) / TreeMap = 0,00005 (second)
    //100000: HashMap search time =  0,000015 (second) / LinkedHashMap = 0,000007 (second) / TreeMap = 0,00006 (second)

    //10000: HashMap remove time = 0,00003 (second) / LinkedHashMap = 0,000008 (second) / TreeMap = 0,00007 (second)
    //100000: HashMap remove time =  0,00003 (second) / LinkedHashMap = 0,000008 (second) / TreeMap = 0,00008 (second)

    //Test MyLinkedList vs Java LinkedList

    private MyLinkedList<Integer> myList = new MyLinkedList<>();
    private LinkedList<Integer> list = new LinkedList<>();

    private long countTime(long startTime){
        long finishTime = System.nanoTime();
        return finishTime - startTime;
    }

    public void addMyLinkedListVsJavaLinkedList(int count){

        long startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            myList.add(i);
        }
        System.out.println("Add time of my list = " + countTime(startTime));

        startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        System.out.println("Add time of LinkedList = " + countTime(startTime));
    }

    public void addPosMyLinkedListVsJavaLinkedList(int index) throws IncorrectIndexException {

        long startTime = System.nanoTime();
        myList.add(index,3);
        System.out.println("Add " + index + " position time of my list = " + countTime(startTime));

        startTime = System.nanoTime();
        list.add(index,3);
        System.out.println("Add " + index + " position time of LinkedList = " + countTime(startTime));
    }

    public void getElemMyLinkedListVsJavaLinkedList(int index) throws IncorrectIndexException {

        long startTime = System.nanoTime();
        myList.get(index);
        System.out.println("Get " + index + " time of my list = " + countTime(startTime));

        startTime = System.nanoTime();
        list.get(index);
        System.out.println("Get " + index + " time of LinkedList = " + countTime(startTime));
    }

    public void removeElemMyLinkedListVsJavaLinkedList(int index) throws IncorrectIndexException {

        long startTime = System.nanoTime();
        myList.remove(index);
        System.out.println("Remove " + index + " time of my list = " + countTime(startTime));

        startTime = System.nanoTime();
        list.remove(index);
        System.out.println("Remove " + index + " time of LinkedList = " + countTime(startTime));
    }

    ///////////////////////////////////////////////////////////////////////////////
    //Test ArrayList vs LinkedList

    private LinkedList<Integer> linkedList = new LinkedList<>();
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public void addLinkedListVsArrayList(int count){

        long startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            arrayList.add(i);
        }
        System.out.println("Add time of ArrayList = " + countTime(startTime));

        startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            linkedList.add(i);
        }
        System.out.println("Add time of LinkedList = " + countTime(startTime));
    }

    public void addPosLinkedListVsArrayList(int index){

        long startTime = System.nanoTime();
        arrayList.add(index,3);
        System.out.println("Add " + index + " position time of ArrayList = " + countTime(startTime));

        startTime = System.nanoTime();
        linkedList.add(index,3);
        System.out.println("Add " + index + " position time of LinkedList = " + countTime(startTime));
    }

    public void setLinkedListVsArrayList(int index){

        long startTime = System.nanoTime();
        arrayList.set(index,3);
        System.out.println("Set " + index + " time of ArrayList = " + countTime(startTime));

        startTime = System.nanoTime();
        linkedList.set(index,3);
        System.out.println("Set " + index + " time of LinkedList = " + countTime(startTime));
    }

    public void getLinkedListVsArrayList(int index){

        long startTime = System.nanoTime();
        arrayList.get(index);
        System.out.println("Get " + index + " time of ArrayList = " + countTime(startTime));

        startTime = System.nanoTime();
        linkedList.get(index);
        System.out.println("Get " + index + " time of LinkedList = " + countTime(startTime));
    }

    public void removeLinkedListVsArrayList(int index){

        long startTime = System.nanoTime();
        arrayList.remove(index);
        System.out.println("Remove " + index + " time of ArrayList = " + countTime(startTime));

        startTime = System.nanoTime();
        linkedList.remove(index);
        System.out.println("Remove " + index + " time of LinkedList = " + countTime(startTime));
    }

    ////////////////////////////////////////
    //HashSet, LinkedHashSet, TreeSet

    private TreeSet<Integer> treeSet = new TreeSet<>();
    private HashSet<Integer> hashSet = new HashSet<>();
    private LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

    public void addTreeVsHashVsLinkedHash(int count){

        long startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            treeSet.add(i);
        }
        System.out.println("Add time of TreeSet = " + countTime(startTime));

        startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            hashSet.add(i);
        }
        System.out.println("Add time of HashSet = " + countTime(startTime));

        startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            linkedHashSet.add(i);
        }
        System.out.println("Add time of LinkedHashSet = " + countTime(startTime));
    }

    public void removeTreeVsHashVsLinkedHash(int index){

        long startTime = System.nanoTime();
        treeSet.remove(index);
        System.out.println("Remove " + index + " time of TreeSet = " + countTime(startTime));

        startTime = System.nanoTime();
        hashSet.remove(index);
        System.out.println("Remove " + index + " time of HashSet = " + countTime(startTime));

        startTime = System.nanoTime();
        linkedHashSet.remove(index);
        System.out.println("Remove " + index + " time of LinkedHashSet = " + countTime(startTime));
    }

    public void searchTreeVsHashVsLinkedHash(int index){

        long startTime = System.nanoTime();
        treeSet.contains(index);
        System.out.println("Contains " + index + " time of TreeSet = " + countTime(startTime));

        startTime = System.nanoTime();
        hashSet.contains(index);
        System.out.println("Contains " + index + " time of HashSet = " + countTime(startTime));

        startTime = System.nanoTime();
        linkedHashSet.contains(index);
        System.out.println("Contains " + index + " time of LinkedHashSet = " + countTime(startTime));
    }

    ///////////////////////////////////////////
    //HashMap, LinkedHashMap, TreeMap

    private HashMap<Integer, Integer> hashMap = new HashMap<>();
    private LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<Integer, Integer> treeMap = new TreeMap<>();

    public void putHashMapVsLinkedHashMapVsTreeMap(int count){

        long startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            hashMap.put(i,i);
        }
        System.out.println("Add time of HashMap = " + countTime(startTime));

        startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            linkedHashMap.put(i,i);
        }
        System.out.println("Add time of LinkedHashMap = " + countTime(startTime));

        startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            treeMap.put(i,i);
        }
        System.out.println("Add time of TreeMap = " + countTime(startTime));
    }

    public void getHashMapVsLinkedHashMapVsTreeMap(int index){

        long startTime = System.nanoTime();
        hashMap.get(index);
        System.out.println("Get " + index + " time of HashMap = " + countTime(startTime));

        startTime = System.nanoTime();
        linkedHashMap.get(index);
        System.out.println("Get " + index + " time of LinkedHashMap = " + countTime(startTime));

        startTime = System.nanoTime();
        treeMap.get(index);
        System.out.println("Get " + index + " time of TreeMap = " + countTime(startTime));
    }

    public void removeHashMapVsLinkedHashMapVsTreeMap(int index){

        long startTime = System.nanoTime();
        hashMap.remove(index);
        System.out.println("Remove " + index + " time of HashMap = " + countTime(startTime));

        startTime = System.nanoTime();
        linkedHashMap.remove(index);
        System.out.println("Remove " + index + " time of LinkedHashMap = " + countTime(startTime));

        startTime = System.nanoTime();
        treeMap.remove(index);
        System.out.println("Remove " + index + " time of TreeMap = " + countTime(startTime));
    }
}


























