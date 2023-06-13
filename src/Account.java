/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robin
 */
public class Account {
    double balance;
    int agency;
    int number;
    String owner;

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean withdraw(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    public boolean transfer(double value, Account account) {
        if (this.balance >= value) {
            this.balance -= value;
            account.deposit(value);
            return true;
        }
        return false;
    }
}
