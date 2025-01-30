package Linked_list_DS;

class LinkedList{

    public class Node{
        int data ;
        Node next ;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        //head and tail
        public static Node head;
        public static Node tail;

        //methodes

        public void addFirst(int data){
            // step 1 : create new node
            Node newNode = new Node(data);  //newNode

            if(head == null){
                head = tail = newNode;
                return; 
            }

            // step 2 : give referance of head node to nextNode
            newNode.next = head;  //link

            // step 3 : make the  head = newNode;
            head = newNode;
        }

    }
    
        
        
    }
    
    public class Linked_List_practice {
        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.addFirst(1);
            ll.addFirst(2);    
    }
    
}
