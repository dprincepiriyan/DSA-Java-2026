public class linked_list {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static int FindLowest(Node head){
        int min=head.data;
        Node curr=head;
        while(curr!=null){
            if(curr.data<min){
                min=curr.data;
            }
            curr=curr.next;
        }
        return min;
    }
    //delete a specific node from linked list
    public static Node deleteSpecificNode(Node head,Node nodetoDelete){
        if(head==null ||nodetoDelete==null){
            return head;
        }
        if(head==nodetoDelete){
            return head.next;
        }
        Node curr=head;
        while(curr!=null && curr.next!=nodetoDelete){
            curr=curr.next;
        }
        if(curr!=null){
            curr.next=nodetoDelete.next;
        }
        return head;
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
        System.out.println("Lowest value in the list: " + FindLowest(firstNode));
        System.out.print("null");
        System.out.println();
        firstNode=deleteSpecificNode(firstNode,thirdNode);
        currNode=firstNode;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.print("null");
    }
}
