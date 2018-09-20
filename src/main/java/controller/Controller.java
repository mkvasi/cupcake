/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.math.BigDecimal;

/**
 *
 * @author leage
 */
public class Controller {

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
}