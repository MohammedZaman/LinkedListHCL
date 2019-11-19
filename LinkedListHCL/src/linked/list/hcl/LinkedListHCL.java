/*
 *This class is created to excecute the Linked List methods 
 */
package linked.list.hcl;

/**
 *
 * @author mohammedzaman
 */
public class LinkedListHCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insertSorted(5);
        linkedList.insertSorted(7);
        linkedList.insertSorted(2);
      
       
        
      
        // dispays sequance with no spaced in bettwen i.e 257
        System.out.print(linkedList.getSequence());
    }
    
}
