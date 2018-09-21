package model;

import java.math.BigDecimal;

public class Cupcake {

private String name, top, bottom;
private int id;
private double totalPrice;

    public Cupcake(int id, String name, String top, String bottom, double totalPrice) {
        this.id = id;
        this.name = name;
        this.top = top;
        this.bottom = bottom;
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    
}
