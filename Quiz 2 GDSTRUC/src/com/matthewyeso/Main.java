package com.matthewyeso;

public class Main {

    public static void main(String[] args) {

        Player akira = new Player(  1,  "Akira", 100);
        Player kimmy = new Player(  2,  "Kimmy",  205);
        Player joe = new Player(  3,  "Joe",  24);
        Player matt = new Player( 4, "Matt", 70);
        Player tim = new Player( 5, "Tim", 66);
        Player tom = new Player( 6, "Tom", 99);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(akira);
        playerLinkedList.addToFront(kimmy);
        playerLinkedList.addToFront(joe);
        playerLinkedList.addToFront(matt);

//Testing out deleteFirst function

        playerLinkedList.printList();
        System.out.println(playerLinkedList.getSize());


        playerLinkedList.deleteFirst();
        playerLinkedList.printList();
        System.out.println(playerLinkedList.getSize());

//Testing out listSize counter that automatically updates after removing or adding

        playerLinkedList.addToFront(tim);
        playerLinkedList.printList();
        System.out.println(playerLinkedList.getSize());

//Testing out contains an index of
        System.out.println(playerLinkedList.checkList(matt));
        System.out.println(playerLinkedList.checkList(akira));
        System.out.println(playerLinkedList.checkList(tom));
    }
}
