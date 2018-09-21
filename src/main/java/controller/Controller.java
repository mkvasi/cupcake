/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Bottom;
import model.Cupcake;
import model.DataMapper;
import model.LineItem;
import model.Topping;
import model.User;

/**
 *
 * @author leage
 */
public class Controller {

    DataMapper dataMapper = new DataMapper();

    public boolean checkUser(String username, String password, String email, double balance) {

        if ((username == null) || (username.isEmpty())) {
            return false;
        }
        if ((password == null) || (password.isEmpty())) {
            return false;
        }
        if ((email == null) || (email.isEmpty())) {
            return false;
        }
        if ((balance < 0)) {
            return false;
        }

        return true;

    }

    public void addUser(String username, String password, String email, double balance) {
        if (checkUser(username, password, email, balance)) {
            dataMapper.addUser(new User(username, password, email, balance));
        }

    }

    public boolean checkPassword(String username, String password) {
        User user = dataMapper.getUserInformation(username);
        return password.equals(user.getPassword());
    }

    public String showAllBottoms(ArrayList<Bottom> allBottoms) {

         String out = "<select>";

        for (Bottom bottom : allBottoms) {
            out += "<option value=\"h\">" + bottom.getName() + " " + bottom.getPrice() + "</option>";
        }

        out += "</select>";

        return out;
    }
    
    public String showAllTopping(ArrayList<Topping> allToppings) {

          String out = "<select>";

        for (Topping topping : allToppings) {
            out += "<option value=\"h\">" + topping.getName() + " " + topping.getPrice() + "</option>";
        }

        out += "</select>";

        return out;
    }

}
