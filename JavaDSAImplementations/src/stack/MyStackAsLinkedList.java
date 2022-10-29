package stack;

import linkedlist.MyLinkedList;
import linkedlist.MyLinkedListIterator;

public class MyStackAsLinkedList implements IMyStackAsLinkedList{

        StackNode head;


        public StackNode gethead() {
            return head;
        }

        public void sethead(StackNode head) {
            this.head = head;
        }

    static class StackNode {
            int data;
            StackNode next;

            StackNode(int data) { this.data = data; }
        }

        public boolean isEmpty()
        {
            if (head == null) {
                return true;
            }
            else
                return false;
        }

        public void push(int data)
        {
            StackNode newNode = new StackNode(data);

            if (head == null) {
                head = newNode;
            }
            else {
                StackNode temp = head;
                head = newNode;
                newNode.next = temp;
            }

        }

        public int pop()
        {
            int popped = Integer.MIN_VALUE;
            if (head == null) {
                System.out.println("Stack is Empty");
            }
            else {
                popped = head.data;
                head = head.next;
            }
            return popped;
        }

        public int peek()
        {
            if (head == null) {
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
            else {
                return head.data;
            }
        }
    public  int getLen()
    {
        int length = 0;
        StackNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public  void searchByKey(MyStackAsLinkedList.StackNode stack,int key)
    {

        MyStackAsLinkedList.StackNode currNode = stack, prev = null;

        MyStackAsLinkedListIterator iterator = new MyStackAsLinkedListIterator(head);


        // CASE 1:
        // If head node itself holds the key to be deleted

        if (iterator.currentNode != null && iterator.currentNode.data == key) {

            System.out.println(key + " found ");

        }

        while (iterator.currentNode  != null && iterator.currentNode .data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = iterator.currentNode ;
            iterator.currentNode  = iterator.currentNode .next;
        }

        if (iterator.currentNode  != null) {

            prev.next = iterator.currentNode.next;

            System.out.println(key + " found ");
        }
        if (iterator.currentNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }

    }

    public  void printMiddle()
    {
        if (head != null) {
            int length = getLen();
            MyStackAsLinkedList.StackNode temp = head;
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
        public void sortedInsert(MyStackAsLinkedList s, int x)
        {
            if (s.isEmpty() || x > s.peek()) {
                s.push(x);
                return;
            }
            int temp = s.pop();
            sortedInsert(s, x);
            s.push(temp);
        }


        @Override
        public void sortStack(MyStackAsLinkedList s)
        {

            if (!s.isEmpty()) {

                int x = s.pop();

                sortStack(s);

                sortedInsert(s, x);
            }
        }

       @Override
       public void insert_at_bottom(MyStackAsLinkedList s, char x)
        {

            if (s.isEmpty())
                s.push(x);

            else {

                char a = (char) s.peek();
                s.pop();
                insert_at_bottom(s,x);

                s.push(a);
            }
        }

        @Override
        public void reverse(MyStackAsLinkedList s)
        {
            MyStackAsLinkedList myStackAsLinkedList = new MyStackAsLinkedList();
            if (s.getLen() > 0) {

                char x = (char) s.peek();
                s.pop();
                reverse(s);

                insert_at_bottom(s,x);
            }
        }

    @Override
    public void PrintStack(MyStackAsLinkedList s)
    {
        if (s.isEmpty())
            return;

        int x = s.peek();
        s.pop();
        System.out.print(x + " ");
        PrintStack(s);
        s.push(x);
    }
}
