package linkedlist;

public interface IMyLinkedList {


    public  MyLinkedList insert(MyLinkedList list,int data);


//     void InsertPos( int position, int data);


    public  int getLen();


    /*Printing the middle element of the list.*/
    public  void printMiddle();


    // Recursive Java program to reverse
    // a linked list
     MyLinkedList.Node reverse(MyLinkedList.Node head);

    public void printList(MyLinkedList list);


     MyLinkedList deleteByKey(MyLinkedList list,int key);
    MyLinkedList.Node sortedMerge(MyLinkedList.Node a, MyLinkedList.Node b);


    MyLinkedList.Node mergeSort(MyLinkedList.Node h);


    public MyLinkedList.Node getMiddle(MyLinkedList.Node head);
    public  MyLinkedList   deleteAtPosition(MyLinkedList list, int index);


}
