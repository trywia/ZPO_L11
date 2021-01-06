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
        return result;
    }
}
