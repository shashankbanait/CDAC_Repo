class Node {
    int data;
    Node next;
}

public class SinglyLinkedList {
    Node head;

    void addFirst(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void addLast(int val) {
        Node newNode = new Node();
        newNode.data = val;

        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }
    void deleteNode(int val){
        if(head.data == val){
            head = head.next;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                if(temp.next.data==val){
                    temp.next = temp.next.next;
                    break;
                }
            }
        }
    }
    boolean searchNode(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data==val){
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList s11 = new SinglyLinkedList();
        s11.addFirst(44);
        s11.addFirst(77);
        s11.addFirst(88);
        s11.addLast(45);
        s11.addFirst(34);

        s11.printList();

        s11.deleteNode(45);
        s11.printList();
    }
}
