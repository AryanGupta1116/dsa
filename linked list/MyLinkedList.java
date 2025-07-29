class MyLinkedList {
    public class Node{
        int val;
        Node next;
        Node(int data){
            val=data;
        }
    }

    private Node head;
    private int size;
    
    public MyLinkedList() {
        Node head=null;
        Node tail=null;
        int size=0;
        
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1; // Return -1 if the index is invalid
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
        
    }
    
    public void addAtHead(int val) {
         Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
        
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        Node temp=new Node(val);
        Node curr=head;
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        for(int i=0;i<index-1;i++){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return; // Do nothing if the index is invalid
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */