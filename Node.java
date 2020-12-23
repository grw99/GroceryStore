public class Node {
   String name;
   float price;
   Node next;
   Node previous;
   
   public Node(Node previous, String name, float price, Node next){
      this.previous = previous;
      this.name = name;
      this.price = price;
      this.next = next;
   }
}