package com.matthewyeso;

public class Card {

    private int cardNumber;
    private String cardName;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Card(int cardNumber, String cardName) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", cardName='" + cardName + '\'' +
                '}';
    }
}
