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
public class ListHashMap {

    LinkedList[][] table;

    ListHashMap(int size) {
        table = new LinkedList[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = new LinkedList();
            }
        }
    }

    void put(String key, String value) {
        int toplam = 0;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int num = (int) c;
            toplam = toplam + num;
        }
        int hash = toplam;
        hash = hash % table.length;
        Node t = table[hash][0].head;
        if (t == null) {
            table[hash][0].addFirst(key, value);
        } else if (!(t.key.equals(key))) {
            int i = 0;
            do {
                i++;
                t = table[hash][i].head;
                if (t == null) {
                    break;
                }
            } while (!(t.key.equals(key)));
            table[hash][i].addFirst(key, value);
        } else {
            while (t.next != null) {
                t = t.next;
            }
            table[hash][0].addFirst(key, value);
        }
    }

    String[] get(String key) {
        int toplam = 0;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            int num = (int) c;
            toplam = toplam + num;
        }
        int hash = toplam;
        hash = hash % table.length;
        Node t = table[hash][0].head;
        
        String[] kelimeler = new String[4];
        int i = 0;
        if (!(t.key.equals(key))) {
            int j = 0;
            do {
                j++;
                t = table[hash][j].head;
                if (t.key.equals(key)){
                    break;
                }
            } while (t != null);
            
            while (t != null) {
                kelimeler[i] = t.value;
                t = t.next;
                i++;
            }
        } 
        else {
            while (t != null) {
                kelimeler[i] = t.value;
                t = t.next;
                i++;
            }
        }
        
        return kelimeler;
    }

    void printTable() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print("[" + i + "] ");
                table[i][j].printList();
                System.out.println("");
            }
        }
    }

}
