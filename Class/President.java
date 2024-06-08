/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication45;

/**
 *
 * @author UyVo
 */
public class President {
    private String Password;
    private String Account;

    public President(String Password, String Account) {
        this.Password = Password;
        this.Account = Account;
    }

    public President() {
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }

    @Override
    public String toString() {
        return "President{" + "Password=" + Password + ", Account=" + Account + '}';
    }
    
    
}
