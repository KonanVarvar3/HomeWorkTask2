All results are shown in the class TestCollection. There tested my 
list too and is slower than java LinkedList because my list is singly linked.

a)ArrayList vs LinkedList

If you need to add many elements or remove elements of the
collection - use LinkedList.

If you need to get and set many elements - use ArrayList.

b)HashSet vs LinkedHashSet vs TreeSet

If you need to add many elements - use HashSet or LinkedHashSet.

If you need to remove or search elements - use LinkedHashSet.

c) HashMap vs LinkedHashMap vs TreeMap

If you need to put many elements - use LinkedHashMap (everything is almost equal).

If you need to search or remove elements - use LinkedHashMap.





