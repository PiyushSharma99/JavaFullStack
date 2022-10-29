package queue;

import linkedlist.MyLinkedList;

public class MyQueueIterator {

    MyQueue.Node currentNode;

    public MyQueue.Node getCurrentNode() {
        return currentNode;
    }

    public MyQueueIterator(MyQueue.Node firstNode)
    {
        currentNode = firstNode;
    }


    public boolean hasNext()
    {
        return currentNode != null;
    }

    public MyQueue.Node next()
    {
        MyQueue.Node temporaryNode = currentNode;
        currentNode = currentNode.next;
        return temporaryNode;
    }
}
