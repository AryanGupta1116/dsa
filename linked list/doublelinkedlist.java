
class node{
    int val;
    node next,prev;
    node(int data){
        val=data;
    }
}
 class dlnkd{
    private node head;
    private node tail;
    private int size=0;

    public void insert(int data){
        node nnode=new node(data);
        if(head==null){
            head=nnode;
            tail=nnode;
        }
        else{
            tail.next=nnode;
            nnode.prev=tail;
            tail=nnode;
        }
        size++;
    }
    
    public void insertBeg(int data){
        node a =new node(data);
        if (head == null) {
            head = a;
            tail = a;
        } 
        else {
            head.prev = a;
            a.next = head;
            head = a;
        }
        size++;
    }

    public void insertidx(int data,int idx){
        if (idx < 0 || idx > size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (idx == 0) {
            insertBeg(data);
            return;
        }
        node nnode=new node(data);
        node temp=head;
        for(int i=0;i<idx-1;i++){
            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp=temp.next;
        }
        node nxt=temp.next;
        temp.next=nnode;
        nnode.prev=temp;
        nnode.next=nxt;
        size++;   
    }

    public void deleteAtEnd(){
        if(head==null) return;
        if (head == tail) { 
            head = null;
            tail = null;
        }
        else{
        tail=tail.prev;
        tail.next=null;
        }
        size--;
    }

    public void deleteAtBeg(){
        if(head==null) return;
        if (head == tail) { 
            head = null;
            tail = null;
        }
        else{
        head=head.next;
        head.prev=null;
        }
        size--;
    }

    public void deleteAtAny(int idx){
        if (idx < 0 || idx >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        if(idx==0){
            deleteAtBeg();
            return;
        }
        if(idx==size-1){
            deleteAtEnd();
            return;
        }
        node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        node t= temp.next.next;
        temp.next=t;
        if (t != null) {
            t.prev = temp;
        }
        
        size--;

        
    }

    public int findidx(int data){
        node temp=head;
        int idx=-1;
        if(head==null) return idx;
        while(temp!=null){
            idx++;
            if(temp.val==data) return idx;
            temp=temp.next;
        }
        return -1;
    }

    public int findData(int idx){
        if(idx<0 || idx>size) return -1;
        node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }

    public void forwardDisplay(){
        node temp=head;
        while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
        }
    } 
    
    public void backwardDisplay(){
        node temp=tail;
        while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.prev;
        }
    } 

}     
    public class doublelinkedlist{
	public static void main(String[] args) {
		dlnkd head=new dlnkd();
        head.insert(6);
        head.insert(7);
        head.insert(8);
        head.insert(1);
        head.insert(2);
        head.insertidx(9,2);
		head.forwardDisplay();
	    System.out.println();
        //head.deleteAtEnd();
        //head.deleteAtBeg();
        //head.deleteAtAny(5);
        //head.backwardDisplay();
        System.out.println(head.findData(7));
	}

}
