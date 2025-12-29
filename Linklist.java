class Linklist {

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void addFirst(String data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
        // System.out.println("Added");
    }

    public void printList() {
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data);
            currnode = currnode.next;
        }
        System.out.println("Null");

    }

    public void reverseList() {
        Node prev = head;
        Node curr = head.next;
        Node nxt = curr.next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
    }

    public static void main(String[] args) {
        Linklist link = new Linklist();
        link.addFirst("hey->");
        link.addFirst("this->");
        link.addFirst("a->");
        link.addFirst("program->");
        link.printList();
        link.reverseList();
        link.printList();
    }
}
