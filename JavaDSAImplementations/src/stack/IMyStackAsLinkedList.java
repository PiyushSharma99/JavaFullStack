package stack;


public interface IMyStackAsLinkedList {

        public boolean isEmpty();

        public void push(int data);


        public int pop();


        public int peek();



        public void PrintStack(stack.MyStackAsLinkedList s);



        public  int getLen();


        public  void searchByKey(stack.MyStackAsLinkedList.StackNode stack, int key);

        public  void printMiddle();


        // Java program to sort a Stack using recursion
// Note that here predefined Stack class is used
// for stack operation

        // Recursive Method to insert an item x in sorted way
         void sortedInsert(stack.MyStackAsLinkedList s, int x);




        // Method to sort stack
        void sortStack(stack.MyStackAsLinkedList s);





        // Below is a recursive function
        // that inserts an element
        // at the bottom of a stack.
         void insert_at_bottom(stack.MyStackAsLinkedList s, char x);


        // Below is the function that
        // reverses the given stack using
        // insert_at_bottom()
         void reverse(MyStackAsLinkedList s);


}
