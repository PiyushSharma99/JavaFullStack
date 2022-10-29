package queue;

import stack.MyStackAsLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class MyQueueDriver {
    public static void main(String[] args) throws IOException {

        //TODO Auto-generated method stub
        String ch;
        int check = 1;
        ArrayList<Integer> integerList = new ArrayList<>();
        MyQueue queue = new MyQueue();
        String[] strNums;
        try
        {
            do {

                System.out.println("Enter below serial numbers to perform tasks");
                System.out.println("\n1. Enqueue element \n2. Dequeue an element \n3" +
                        ". Peek an element \n4. Contains an element \n5. Size of the queue" +
                        " \n6. Center of the queue \n7. Sort the queue \n8. Reverse the queue" +
                        " \n9. Print the queue" );

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                int serialNumber = Integer.parseInt(reader.readLine());
                //inputAcceptor.InputElements(serialNumber);

                switch (serialNumber)
                {
                    case 1:
                    {
                        if(check != 1)
                        {

                            queue.setRear(null);
                        }
                        System.out.println("Enter numbers separated by whitespace");
//                        Integer integerlines = Integer.parseInt(reader.readLine());
                        strNums = reader.readLine().split("\\s+");
//                        integerstackadd(entityStrings);

                        for(int i=0 ; i< strNums.length; i++)
                        {
                            int data =  Integer.parseInt(strNums[i]);
                            queue.enqueue(data);
                        }
                        check++;
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Element " +queue.dequeue() + " is de-queued");

                        break;
                    }
                    case 3:
                    {
                        System.out.println("The element at the front of the queue is " +queue.peek());
                        break;
                    }
                    //case 4: Contains an element
                    case 4:
                    {

                        System.out.println("Enter the element to search ");
                        int searchElement = Integer.parseInt(reader.readLine());
                        queue.searchByKey(queue.getFront(),searchElement);
                        break;
                    }
                    //case 5: Size of the stack
                    case 5:
                    {
                        System.out.println("The size of the queue is " +queue.getLen());
                        break;
                    }
                    //case 6: Center of the queue
                    case 6:
                    {

                        queue.printMiddle();
                        break;
                    }
                    //case 7: Sort the queue
                    case 7:
                    {
                        System.out.println("Queue elements before sorting: ");
                        queue.PrintQueue(queue);

                        queue.sortQueue(queue);

                        System.out.println(" \n\nQueue elements after sorting:");
                        queue.PrintQueue(queue);

                        break;
                    }
                    //case 8: Reverse the queue
                    case 8:
                    {

                        System.out.println("Original Queue");
                        queue.PrintQueue(queue);

                        queue.reverseQueue(queue);

                        System.out.println("\nReversed Queue");

                        queue.PrintQueue(queue);

                        break;
                    }
                    case 9:
                    {
                        queue.PrintQueue(queue);
                        break;
                    }
                    default :
                        System.out.println("Wrong Entry \n ");
                        break;
                }

                System.out.println("\nDo you want to do more operations? (y/n) ");
                ch = reader.readLine();
            } while (Objects.equals(ch, "y"));


        }catch (Exception e)
        {
            System.out.println("Code is not executed further due to exception : " + e);
        }
    }
}
