package com.maximino.sample.model;

public class Greeting {
    private long id;
    private String expression;

    public Greeting(final long id, final String expression) {
        this.id = id;
        this.expression = expression;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getExpression() { return expression; }
    public void setExpression(String expression) { this.expression = expression; }
}
