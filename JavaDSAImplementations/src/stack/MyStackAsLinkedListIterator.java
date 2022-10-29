package stack;

import linkedlist.MyLinkedList;

public class MyStackAsLinkedListIterator {

    MyStackAsLinkedList.StackNode currentNode;

    public MyStackAsLinkedList.StackNode getCurrentNode() {
        return currentNode;
    }

    public MyStackAsLinkedListIterator(MyStackAsLinkedList.StackNode firstNode)
    {
        currentNode = firstNode;
    }

    public boolean hasNext()
    {
        return currentNode != null;
    }

    public MyStackAsLinkedList.StackNode next()
    {
        MyStackAsLinkedList.StackNode temporaryNode = currentNode;
        currentNode = currentNode.next;
        return temporaryNode;
    }

}
