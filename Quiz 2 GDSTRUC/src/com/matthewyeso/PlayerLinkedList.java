package com.matthewyeso;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public PlayerNode deleteFirst() {
        if(head == null) {
            return null;
        }
        PlayerNode temp = head;
        head = head.getNextPlayer();
        temp.setNextPlayer(null);
        return temp;
    }

    public int getSize() {
        int size = 0;
        PlayerNode current = head;
        while (current != null) {
            size++;
            current = current.getNextPlayer();
        }
        return size;
    }

    public boolean checkList(Player playerToCheck) {
        int index = 0;
        PlayerNode current = head;
        while (current != null) {
            if(current.getPlayer() == playerToCheck) {
                System.out.print("Index of " + index + " ");
                return true;
            }
            else{
                current = current.getNextPlayer();
            }
            index++;
        }
        return false;
    }

}