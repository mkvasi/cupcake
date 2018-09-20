/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.math.BigDecimal;
import model.DataMapper;
import model.User;

/**
 *
 * @author leage
 */
public class Controller {

    DataMapper dataMapper = new DataMapper();

    public boolean checkUser(String username, String password, String email, BigDecimal balance) {

        if ((username == null) || (username.isEmpty())) {
            return false;
        }
        if ((password == null) || (password.isEmpty())) {
            return false;
        }
        if ((email == null) || (email.isEmpty())) {
            return false;
        }
        if ((balance == null) || (balance.intValue() < 0)) {
            return false;
        }

        return true;

    }

    public void addUser(String username, String password, String email, BigDecimal balance) {
        if (checkUser(username, password, email, balance)) {
            dataMapper.addUser(new User(username, password, email, balance));
        }

    }

    public boolean checkPassword(String username, String password) {
        User user = dataMapper.getUserInformation(username);
        return password.equals(user.getPassword());
    }

}
