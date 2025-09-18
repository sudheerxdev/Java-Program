package LinkedListPractice.java.CircularLL;
 class CircularLL2{
     Node head ;
     Node tail ;
     void addhead(int data){
         // creating the node
         Node newnode = new Node(data);
         if(head == null ){
             head = tail = newnode;
          
             tail.next = head;
         }
         else{
             newnode.next = head;
             head = newnode ;
             tail.next = head;
         }
     }
     void print(){
         Node ptr = head;
         while(true){
             System.out.print(ptr.data + "->");
             ptr = ptr.next;
             if(ptr == head){
                 System.out.println("back to head");
                 break;
             }
         }

     }

     public void addtail(int data) {
         Node newnode = new Node(data);
         if(head == null){
             // no node is present
             head = tail = newnode;
             tail.next = head;
         }
         else{
             tail.next = newnode;
             tail = newnode;
             tail.next = head;
         }
     }
 }
 class CLLDemo2{
     public static void main(String args[]){
         CircularLL2 obj = new CircularLL2();
         obj.addhead(123);
         obj.addhead(1223);
         obj.addhead(1232);
         obj.addhead(12326);
         obj.addhead(12324);
         obj.addtail(12345);
         obj.print();
     }

 }
