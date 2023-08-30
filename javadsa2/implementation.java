public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedll{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void insertAt(int idx,int val){
            Node t=new Node(val);
            if(head==null){
                head=t;
                head.next=null;
            }
            if(head.next==null){
                head.next=t;
                tail=t;
            }
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        void delete(int idx){
            if(head.next==null){
                head=null;
            }
            if(idx==0){
                head=head.next;
            }
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            //tail=temp;
            size--;
            if(temp.next==null){
                tail=temp;
            }
        }
    }
    public static void main(String[] args) {
        linkedll ll=new linkedll();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
       // ll.display();
        ll.insertAt(2, 10);
        ll.display();
        System.out.println("");
        System.out.println(" tail is "+ll.tail.data);
        System.out.println(" head is "+ll.head.data);
        ll.delete(4);
        ll.display();
        System.out.println("tail is "+ll.tail.data);
    }
    
}
