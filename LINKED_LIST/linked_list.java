public class linked_list {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node insertAtFront(Node head,int x){
        Node newNode=new Node(x);
        newNode.next=head;
        return newNode;
    }
    public static Node insertAfter(Node head,int key,int newData){
        Node curr=head;
        while(curr!=null){
            if(curr.data==key){
                break;
            }
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Key not found");
            return head;
        }
        Node newNode=new Node(newData);
        newNode.next=curr.next;
        curr.next=newNode;
        return head;
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
    static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.print("null");
        System.out.println();
    }
    //random questions on linked list
    //remove every k-th node from linked list
    public static Node deleteK(Node head,int k){
        if(head==null || k<=0){
            return head;
        }
        Node curr=head;
        Node prev=null;
        int count=0;
        while(curr!=null){
            count++;
            if(count%k==0){
                if(prev!=null){
                    prev.next=curr.next;
                }else{
                    head=curr.next;
                }
            }else{
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
    //find the middle of linked list
    public static int getMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        Node firstNode=new Node(10);
        Node secondNode=new Node(20);
        Node thirdNode=new Node(30);
        Node forthNode=new Node(40);
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        printList(firstNode);
        System.out.println("Lowest value in the list: " + FindLowest(firstNode));
        firstNode=deleteSpecificNode(firstNode,thirdNode);
        int w=100;
        firstNode=insertAtFront(firstNode,w);
        printList(firstNode);
        firstNode=insertAfter(firstNode,20,25);
        printList(firstNode);
        
    }
}
