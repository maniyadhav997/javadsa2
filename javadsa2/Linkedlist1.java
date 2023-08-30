public class Linkedlist1 {
    public static void display(Node head){
       /*  Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }*/
        if(head==null) return ;
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static int length(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static class Node{
        int data;//value;
        Node next;//address of next
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
         Node a=new Node(2);
          Node b=new Node(3);
           Node c=new Node(4);
            Node d=new Node(5);
             Node e=new Node(6);
             a.next=b;
             b.next=c;
             c.next=d;
             d.next=e;
             //Node temp=a;
            /*  while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
             }*/
             display(a);   
             System.out.println("lenght is  "+length(a));    
    }
    
}
