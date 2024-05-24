package com.raca.vendingmachine.model;

public class VendingItem {
    double price;
    int numPieces;

    VendingItem(double price, int numPieces) {
        this.price = price;
        this.numPieces = numPieces;
    }

    void restock(int pieces) {
        this.numPieces = this.numPieces + pieces;
    }

    void purchase(int pieces) {
        this.numPieces = this.numPieces - pieces;
    }
}
