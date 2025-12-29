class LL {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node nxt = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head.next = null;
        head = prev;
    }

    public static void main(String[] args) {
        LL link = new LL();
        link.addFirst(1);
        link.addFirst(2);
        link.addFirst(3);

        link.addFirst(4);
        link.addFirst(5);
        // link.printList();
        link.reverse();
        link.printList();
    }
}
