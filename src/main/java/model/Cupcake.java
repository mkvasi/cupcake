package model;

import java.math.BigDecimal;

public class Cupcake {

private String name, top, bottom;
private int id;
private BigDecimal totalPrice;

    public Cupcake(int id, String name, String top, String bottom, BigDecimal totalPrice) {
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

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }


    
}
