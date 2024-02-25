public class Stacks {
    LinkedList linkedList;
    public Stacks(){
        linkedList = new LinkedList();
    }
    public void push(int value){
        linkedList.insertNode(value,0);
        System.out.println("Inserted Value in Stack :" + value);
    }
//    isEmpty
    public boolean isEmpty(){
        if(linkedList.head==null){
            return true;
        }else{
            return false;
        }
    }
    public int pop(){
        int result = -1;
        if(isEmpty()){
            System.out.println("Stack is empty");
            return result;
        }else{
            result = linkedList.head.value;
            linkedList.deletingNode(0);
        }
        return result;
    }
    public int peek(){
        int result = -1;
        if(isEmpty()){
            System.out.println("Stack is empty");
            return result;
        }else{
            return linkedList.head.value;
        }
    }
    public void deleteStack(){
        linkedList.head=null;
        System.out.println("The Linked List is deleted");
    }
}
