class N {
    N prev;
    int data;
    N next;
}

public class DoublyLinkedListDemo {
    N h, l;

    void addFirst(int val) {
        N nodeNew = new N();
        nodeNew.data = val;

        if (h == null) {
            nodeNew.next = null;
            nodeNew.prev = null;
            h = nodeNew;
            l = nodeNew;
        } else {
            nodeNew.prev = null;
            nodeNew.next = h;
            h.prev = nodeNew;
            h = nodeNew;
        }
    }

    void addLast(int val) {
        N lastNode = new N();
        lastNode.data = val;

        if (l == null) {
            lastNode.next = null;
            lastNode.prev = null;
            h = lastNode;  
            l = lastNode;
        } else {
            lastNode.prev = l;
            lastNode.next = null;
            l.next = lastNode;
            l = lastNode;
        }
    }

    void printList() {
        N temp = h;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
   
    void backPrint(){
        N temp = l;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
   
    void printDLL(){
        System.out.println("Forward Moment------------- ");
        N temp=h;
        N last=null;
       
        while(temp!=null){
            System.out.println(temp.data);
            if(temp.next==null){
                last=temp;
            }
            temp=temp.next;
           
        }
       
         System.out.println("Forward Moment------------- ");
         while(last!=null){
             System.out.println(last.data);
             last=last.prev;
         }
       
    }
   
   void deleteV(int val) {
    N temp = h;

    while (temp != null) {
        if (temp.data == val) {
            N pNode = temp.prev;
            N nNode = temp.next;

            if (pNode != null) {
                pNode.next = nNode;
            } else {
                h = nNode;
                if (h != null) {
                    h.prev = null;
                }
            }

            if (nNode != null) {
                nNode.prev = pNode;
            } else {
                l = pNode;
                if (l != null) {
                    l.next = null;
                }
            }
            System.out.println("Deleted node with value: " + val);
            printList();

            return;
        }
        temp = temp.next;
    }

    System.out.println("Node with value " + val + " not found in the list.");
}


    public static void main(String[] args) {
        DoublyLinkedListDemo list = new DoublyLinkedListDemo();

        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.addLast(30);
        list.addFirst(100);
        list.addLast(200);
        list.addFirst(59);
        list.addLast(300);

        System.out.println("Doubly Linked List in forward order:");
        list.printList();
        System.out.println("\nDoubly Linked List in backward order:");
        list.backPrint();
       
        System.out.println("---------------------------------------------- ");
       
        list.printDLL();
         
        System.out.println("---------------------------------------------- ");
        list.deleteV(2000);
    }
}
