/**

 --Implement a linked list (with insert and delete functions)
 Find the Nth element in a linked list
 Remove the Nth element of a linked list
 Check if a linked list has cycles
 Given a circular linked list, find the node at the beginning of the loop. Example: A-->B-->C --> D-->E -->C, C is the node that begins the loop
 Check whether a link list is a palindrome
 Reverse a linked list iteratively and recursively

 
 */
public class LinkedList {

    public class Node {
        int value;
        Node next;

        public Node(int val){
            value = val;
        }

        public void getValue(){
            System.out.println(value);
        }
    }

    private Node first;

    public LinkedList(){
        first = null;
    }


    public Node insertNode(int val){

        Node newNode = new Node(val);
        newNode.next=first;
        first = newNode;

        return first;
    }
    public Node deleteNode(){
        Node temp = first;
        first = first.next;

        return temp;
    }


    public void printNodes(){
        Node aNode = first;

        while(aNode != null){
            System.out.println(aNode.value);
            aNode = aNode.next;
        }
    }

    public static void main(String args[]){
        System.out.print("duur");

        LinkedList llist = new LinkedList();
        llist.insertNode(4);
        llist.insertNode(10);
        llist.insertNode(2);
        llist.insertNode(9);
        llist.insertNode(1112);
        llist.insertNode(59);
        llist.insertNode(68752);
        llist.insertNode(559234);
        llist.insertNode(2544);
        llist.insertNode(93);
        llist.insertNode(21);
        llist.insertNode(900);

        llist.printNodes();

        //llist.first.getValue();
      //  System.out.println(llist);

        //Node testnode = new Node(5);
        //System.out.println(testnode.value);
    }
}
