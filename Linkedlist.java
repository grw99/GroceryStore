import java.util.*;

public class Linkedlist{
   static Scanner scan = new Scanner(System.in);
   Node head;
   Node tail;
   
   public Linkedlist(){
      head = tail = null;
   }
   
   public Linkedlist(Node head, Node tail){
      this.head = head;
      this.tail = tail;
   }
   
   public boolean isEmpty(){
      return (head == null && tail == null ? true : false);
   }
   
   public void insert(String name, float price){
      if(isEmpty()){
         Node newNode = new Node(null, name, price, null);
         head = tail = newNode;
      } else {
         Node newNode = new Node(null, name, price, head);
         head = newNode;
         head.next.previous = head;
      }
   }
   
   public void search(String name){
      Node current = head;
      boolean checker = false;
         while(current != null && current.name != name && checker != true){
            try{
               if(current.name.equals(name)){
                  System.out.println("Item found.");
                  checker = true;
               }
               
               if(!current.name.equals(name) && current == tail){
                  System.out.println("Item not found.");
               }
               current = current.next;
            } catch(NullPointerException e){}          
         }
   }
   
   /*public boolean search(String name){
      Node current = head;
      boolean checker = false;
         while(current != null && current.name != name && checker != true){
            try{
               if(current.name.equals(name)){
                  return true;
               }
               
               if(!current.name.equals(name) && current == tail){
                  return false;
               }
               current = current.next;
            } catch(NullPointerException e){}          
         }
   return false;
   }*/
   
   public void modifyName(String name, String newName){
      Node current = head;
      boolean checker = false;
         while(current != null && current.name != name && checker != true){
            try{
               if(current.name.equals(name)){
                  current.name = newName;
                  System.out.println("Name successfully changed.");
                  checker = true;
               } else if(!current.name.equals(name) && current == tail){
                  System.out.println("Unsuccessful changing of name.");
               }
               current = current.next;
            } catch(NullPointerException e){}          
         }
   }
   
   public void modifyPrice(String name, float newPrice){
      Node current = head;
      boolean checker = false;
         while(current != null && current.name != name && checker != true){
            try{
               if(current.name.equals(name)){
                  current.price = newPrice;
                  System.out.println("Price successfully changed.");
                  checker = true;
               }else if(!current.name.equals(name) && current == tail){
                  System.out.println("Unsuccessful changing of price.");
               }
               current = current.next;
            } catch(NullPointerException e){}          
         }
   }
   
   public void calculate(){
      float total = 0;
      print();
      int counter = 0;
      System.out.println("Enter 0 if you wish to calculate your selected item(s).");
      do{
         System.out.print("Enter product name to be added to cart: ");
         String name = scan.next();
         total += getPrice(name);
         counter++;
      } while(counter < 2);
      System.out.printf("Total: P%.2f", total);  
   }
   
   public float getPrice(String name){
      Node current = head;
         while(current != null && current.name != name){
            try{
               if(current.name.equals(name)){
                  return current.price;   
               }else if(!current.name.equals(name) && current == tail){
                  System.out.println("Unsuccessful product not found.");
                  return -1;
               }
               current = current.next;
            } catch(NullPointerException e){}          
         }
      return -1;      
   }
   
   public void print(){
      Node current = tail;
      System.out.println("\tProduct Name and Price");
     //Apply String format
      System.out.println("No.\t\t" +"Name\t\t" +"Price");
      for(int i = 1; current != null; i++){
         System.out.println(i +".\t\t" +current.name +"\t\tP" +current.price);
         current = current.previous;
      }
      System.out.println();
   }   
}