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
public class CustomLinkedList {

    Node head;

    /**
     * This constructor creates the linked list with no nodes
     */
    public CustomLinkedList() {
    }

    /**
     * This constructor creates a new linked list with one node
     *
     * @param data the integer to be stored
     */
    public CustomLinkedList(int data) {
        head = new Node(data);
    }

    /**
     *
     * @param data the integer to be stored
     */
    public void insertSorted(int data) {
        Node newNode = new Node(data);

        if (head == null || newNode.data <= head.data) {

            newNode.next = head;
            head = newNode;

        } else {
            Node currentNode = head;
            while (currentNode.next != null && currentNode.next.data < newNode.data) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    /**
     * Display all node data values
     */
    public void displayAll() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;

        }
    }

}
