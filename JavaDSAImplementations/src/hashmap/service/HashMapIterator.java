package hashmap.service;

import linkedlist.MyLinkedList;

public class HashMapIterator {
    private MyLinkedList.Node current;

    public HashMapIterator(MyLinkedList.Node first) {
        current = first;
    }

    public boolean hasNext() {
        return current != null;
    }

    public MyLinkedList.Node next() {
        MyLinkedList.Node tempo = current;
        current = current.getNext();
        return tempo;
    }
}
