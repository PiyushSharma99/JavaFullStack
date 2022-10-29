package queue;

import linkedlist.MyLinkedList;
import stack.MyStackAsLinkedList;

import java.util.Stack;

public class MyQueue implements IMyQueue{

    protected Node front, rear;
    public static int size;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    class Node
    {
        protected int data;
        protected Node next;

        /*  Constructor  */
        public Node()
        {
            next = null;
            data = 0;
        }
        /*  Constructor  */
        public Node(int d,Node n)
        {
            data = d;
            next = n;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    @Override
    public void enqueue(int data)
    {

        Node nptr = new Node(data, null);
        if (rear == null)
        {
            front = nptr;
            rear = nptr;
        }
        else
        {
            rear.setNext(nptr);
            rear = rear.getNext();
        }
        size++ ;
    }

    public boolean isEmpty()
    {
        return front == null;
    }



    public int dequeue()
    {
        if (isEmpty())
        {
            System.out.println("No Elements present");
            return 0;
        }
            //throw new NoSuchElementException("Underflow Exception");
        Node ptr = front;
        front = ptr.getNext();
        if (front == null)
            rear = null;
        size-- ;
        return ptr.getData();
    }

    @Override
    public int peek()
    {
        if (rear == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return front.data;
        }
    }

    public  void searchByKey(Node q,int key)
    {
        // Store head node
        Node currNode = q, prev = null;
        MyQueueIterator iterator = new MyQueueIterator(q);
        //
        // CASE 1:
        // If head node itself holds the key to be deleted

        if (iterator.currentNode != null && iterator.currentNode.data == key) {
            //list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(key + " found ");

            // Return the updated List
            //return list;
        }

        while (iterator.currentNode != null && iterator.currentNode.data != key) {

            prev = iterator.currentNode;
            iterator.currentNode = iterator.currentNode.next;
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (iterator.currentNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = iterator.currentNode.next;

            // Display the message
            System.out.println(key + " found ");
        }

        //
        // CASE 3: The key is not present
        //

        // If key was not present in linked list
        // currNode should be null
        if (iterator.currentNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }

        // return the List
        //return list;
    }





    public  int getLen()
    {

        return size;
    }



    public  void printMiddle()
    {
        if (rear != null) {
            int length = getLen();
            Node temp = front;
            int middleLength = length / 2;
            while (middleLength != 0) {
                temp = temp.next;
                middleLength--;
            }
            System.out.print("The middle element is ["
                    + temp.data + "]");
            System.out.println();
        }
    }

    @Override
    public void FrontToLast(MyQueue q,int qsize)
    {
        // Base condition
        if (qsize <= 0)
            return;

        // pop front element and push
        // this last in a queue
        q.enqueue(q.peek());
        q.dequeue();

        // Recursive call for pushing element
        FrontToLast(q, qsize - 1);
    }

    // Function to push an element in the queue
// while maintaining the sorted order
    @Override
    public void pushInQueue(MyQueue q, int temp, int qsize)
    {

        // Base condition
        if (q.isEmpty() || qsize == 0)
        {
            q.enqueue(temp);
            return;
        }

        // If current element is less than
        // the element at the front
        else if (temp <= q.peek())
        {

            // Call stack with front of queue
            q.enqueue(temp);

            // Recursive call for inserting a front
            // element of the queue to the last
            FrontToLast(q, qsize);
        }
        else
        {

            // Push front element into
            // last in a queue
            q.enqueue(q.peek());
            q.dequeue();

            // Recursive call for pushing
            // element in a queue
            pushInQueue(q, temp, qsize - 1);
        }
    }

    // Function to sort the given
// queue using recursion
    @Override
    public void sortQueue(MyQueue q)
    {

        // Return if queue is empty
        if (q.isEmpty())
            return;

        // Get the front element which will
        // be stored in this variable
        // throughout the recursion stack
        int temp = q.peek();

        // Remove the front element
        q.dequeue();

        // Recursive call
        sortQueue(q);

        // Push the current element into the queue
        // according to the sorting order
        pushInQueue(q, temp, size);
    }

    @Override
    public void reverseQueue(MyQueue q)
    {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.add(q.peek());
            q.dequeue();
        }
        while (!stack.isEmpty()) {
            q.enqueue(stack.peek());
            stack.pop();
        }
    }

    @Override
    public void PrintQueue(MyQueue q)
    {
        System.out.print("\nQueue = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.getNext() )
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getNext();
        }
        System.out.println();
    }
}
