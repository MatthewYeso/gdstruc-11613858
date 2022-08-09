package com.matthewyeso;

public class Main {

    public static void main(String[] args) {

        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 640);
        Player deadlyjimmy = new Player(32, "DeadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 604);
        Player annieDro = new Player(6919, "C9 Annie", 593);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(ploo.getUserName(), ploo);
        hashTable.put(wardell.getUserName(), wardell);
        hashTable.put(deadlyjimmy.getUserName(), deadlyjimmy);
        hashTable.put(subroza.getUserName(), subroza);
        hashTable.put(annieDro.getUserName(), annieDro);

        hashTable.printHashTable();
        System.out.println(hashTable.get("C9 Annie"));
        hashTable.remove("Subroza");
        hashTable.printHashTable();
    }
}
