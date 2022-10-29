package linkedlist;
import java.io.*;

public class MyLinkedList implements IMyLinkedList{

    Node head; // head of list

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    // Linked list Node.
    // Node is a static nested class
    // so main() can access it
    public static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
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

    // **************INSERTION**************

    // Method to insert a new node
    @Override
    public  MyLinkedList insert(MyLinkedList list,int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }


//    @Override
    public  MyLinkedList InsertPos(MyLinkedList list, int position, int data) {


        Node currentData = new Node(data);

        Node prev = head;
        System.out.println("Prev = " + prev.getData());
        int count =0 ;
        if(position == 1)
        {
            currentData.next = prev;
            list.head = currentData;
            return list;
        }
        while (count!= position-2)
        {
            prev = prev.next;
            count++;
        }

        currentData.next = prev.next;
        prev.next = currentData;
        return list;
    }

    public  int getLen()
    {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    /*Printing the middle element of the list.*/
    public  void printMiddle()
    {
        if (head != null) {
            int length = getLen();
            Node temp = head;
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

    // Recursive Java program to reverse
    // a linked list
    @Override
        public  Node reverse(Node head)
        {
            if (head == null || head.next == null)
                return head;

		/* reverse the rest list and put
		the first element at the end */
            Node rest = reverse(head.next);
            head.next.next = head;

            /* tricky step -- see the diagram */
            head.next = null;

            /* fix the head pointer */
            return rest;
        }



    // **************DELETION BY KEY**************

    // Method to delete a node in the MyLinkedList by KEY
     @Override
    public  MyLinkedList deleteByKey(MyLinkedList list,int key)
    {
        // Store head node
        Node currNode = list.head, prev = null;

        //
        // CASE 1:
        // If head node itself holds the key to be deleted

        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(key + " found and deleted");

            // Return the updated List
            return list;
        }

        //
        // CASE 2:
        // If the key is somewhere other than at head
        //

        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null && currNode.data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;

            // Display the message
            System.out.println(key + " found and deleted");
        }

        //
        // CASE 3: The key is not present
        //

        // If key was not present in linked list
        // currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }

        // return the List
        return list;
    }

        public Node sortedMerge(Node a, Node b)
        {
            Node result = null;

            // Base cases
            if (a == null)
                return b;
            if (b == null)
                return a;

            // Pick either a or b, and recur
            if (a.data < b.data) {
                result = a;
                result.next = sortedMerge(a.next, b);
            }
            else {
                result = b;
                result.next = sortedMerge(a, b.next);
            }

            return result;
        }

    @Override
    public Node mergeSort(Node h)
        {
            // Base case : if head is null
            if (h == null || h.next == null) {
                return h;
            }

            // get the middle of the list
            Node middle = getMiddle(h);
            Node nextofmiddle = middle.next;

            // set the next of middle node to null
            middle.next = null;

            // Apply mergeSort on left list
            Node left = mergeSort(h);

            // Apply mergeSort on right list
            Node right = mergeSort(nextofmiddle);

            // Merge the left and right lists
            Node sortedlist = sortedMerge(left, right);

            return sortedlist;
        }

       @Override // Utility function to get the middle of the linked list
        public Node getMiddle(Node head)
        {
            if (head == null)
                return head;

            Node slow = head, fast = head;

            while (fast.next != null
                    && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

    @Override
    public  MyLinkedList   deleteAtPosition(MyLinkedList list, int index)
    {
        // Store head node
        Node currNode = list.head, prev = null;

        if (index == 0 && currNode != null) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(
                    index + " position element deleted");

            // Return the updated List
            return list;
        }

          int counter = 0;
        while (currNode != null) {

            if (counter == index) {

                prev.next = currNode.next;

                System.out.println(
                        index + " position element deleted");
                break;
            }
            else {

                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        if (currNode == null) {
            // Display the message
            System.out.println(
                    index + " position element not found");
        }
        return list;
    }

    @Override
    public  void printList(MyLinkedList list)
    {
        MyLinkedListIterator iterator = new MyLinkedListIterator(list.head);

        System.out.print("\nMyLinkedList: ");

        // Traverse through the MyLinkedList
        while (iterator.hasNext()) {
            // Print the data at current node
            System.out.print(iterator.next().data + " ");

        }
        System.out.println("\n");
    }

}

