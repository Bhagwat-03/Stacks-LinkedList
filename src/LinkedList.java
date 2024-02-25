

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;
    public Node LinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size =1;
        return head;
    }
    //Insertion of Nodes in Singly Linked List
    public void insertNode(int nodeValue,int location){
        Node node = new Node();
        node.value=nodeValue;
        if(head == null){
            LinkedList(nodeValue);
            return;
        } else if (location==0) {
            node.next =head;
            head = node;
        }else if(location>=size){
            node.next= null;
            tail.next = node;
            tail = node;
        }else{
            Node tempNode = head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next=node;
            node.next = nextNode;
        }
        size++;
    }
    public void traversalLink(){
        if(head==null){
            System.out.println("SLL doesn't exist");
        }else{
            Node tempNode =head;
            for(int i=0;i<size;i++){
                System.out.println(tempNode.value);
                if(i!=size-1){
                    System.out.println("->");
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("\n ");
    }
    public boolean searchLink(int nodeValue){
        if(head!=null){
            Node tempNode = head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("The node was found at "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("The list was not found");
        return false;
    }
    public void deletingNode(int location ){
        if(head == null){
            System.out.println("List doesn't exist");
        }else{
            if(location==0){
                head = head.next;
                size--;
                if(size ==0){
                    tail = null;
                }
            } else if (location >= size) {
                Node tempNode = head;
                for (int i = 0; i < size - 1; i++) {
                    tempNode = tempNode.next;
                }
                if (tempNode == head) {
                    tail = head = null;
                    size--;
                    return;
                }
                tempNode.next = null;
                tail = tempNode;
                size--;
            } else {
                Node tempNode = head;
                for (int i = 0; i <location-1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                size--;
            }
        }
    }
    public void deleteSLL(){
        head = null;
        tail=null;
        System.out.println("The Single Linked List is deleted");
    }
}
/*
Time Complexity is O(1)
Space Complexity is also O(1)
*/

