package model;




import java.math.BigDecimal;


public class User {
    private String username, password, email;
    private java.math.BigDecimal balance;  

    public User(String username, String password, String email, BigDecimal balance) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    
       
       
}
