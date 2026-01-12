public class Circular_Double_linked_list {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static void main(String[] args) {
        Node f_node=new Node(10);
        Node s_node=new Node(20);
        Node t_node=new Node(30);
        Node fo_node=new Node(40);
        f_node.next=s_node;
        s_node.prev=f_node;
        s_node.next=t_node;
        t_node.prev=s_node;
        t_node.next=fo_node;
        fo_node.prev=t_node;
        fo_node.next=f_node; // Making the list circular
        f_node.prev=fo_node;
        Node curr_node=f_node;
        do{
            System.out.print(curr_node.data+" <-> ");
            curr_node=curr_node.next;
        } while(curr_node != f_node);
        System.out.print("null");
    }
}

