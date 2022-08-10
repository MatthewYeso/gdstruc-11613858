package com.matthewyeso;

import java.util.EmptyStackException;

public class CardStack {

    private Card[] stack;
    private int top;

    public CardStack(int capacity)
    {
        stack = new Card[capacity];
    }

    public void push(Card card)
    {
        if (top == stack.length)
        {
            Card[] newStack = new Card[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = card;
    }

    public Card pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Card removeCard = stack[--top];
        stack[top] = null;
        return removeCard;

    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public Card peak()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public void printStack()
    {
        System.out.println("Printing Stack ");
        for (int i = top - 1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }


    public void fillDeck(Card card)
    {
        for (int i = 0; i < 30; i++)
        {
            push(card);
        }

    }

    public int getLength()
    {
        int counter = 0;
        for (int i = top - 1; i >= 0; i--)
        {
            counter++;
        }
        return counter;
    }

}