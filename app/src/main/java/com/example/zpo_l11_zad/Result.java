package com.example.zpo_l11_zad;

public class Result {
    private String operation;
    private String expression;
    private String result;

    public Result(String operation, String expression, String result) {
        this.operation = operation;
        this.expression = expression;
        this.result = result;
    }

    @Override
    public String toString() {
        return result;
    }
}
