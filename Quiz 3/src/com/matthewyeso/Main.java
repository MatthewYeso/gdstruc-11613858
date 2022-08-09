package com.matthewyeso;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    ArrayQueue queue = new ArrayQueue(5);
        ArrayQueue newQueue = new ArrayQueue( 10);

        Random randy = new Random();
        int gameStarted = 0;
        /*queue.add(new Player(1, "jojo",100));
        queue.add(new Player(2, "bobo" ,100));
        queue.add(new Player(3, "momo", 95));
        queue.add(new Player(4, "dodo", 90));

        queue.printQueue();


        System.out.println("After popping: " + queue.remove());
        queue.printQueue();*/
        Player newPlayer = new Player(1, "New Player ", 100);


        while(gameStarted < 10)
        {
            int randomNumber = randy.nextInt(7) + 1;
            for (int i = 0; i < randomNumber; i++)
            {
                newQueue.add(newPlayer);
            }
            System.out.println("Players in queue " + newQueue.size());
            newQueue.printQueue();

            if (newQueue.size() >= 5)
            {
                gameStarted++;
                System.out.println("Games Started " + gameStarted);



                for (int i = 0; i < 5; i++)
                {
                    newQueue.remove();
                }
            }

            System.out.println("Players left in queue " + newQueue.size());
            newQueue.printQueue();
            System.out.println("Press enter to continue");
            try{System.in.read();}
            catch(Exception e){}
        }
    }
}
