package com.matthewyeso;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        CardStack deck = new CardStack(30);
        CardStack discarded = new CardStack(30);
        CardStack hand = new CardStack(30);

        Random randy = new Random();

        Card card1 = new Card(1, "Card");

        deck.fillDeck(card1);

        while (deck.getLength() > 0)
        {
            int randomCommand = randy.nextInt(3) + 1;
            int x = randy.nextInt(5) + 1;

            if (randomCommand == 1)
            {
                System.out.println("Drawing cards... ");
                if (deck.getLength() < x && deck.getLength() != 0)
                {
                    System.out.println("Drawing " + x + " cards ");

                    for (int i = 0; i < (x - (x - deck.getLength())); i++)
                    {
                        hand.push(deck.pop());
                    }
                }
                else if (deck.getLength() != 0)
                {
                    System.out.println("Drawing " + x + " cards ");

                    for (int i = 0; i < x; i++)
                    {
                        hand.push(deck.pop());
                    }
                }
            }
            else if (randomCommand == 2)
            {

                System.out.println("Discarding cards... ");
                if (hand.getLength() < x && hand.getLength() != 0)
                {
                    System.out.println("Discarding " + x + " cards ");
                    for (int i = 0; i < (x - (x - hand.getLength())); i++)
                    {
                        discarded.push(hand.pop());
                    }
                }
                else if (hand.getLength() != 0)
                {
                    System.out.println("Discarding " + x + " cards ");
                    for (int i = 0; i < x; i++)
                    {
                        discarded.push(hand.pop());
                    }
                }
                else
                {
                    System.out.println("No cards to discard ");
                }

            }
            else if (randomCommand == 3)
            {

                System.out.println("Getting cards from discard pile... ");

                if (discarded.getLength() < x && discarded.getLength() != 0)
                {
                    System.out.println("Drawing " + x + " cards from discard pile ");

                    for (int i = 0; i < (x - (x - discarded.getLength())); i++ )
                    {
                        hand.push(discarded.pop());
                    }
                }
                else if (discarded.getLength() != 0)
                {
                    System.out.println("Drawing " + x + " cards from discard pile ");

                    for (int i = 0; i < x; i++ )
                    {
                        hand.push(discarded.pop());
                    }
                }
                else
                {
                    System.out.println("No cards in discarded pile ");
                }

            }

            System.out.println("Cards on hand ");
            hand.printStack();
            System.out.println("Cards in hand " + hand.getLength());
            System.out.println("Cards left in deck " + deck.getLength());
            System.out.println("Cards in discard pile " + discarded.getLength());

            System.out.println("Press enter to continue ");

            try{System.in.read();}
            catch(Exception e){}

            System.out.println("=================================================== ");
        }
    }
}
