
class Node{
     int data ; 
     Node next;
     Node(int data){
        this.data = data;
        this.next = null;
     }
     public static void main(String[] args) {
         Node head = new Node(1);
         Node second = new Node(2);
         Node third = new Node(3);
         // linking part
         head.next = second;
         second.next = third;
          Node temp = head;
          while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
          }
     }

}