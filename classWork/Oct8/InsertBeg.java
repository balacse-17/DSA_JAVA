package Oct8;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertBeg {
    public Node head = null;
    public void insertBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }   
    public static void main(String[] args) {
        InsertBeg i = new InsertBeg();
        i.insertBeginning(0);
        i.insertBeginning(1);
        i.insertBeginning(2);
        i.display();
    }
}
