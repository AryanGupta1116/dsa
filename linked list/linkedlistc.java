// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class linkedlistc {
    public static class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data=data;
        }
    } 
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size;
        
        
    //function for add data in linkedlist in the end
        void add(int data){
            Node temp=new Node(data);
        
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        
        
    // function for add data in linkedlist in the startting  
        void addAtStart(int data){
            Node temp=new Node(data);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        
    // function for adding data at any index in the linkedlist
        void atAnyIndex(int data,int index){
            Node temp=head;
            Node x=new Node(data);
            if(index==length()){
                return;
            }
            else if(index==0){
                addAtStart(data);
            }
            
            for(int i=1;i<index;i++){
            temp=temp.next;
            }
            x.next=temp.next;
            temp.next=x;
            size++;
        } 
        
        
    // function for printing
        void print(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        
    // function for get data data 
        int getAt(int idx){
            Node temp=head;
            if(idx==0){
                return head.data;
            }
            else if(idx<0||idx>=length()){
                return -1;
                
            }
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    // function for count theb element in the linkedlist
        int length(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public void Node sum(Node a,Node b){
        Node sum=new Node(0);
        Node dummy=sum;
        Node temp=a;
        Node temp2=b;
        int tens=0;
        while(a!=null && b!=null){
            int add=temp.data+temp2.data;
            Node n=new Node(add);
            
            if(add<10){
                dummy.next=n;
            }
            else{
                Node ones=new Node(n.data%10);
                

                tens=add/10;
                dummy.next=ones;
            }
        }
        display(sum);
    }
    public void display(Node a){
        Node temp=a;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
   
    
    public static void main(String[] args) {
        linkedlist a = new linkedlist();
        linkedlist b=new linkedlist();
        a.add(5);
       /* Node b=new Node(8);
        Node c=new Node(9);
        Node d=new Node(6);
        Node e=new Node(2);
        Node f=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;*/
        a.add(5);
        a.add(7);
        a.add(6);
        b.add(2);
        b.add(3);
        b.add(4);
       sum(a,b);
    }
}
/* method 
1. add()
2. addAtStart()
3. addAtAnyIndex()
4. print()
5. getAt()
6. length()
*/