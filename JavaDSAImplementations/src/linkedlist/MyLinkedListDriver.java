package linkedlist;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

import static linkedlist.MyLinkedList.*;

public class MyLinkedListDriver {
    public static void main(String[] args) throws IOException {


//         TODO Auto-generated method stub
        String ch;
        int check = 1;
        ArrayList<Integer> integerList = new ArrayList<>();

        try {
            MyLinkedList list = new MyLinkedList();
            String[] strNums;
            do {

                System.out.println("Enter below serial numbers to perform tasks");
                System.out.println("\n1. Insert element \n2. Insert an element at position \n3" +
                        ". Delete an element \n4. Delete at position \n5. Find the center element" +
                        " \n6. Sort the Linked List \n7. Reverse the Linked List \n8. " +
                        "Size of the Linked List \n9. Print the Linked List" );

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                int serialNumber = Integer.parseInt(reader.readLine());
                //inputAcceptor.InputElements(serialNumber);

                switch (serialNumber)
                {
                    case 1:
                    {
                        if(check != 1)
                        {
                            list.setHead(null);
                        }
                        System.out.println("Enter numbers separated by whitespace");
//                        Integer integerlines = Integer.parseInt(reader.readLine());
                        strNums = reader.readLine().split("\\s+");
//                        integerList.add(entityStrings);

                        for(int i=0 ; i< strNums.length; i++)
                        {

                            int data =  Integer.parseInt(strNums[i]);
                            list.setHead(list.insert(list, data).getHead());
                        }
                        check++;
                        break;
                    }
                    //Case 2 : Insert element in specific position
                    case 2:
                    {
                        System.out.println("Enter position and value separated by whitespace");
                        strNums = reader.readLine().split("\\s+");

                        int pos =   Integer.parseInt(strNums[0]);
                        int data =  Integer.parseInt(strNums[1]);

                        System.out.println( " Position = "+ pos + "Data = " + data );
                        list.setHead(list.InsertPos(list,pos, data).getHead());
                        System.out.println("\nElement inserted!! \nPrinting elements of Linked " +
                                "List");
                        list.printList(list);

                        break;
                    }
                    //Case 3 : Delete numbers
                    case 3:
                    {
                        System.out.println("Enter numbers to be deleted in Linked List separated " +
                                "by whitespace");
                        strNums = reader.readLine().split("\\s+");

                        for(int i=0 ; i< strNums.length; i++)
                        {
                            int deleteNumber =  Integer.parseInt(strNums[i]);
                            ;
                            list.deleteByKey(list, deleteNumber);
                        }
                        break;
                    }

                    //Case 4 : Delete at position
                    case 4:
                    {
                        System.out.println("Enter position of numbers to be deleted in Linked " +
                                "List separated by whitespace");
                        strNums = reader.readLine().split("\\s+");

                        for(int i=0 ; i< strNums.length; i++)
                        {
                            int deletePositions =  Integer.parseInt(strNums[i]);
                            list.deleteAtPosition(list, deletePositions-1);
//                            list.deleteByKey(list, deleteNumber);
                        }
                        break;
                    }

                    //Case 5 : Find the center element
                    case 5:
                    {
                        list.printMiddle();
                        break;
                    }
                    //Case 6 : Sort the Linked List
                    case 6:
                    {
                        list.head = list.mergeSort(list.head);
                        System.out.println("Sorted Linked List is");
                        list.printList(list);
                        break;
                    }
                    //Case 7 : Reverse the Linked List
                    case 7:
                    {
                        list.head = list.reverse(list.head);
                        System.out.println("Reversed Linked List is");
                        list.printList(list);
                        break;
                    }
                    //Case 8 : Size of the Linked List
                    case 8:
                    {
                        System.out.println("\nSize of Linked List = " +list.getLen() );
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Printing elements of Linked List");
                        list.printList(list);
                        break;
                    }
                    default :
                        System.out.println("Wrong Entry \n ");
                        break;
                }

                System.out.println("Do you want to do more operations? (y/n) ");
                ch = reader.readLine();
            } while (Objects.equals(ch, "y"));

        }catch (Exception e)
        {
            System.out.println("Code is not executed further due to exception : " + e);
        }


    }
}
