import java.util.*;

public class Main{
   static Scanner scan = new Scanner(System.in);
   static Linkedlist l = new Linkedlist();
   static boolean repeat = true;
   static String name;
   static float price;
   
   static void menu(){
      System.out.println("1. Add new item");
      System.out.println("2. Delete item");
      System.out.println("3. Modify item name");
      System.out.println("4. Modify item price");
      System.out.println("5. Search Item");
      System.out.println("6. Calculate price");
      System.out.println("7. Print");
      System.out.println("0. Exit");
   }
   
   static void choose(int ch){
      switch(ch){
      case 1:
         System.out.print("Enter product name: ");
         name = scan.next();
         System.out.print("Enter product price: ");
         price = scan.nextFloat();;
         l.insert(name, price);
         break;
      
      case 2://delete item
         System.out.print("Enter product name you want to delete: ");
         String d = scan.next();
         //l.delete(d);
         break;
      
      case 3:
         System.out.print("Enter product name you want to change its name: ");
         name = scan.nextLine();
         System.out.print("Enter new name: ");
         String newName = scan.nextLine();
         l.modifyName(name, newName);
         break;
         
      case 4:
         System.out.print("Enter product name you want to change its name: ");
         name= scan.nextLine();
         System.out.print("Enter new price: ");
         price = scan.nextFloat();;
         l.modifyPrice(name, price);
         break;
         
         
      case 5:
         System.out.print("Search: ");
         String s = scan.next();
         l.search(s);   
         break;
      
      case 6:
         l.calculate();
         break;  
      
      case 7:
         l.print();
         break;    
         
      case 0:
         repeat = false;
         break;   
      }
   }
      
   public static void main(String[] args){
      do{
         menu();
         System.out.print("Enter choice: ");
         int ch = scan.nextInt();
         choose(ch);
      } while(repeat == true);
      /*String name = scan.next();
      int price = scan.nextInt();
      l.insert(name, price);
      l.insert("z", 9);
      l.insert("m", 6);
      l.insert("l", 7);
      l.insert("p", 8);
      String s = scan.next();
      l.print();
      l.search(s);*/
   }
}