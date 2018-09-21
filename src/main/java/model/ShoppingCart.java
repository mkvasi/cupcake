
package model;

import java.util.ArrayList;

public class ShoppingCart {
    
    private ArrayList<LineItem> arrLineItems;
    
    public void updateShoppingCart(LineItem lineItem){
        arrLineItems.add(lineItem);
    }

    public ArrayList<LineItem> getArrLineItems() {
        return arrLineItems;
    }
    
    
    
}
