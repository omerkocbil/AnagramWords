/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagramwords;

/**
 *
 * @author jan
 */
public class LinkedList {

    Node head;

    void addFirst(String key, String value) {
        Node n = new Node(key, value);
        n.next = head;
        head = n;
    }

    Node removeFirst() {

        Node temp = head;
        head = head.next;
        return temp;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print("[" + temp.key + " : " + temp.value + "] -> ");
            temp = temp.next;
        }
    }
    
}
