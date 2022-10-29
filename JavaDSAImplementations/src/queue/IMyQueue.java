package queue;

import stack.MyStackAsLinkedList;

import java.util.Stack;

public interface IMyQueue {

    public void PrintQueue(MyQueue q);

    void enqueue(int data);


    public boolean isEmpty();




    public int dequeue();


    public int peek();


    public  void searchByKey(MyQueue.Node q, int key);





    public  int getLen();



    public  void printMiddle();


    public void FrontToLast(MyQueue q,int qsize);


    // Function to push an element in the queue
// while maintaining the sorted order
     void pushInQueue(MyQueue q,int temp, int qsize);


    // Function to sort the given
// queue using recursion
     void sortQueue(MyQueue q);


     void reverseQueue(MyQueue q);



}
