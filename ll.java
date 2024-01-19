public class LINKEDLIST {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //ADD in first
    public void addF(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    //ADD in last
    public void addL(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
    }
    //PRINT
    public void printlist(){
        Node current=head;
        if(head==null){
            System.out.println("LIST IS EMPTY");
        }
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    //DELETE first
    public void deleteF(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
        }
        head=head.next;
    }
    //DELETE last
    public void delectL(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }
    public static void main(String args[]){
        LINKEDLIST list=new LINKEDLIST();
        list.addF("a");
        list.addF("b");
        list.addF("c");
        list.printlist();
        list.addL("z");
        list.printlist();
        list.deleteF();
        list.printlist();
        list.delectL();
        list.printlist();


    }
}
