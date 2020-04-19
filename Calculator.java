package com.minicalc.test;

public abstract class Calculator implements Divider, Multiplier {
    protected int total;

    public Calculator() {
        total = 1;
    }

    @Override
    public void multiply(int y){
        total = total * y;
    }

    @Override
    public void divide(int y) {
        total = total/y;
    }

    public abstract int calculate();


}