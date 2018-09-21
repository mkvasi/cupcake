package model;

public class Cupcake {

private String top, bottom;
private int id;
private double totalPrice;

    public Cupcake(int id, String top, String bottom, double totalPrice) {
        this.id = id;
        this.top = top;
        this.bottom = bottom;
        this.totalPrice = totalPrice;
    }
    
    public Cupcake(String top, String bottom, double totalPrice) {
        this.top = top;
        this.bottom = bottom;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
