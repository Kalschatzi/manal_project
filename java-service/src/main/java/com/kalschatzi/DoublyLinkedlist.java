package main.java.com.kalschatzi;

public class DoublyLinkedlist {

 public static void main(String[] args) {

     class Node{
         // stores data
         public int data;
         // pointer to the next node
         public Node next;
         // pointer to the previous node
         public Node prev;
         // representing the head of a DLL
         Node head = null;
         // representing the tail of a DLL
         Node tail = null;

         public Node(int val, Node head, Node tail) {
             this.data = val;
             this.head = head;
             this.tail = tail;
         }

         // Function to add a node in the front of doubly linked list
         public void addNodeFront(int val) {
             // Creating a new node
             Node temp = new Node(val, head, null);
             // checking if head is null
             if(head != null )
             {
                 // Assigning temp to head.prev
                 head.prev = temp;
             }

             // Assigning temp to head
             head = temp;
             // Checking if tail is null
             if(tail == null)
             {
                 // Assigning temp to tail
                 tail = temp;
             }
             System.out.println("New node added: " + val);
         }

         // Function to add a node in the back of doubly linked list
         public void addNodeBack(int val) {
             // Creating a new node
             Node temp = new Node(val, null, tail);
             // Checking if tail is null
             if(tail != null)
             {
                 // Assigning temp to tail.next
                 tail.next = temp;
             }
             // Assigning temp to tail
             tail = temp;
             // Checking if head is null
             if(head == null)
             {
                 // Assigning temp to head
                 head = temp;
             }
             System.out.println("New node added: " + val);
         }

         // iterating through DLL - forward iteration
         public void iterateForward(){
             Node temp = head;
             while(temp != null){
                 System.out.println(temp.data);
                 temp = temp.next;
             }
         }

         // iterating through DLL - backwards iteration
         public void iterateBackward(){
             Node temp = tail;
             while(temp != null){
                 System.out.println(temp.data);
                 temp = temp.prev;
             }
         }

         // deleting items from front of a DLL
         public int removeNodeFront() {
             // assigning head to temp
             Node temp = head;
             // assigning the next pointer to the head
             // and setting the prev pointer of head to null
             head = head.next;
             head.prev = null;
             System.out.println("deleted: " + temp.data);
             // Returning the deleted item
             return temp.data;
         }

         // Function to remove the last node
         public int removeNodeBack() {
             // assigning tail to temp
             Node temp = tail;
             // assigning the prev pointer to the tail
             // and setting the next pointer of tail to null
             tail = tail.prev;
             tail.next = null;
             System.out.println("deleted: " + temp.data);
             // Returning the deleted item
             return temp.data;
         }

     }

 }
}
