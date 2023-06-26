package ru.gb.jcore.hw_4.model;

public enum Sale {
    NO_SALE(0f), SALE_05(0.5f), SALE_10(10f), SALE_15(15f), SALE_20(20f);

    private float discountSize;

    Sale(float discountSize) {
        this.discountSize = discountSize;
    }

    public float getDiscountSize() {
        return discountSize;
    }
}
