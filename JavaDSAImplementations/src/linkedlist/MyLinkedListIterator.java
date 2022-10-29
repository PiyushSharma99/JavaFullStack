package linkedlist;

public class MyLinkedListIterator {

    MyLinkedList.Node currentNode;

    public MyLinkedListIterator(MyLinkedList.Node firstNode)
    {
        currentNode = firstNode;
    }


    public boolean hasNext()
    {
        return currentNode != null;
    }

    public MyLinkedList.Node next()
    {
        MyLinkedList.Node temporaryNode = currentNode;
        currentNode = currentNode.next;
        return temporaryNode;
    }
}
