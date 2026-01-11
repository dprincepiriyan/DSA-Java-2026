public class linked_list {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node firstNode=new Node(10);
        Node secondNode=new Node(20);
        Node thirdNode=new Node(30);
        Node forthNode=new Node(40);
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        Node currNode=firstNode;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
    }
    System.out.print("null");
    }
}
