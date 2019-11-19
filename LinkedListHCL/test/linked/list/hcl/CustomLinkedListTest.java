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

    // general Tests 
    /**
     * Empty constructor test 
     */
    @Test
    public void testConstructor1() {
        //setting up the linked list
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insertSorted(1);
        // sequence  
        String sequence = linkedList.getSequence();
        assertEquals(sequence, "1");
    }
    
     /**
     * Empty constructor with integer parameter 
     */
    @Test
    public void testConstructor2() {
        //setting up the linked list
        CustomLinkedList linkedList = new CustomLinkedList(5);
        linkedList.insertSorted(1);
        // sequence  
        String sequence = linkedList.getSequence();
        assertEquals(sequence, "15");
    }
    
    
    
    
    
    
    
    
    
    
    // Testing duplicates 
    /**
     * Testing for head sort with 2 sets if duplicates 
     */
    @Test
    public void testDuplicates1() {
        //setting up the linked list
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insertSorted(1);
        linkedList.insertSorted(2);
        linkedList.insertSorted(3);
        linkedList.insertSorted(2);
        linkedList.insertSorted(1);
        // sequence  
        String sequence = linkedList.getSequence();
        assertEquals(sequence, "11223");
    }
    
    
     /**
     * Testing for head sort with 3 duplicates 
     */
    @Test
    public void testDuplicates2() {
        //setting up the linked list
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insertSorted(5);
        linkedList.insertSorted(2);
        linkedList.insertSorted(2);
        linkedList.insertSorted(2);
        linkedList.insertSorted(1);
        // sequence  
        String sequence = linkedList.getSequence();
        assertEquals(sequence, "12225");
    }
    
    
    

    // Tests for sequence 
    /**
     * Testing for head sort with 2 elements
     */
    @Test
    public void testSequqnce1() {
        //setting up the linked list
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insertSorted(5);
        linkedList.insertSorted(2);
        // sequence  
        String sequence = linkedList.getSequence();
        assertEquals(sequence, "25");
    }

    /**
     * Testing if sorting works when placed in the middle of Linked List
     */
    @Test
    public void testSequqnce2() {
        //setting up the linked list
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insertSorted(5);
        linkedList.insertSorted(3);
        linkedList.insertSorted(0);
        linkedList.insertSorted(2);
        // sequence
        String sequence = linkedList.getSequence();
        assertEquals(sequence, "0235");
    }

    /**
     * Testing if sorting works when placed in the end of the list
     */
    @Test
    public void testSequqnce3() {
        //setting up the linked list
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insertSorted(5);
        linkedList.insertSorted(3);
        linkedList.insertSorted(2);
        linkedList.insertSorted(0);
        // sequence
        String sequence = linkedList.getSequence();
        assertEquals(sequence, "0235");
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
        int size = linkedList.getSize();
        assertEquals(size, 3);
    }

    /**
     * testing to getSize if linkedList is empty
     */
    @Test
    public void testSize2() {
        CustomLinkedList linkedList = new CustomLinkedList();
        int size = linkedList.getSize();
        assertEquals(size, 0);
    }

}
