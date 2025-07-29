class Node{
    int val;
    Node next;
    Node(int data){
        val=data;
    }
}

public class circularlinkedlist {
    private Node head;
    private Node tail;
    private int size;

    public void insert(int value){
        Node data=new Node(value);
        if(head==null){
            head=data;
            tail=data;
            data.next=head;
            return;
        }
        tail.next=data;
        tail=data;
        tail.next=head;   
        size++;

       }

       public void insertAny(int value,int idx){
        Node data=new Node(value);
        Node temp=head;
        if(idx<0 ||idx>size-1) return;
        if(idx==0) {
            insertBeg(value);
            return;
        }
        if(size==size-1){
            insertEnd(value);
            return;
        }
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
         Node t=temp.next.next;
         temp.next=data;
         data.next=t;
       }

       public void insertEnd(int value){
        Node data=new Node(value);
        if(head==null){
            head=data;
            tail=data;
            data.next=head;
            size++;
            return;
        }
        insert(value);
       }

       public void insertBeg(int value){
        Node data=new Node(value);
        if(head==null){
            head=data;
            tail=data;
            data.next=head;
            return;
        }
        data.next=head;
        head=data;
        tail.next=head;
        size++;
       }

       public int findval(int idx){
        Node temp=head;
        if(idx<0 ||idx>size) return -1;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
       }

       public int findidx(int value){
        Node temp=head;
        if(head==null) return -1;
        for(int i=0;i<=size;i++){
            if(temp.val==value) return i;
            temp=temp.next;
        }
        return -1;
       }
       
       public void display(){
        if(head==null) {
            System.out.println("tree is null");
            return;
        }
        Node slow=head.next;
        Node fast=head.next.next;
        System.out.print(head.val+" ");
        while(slow!=fast){
            System.out.print(slow.val+" ");
            slow=slow.next;
            fast=fast.next.next;
        }
       }
       
    public static void main(String[] args) {
        circularlinkedlist head=new circularlinkedlist();
        head.insert(7);
        head.insert(4);
        head.insert(5);
        head.insert(3);
        head.insert(2);
        head.insert(9);
        head.insertBeg(10);
        head.insertEnd(11);
        head.insertAny(12,6);
        System.out.println(head.findidx(11));
        head.display();

    }
}
