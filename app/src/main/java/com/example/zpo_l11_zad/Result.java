package com.example.zpo_l11_zad;

public class Result {
    private String operation;
    private String expression;

    public Result(String operation, String expression) {
        this.operation = operation;
        this.expression = expression;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return expression;
    }
}
