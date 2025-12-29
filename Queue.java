class Queue {

   // static class queue {
   // int arr[];
   // int size;
   // int rear = -1;

   // queue(int n) {
   // arr = new int[n];
   // this.size = n;
   // }

   // public boolean isEmpty() {
   // return rear == -1;
   // }

   // public void add(int data) {
   // if (rear == size - 1) {
   // System.out.println("full");
   // return;
   // }
   // rear++;
   // arr[rear] = data;

   // }

   // public void remove() {
   // if (isEmpty()) {
   // return;
   // }
   // int front = arr[0];
   // for (int i = 0; i < rear; i++) {
   // arr[i] = arr[i + 1];
   // }
   // rear--;
   // }

   // public int peek() {
   // if (isEmpty()) {
   // return -1;
   // }
   // return arr[0];
   // }

   // public static void main(String[] args) {
   // queue qu = new queue(4);
   // qu.add(2);
   // qu.add(3);
   // // qu.add(4);
   // // qu.add(5);
   // // qu.add(6);
   // while (!qu.isEmpty()) {
   // System.out.println(qu.peek());
   // qu.remove();
   // }

   // }
   // }
   static class Node {
      int data;
      Node next;

      Node(int data) {
         this.data = data;
         this.next = null;
      }

      static class queueL {
         Node head = null;
         Node tail = null;

         public boolean isEmpty() {
            return tail == null;
         }

         public void add(int data) {
            Node node = new Node(data);
            if (isEmpty()) {
               head = tail = node;
            }
            tail.next = node;
            tail = node;

         }

         public void remove() {
            if (isEmpty()) {
               System.out.println("empty");
               return;
            }
            if (head == tail) {
               tail = null;
            }
            head = head.next;
            return;
         }
      }
   }
}