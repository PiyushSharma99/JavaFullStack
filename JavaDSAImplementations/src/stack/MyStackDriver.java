package stack;

import linkedlist.MyLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;



public class MyStackDriver {
    public static void main(String[] args) throws IOException {

           //TODO Auto-generated method stub
        String ch;
        int check = 1;
        ArrayList<Integer> integerList = new ArrayList<>();
        MyStackAsLinkedList stack = new MyStackAsLinkedList();
        String[] strNums;
        try
        {
            do {

                System.out.println("Enter below serial numbers to perform tasks");
                System.out.println("\n1. Push element \n2. Pop an element \n3" +
                        ". Peek an element \n4. Contains an element \n5. Size of the stack" +
                        " \n6. Center of the stack \n7. Sort the stack \n8. Reverse the stack" +
                        " \n9. Print the Linked List" );

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                int serialNumber = Integer.parseInt(reader.readLine());

                switch (serialNumber)
                {
                    case 1:
                    {
                        if(check != 1)
                        {
                            stack.sethead(null);
                        }
                        System.out.println("Enter numbers separated by whitespace");
                        strNums = reader.readLine().split("\\s+");

                        for(int i=0 ; i< strNums.length; i++)
                        {
                            int data =  Integer.parseInt(strNums[i]);

                            stack.push(data);
                        }
                        check++;
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Element " +stack.pop() + "is popped");
//                    stack.pop();
                        break;
                    }
                    case 3:
                    {
                        System.out.println("The element at the top of the stack is " +stack.peek());
                        break;
                    }
                    //case 4: Contains an element
                    case 4:
                    {
                        System.out.println("Enter the element to search ");
                        int searchElement = Integer.parseInt(reader.readLine());
                        stack.searchByKey(stack.head,searchElement);
                        //System.out.println("The element at the top of the stack is " + );
                        break;
                    }
                    //case 5: Size of the stack
                    case 5:
                    {
                        System.out.println("The size of the stack is " +stack.getLen());
                        break;
                    }
                    //case 6: Center of the stack
                    case 6:
                    {
                        stack.printMiddle();
                        break;
                    }
                    //case 7: Sort the stack
                    case 7:
                    {
                        System.out.println("Stack elements before sorting: ");
                        stack.PrintStack(stack);

                        stack.sortStack(stack);

                        System.out.println(" \n\nStack elements after sorting:");
                        stack.PrintStack(stack);

                        break;
                    }
                    //case 8: Reverse the stack
                    case 8:
                    {
                        System.out.println("Original Stack");

                        stack.PrintStack(stack);

                        stack.reverse(stack);

                        System.out.println("\nReversed Stack");

                        stack.PrintStack(stack);

                        break;
                    }
                    case 9:
                    {
                        stack.PrintStack(stack);
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
