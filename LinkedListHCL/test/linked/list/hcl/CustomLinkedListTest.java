/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked.list.hcl;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mohammedzaman
 */
public class CustomLinkedListTest {
     
    
   // Tests for sequence 
  
  /**
   * Testing for head sort
   */
  @Test
    public void testSequqnce() {
    //setting up the linked list
    CustomLinkedList linkedList = new CustomLinkedList();
    linkedList.insertSorted(5);
    linkedList.insertSorted(2);
    // size 
    String sequence  = linkedList.getSequence();
    assertEquals(sequence,"25");
    }
    
    /**
   * Testing for head sort
   */
  @Test
    public void testSequqnce2() {
    //setting up the linked list
    CustomLinkedList linkedList = new CustomLinkedList();
    linkedList.insertSorted(5);
    linkedList.insertSorted(2);
    // size 
    String sequence  = linkedList.getSequence();
    assertEquals(sequence,"25");
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Tests for Size 
    /**
     * testing if size of linked list is correct
     */
    @Test
    public void testSize1() {
    //setting up the linked list
    CustomLinkedList linkedList = new CustomLinkedList();
    linkedList.insertSorted(5);
    linkedList.insertSorted(1);
    linkedList.insertSorted(4);
    // size 
    int size  = linkedList.getSize();
    assertEquals(size,3);
    }
    
    
    /**
     * testing to getSize if linkedList is empty 
     */
    @Test
    public void testSize2(){
    CustomLinkedList linkedList = new CustomLinkedList();
    int size  = linkedList.getSize();
    assertEquals(size,0);
    }
    
    
    
    

        
}
