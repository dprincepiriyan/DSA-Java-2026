public class Doubly_Linked_list {
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
    public static void main(String[] args){
        Node f_Node=new Node(10);
        Node s_Node=new Node(20);
        Node t_Node=new Node(30);
        Node fo_Node=new Node(40);
        f_Node.next=s_Node;
        s_Node.prev=f_Node;
        s_Node.next=t_Node;
        t_Node.prev=s_Node;
        t_Node.next=fo_Node;
        fo_Node.prev=t_Node;
        Node curr_node=f_Node;
        while(curr_node!=null){
            System.out.print(curr_node.data+" <-> ");
            curr_node=curr_node.next;
        }
        System.out.print("null");
        Node curr_node1=fo_Node;
        System.out.println();
        while (curr_node1!=null) {
            System.out.print(curr_node1.data+" <-> ");
            curr_node1=curr_node1.prev;
        }
    System.out.print("null");
    }
}
