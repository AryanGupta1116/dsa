class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class sum {
    public static  void sum1(Node a,Node b){
        Node sum=new Node(0);
        Node dummy=sum;
        Node temp=a;
        Node temp2=b;
        int tens=0;
        while(temp!=null && temp2!=null){
            int add=temp.data+temp2.data;
            
            if(tens!=0){
            add+=tens;
            }
            Node n=new Node(add);
            
            if(add<10){
                dummy.next=n;
            }
            else{
                Node ones=new Node(n.data%10);
                tens=add/10;
                dummy.next=ones;
            }
            dummy=dummy.next;
            temp=temp.next;
            temp2=temp2.next;
        }
        display(sum);
    }

    public static void display(Node a){
        Node temp=a.next;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
    public static void main(String args[]){
        Node a1=new Node(6);
        Node a2=new Node(7);
        Node a3=new Node(5);
        Node b1=new Node(2);
        Node b2=new Node(3);
        Node b3=new Node(1);
        a1.next=a2;
        a2.next=a3;
        b1.next=b2;
        b2.next=b3;
        sum1(a1,b1);
    }
}
