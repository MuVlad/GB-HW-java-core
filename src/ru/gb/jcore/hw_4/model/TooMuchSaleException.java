package ru.gb.jcore.hw_4.model;

public class TooMuchSaleException extends RuntimeException {
    public TooMuchSaleException(String msg) {
        super(msg);
    }
}
