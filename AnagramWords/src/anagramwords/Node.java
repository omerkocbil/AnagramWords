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
public class Node {

    String key;
    String value;
    Node next;

    Node(String key, String value) {
        this.key = key;
        this.value = value;
    }
    
    public static void main(String[] args) {
        ListHashMap hash = new ListHashMap(756);
        hash.put("aeelrst", "elaters ");
        hash.put("aeelrst", "stealer");
        hash.printTable();
    }
}
