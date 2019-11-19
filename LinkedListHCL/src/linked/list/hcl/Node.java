/*
 *This class hold the link for the next node and 
 *the data that is being stored.
 */
package linked.list.hcl;

/**
 *
 * @author mohammedzaman
 */
public class Node {
   int data;
   Node next = null;
   /**
    * creating node in the List
    * @param data the integer to be stored
    */
   public Node(int data){
   this.data = data;
   }
   
   /**
    * creating node in the List
    * @param data the integer to be stored 
    * @param next the link to the next node 
    */
   public Node(int data , Node next){
   this.data = data;
   this.next = next;
   }
    
}
