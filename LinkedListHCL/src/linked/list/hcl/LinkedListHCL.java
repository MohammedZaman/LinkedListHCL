/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        linkedList.displayAll();
    }
    
}
