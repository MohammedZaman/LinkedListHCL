/*
 *This class hold the link for the next node, The 
 * interger which is stored is also located within this class.
 */
package linked.list.hcl;

/**
 *
 * @author mohammedzaman
 */
public class Node {
   int data;
   Node next = null;
   
   public Node(int data){
   this.data = data;
   }
   
   public Node(int data , Node next){
   this.data = data;
   this.next = next;
   }
    
}
