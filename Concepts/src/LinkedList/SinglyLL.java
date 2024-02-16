package LinkedList;

public class SinglyLL {
    class Node {
        Node head;
        int num;
        Node next;

        Node(int num) {
            this.num = num;
            this.next = null;
        }
        public void addFirst(int num) {
            Node newNode = new Node(num);
            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void addLast(int num) {
            Node newNode = new Node(num);
            if(head == null) {
                head = newNode;
                return;
            }
            Node curnode = head;
            while(curnode != null) {
                curnode = curnode.next;
            }
            curnode.next = newNode;
        }
        public void PrintList() {
            if (head == null) {
                System.out.print("List is empty");
                return;
            }
            Node curnode = head;
            while(curnode.next != null) {
                System.out.print(curnode.num + " -> ");
                curnode = curnode.next;
            }
            System.out.print("null");
        }
    }

    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

    }
}