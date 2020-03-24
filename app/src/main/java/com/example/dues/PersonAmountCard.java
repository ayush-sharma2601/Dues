package com.example.dues;

public class PersonAmountCard {
    String date;
    String amount;
    String product;

    public PersonAmountCard(String date, String amount, String product) {
        this.date = date;
        this.amount = amount;
        this.product = product;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
